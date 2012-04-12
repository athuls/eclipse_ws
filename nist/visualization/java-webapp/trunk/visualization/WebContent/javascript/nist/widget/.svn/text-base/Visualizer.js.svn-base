dojo.provide("nist.widget.Visualizer");

dojo.require("dijit._Widget");
dojo.require("dijit._Templated");

dojo.require("nist.service");
dojo.require("dojox.charting.themes.Wetland");
dojo.require("dojox.charting.Chart2D");

dojo.require("dijit.layout.BorderContainer");
dojo.require("dijit.layout.ContentPane");
dojo.require("dijit.layout.AccordionContainer");
dojo.require("dijit.layout.AccordionPane");

dojo.require("dojo.date.locale");

/**
 * @class nist.widget.Visualizer
 */
dojo.declare("nist.widget.Visualizer",
    [ dijit._Widget, dijit._Templated ],

    {
      /*
       * Properties
       */

      /** @property {DOMSelect} structureSelect */
      structureSelect: null,
      /** @property {DOMSelect} unitSelect */
      unitSelect: null,
      /** @property {DOMSelect} channelSelect */
      channelSelect: null,

      /** @property {boolean} lastUnitSelected */
      lastUnitSelected: -1,
      /** @property {boolean} lastChannelSelected */
      lastChannelSelected: -1,

      /** @property {DOMSpan} displayStatus */
      displayStatus: null,

      /** @property {dojox.charting.Chart2D} accelerationChart */
      accelerationChart: null,

      /** @property {DOMButton} buttonShowDemo */
      buttonShowDemo: null,
      
      buttonStop: null,

      // Charting state-properties
      sizeOfLastDataSet: -1,
      /** @property {boolean} beforeData */
      beforeData: true,
      /** @property {int} lastMean */
      lastMean: 33333,
      /** @property {int[]} data */
      data: [],
      
      /** @property offset The offset of the demo data */
      offset: 0,

      /** @property The ID of the running JS "thread" */
      currentProcess: -1,
      
      /*
       * Functions - Widget
       */

      /**
       * Inherited from dijit._Widget
       * @function postMixInProperties
       */
      postMixInProperties: function() {

        // Loading the structures list
        nist.service.structures({ })
            .addCallback(this, function(structures) {
              structures = eval(structures);
              if (structures.length == 0) {
                this.structureDisplay.innerHTML = "<font color='red'>There is no structure currently defined.</font>";
                return;
              } else if (structures.length > 1) {
                console.warn("Multiple structures found");
              }
              var structure = structures[0];

              this.structureDisplay.innerHTML = structure.name;
            });

        // Loading the units
        nist.service.units({ })
            .addCallback(this, function(units) {
              var selectBoxOptions = this.unitSelect.options;
              for (var i = 0; i < units.length; ++i) {
                var unit = units[i];
                selectBoxOptions[selectBoxOptions.length]
                    = new Option("Unit " + unit.identifier + ": " + unit.model,
                        unit.id, false, false);
              }
            });

        // Adding functionality to unit-box
        dojo.connect(this.unitSelect, "onchange",
            dojo.hitch(this, function() {
              if (this.unitSelect.selectedIndex == 0) {
                this.lastUnitSelected = -1;
                this.channelSelect.selectedIndex = 0;
                this.channelSelect.options.length = 1;
                this.updateStatus();
                return;
              }
              if (this.lastUnitSelected == this.unitSelect.selectedIndex) {
                return;
              }
              
              var unitOptions = this.unitSelect.options;
              var unitID = unitOptions[this.unitSelect.selectedIndex].value;
              this.lastUnitSelected = this.unitSelect.selectedIndex;

              this.channelSelect.options.length = 1;
              this.channelSelect.selectedIndex = 0;
              this.lastChannelSelected = -1;
              nist.service.channels({ unitID: unitID })
                  .addCallback(this, function(channels) {
                    channels = eval(channels);
                    
                    var channelOptions = this.channelSelect.options;
                    for (var i = 0; i < channels.length; ++i) {
                      var channel = channels[i];
                      channelOptions[channelOptions.length]
                          = new Option("Channel: " + channel.number,
                              channel.id, false, false);
                    }
                  });
            }));

        // Adding functionality to channel-box (triggering chart-population)
        dojo.connect(this.channelSelect, "onchange",
            dojo.hitch(this, function() {
              if (this.channelSelect.selectedIndex == 0) {
                this.lastChannelSelected = -1;
                this.updateStatus();
                return;
              }
              if (this.lastChannelSelected == this.channelSelect.selectedIndex) {
                return;
              }
              
              // Resetting state machine
              this.beforeData = true;
              this.lastMean = 33333;
              this.data = [];
              
              var channelOptions = this.channelSelect.options;
              var channelID = channelOptions[this.channelSelect.selectedIndex].value;

              this.lastChannelSelected = this.channelSelect.selectedIndex;

              // Initially populating chart with mean data
              var newArray = new Array();
              for (var k = 0; k < 250; ++k) {
                newArray.push(this.lastMean);
              }
              this.accelerationChart.addSeries("Accel", newArray);

              // Starting the live-updating
              this.currentProcess = setInterval(dojo.hitch(this, function() {
                  nist.service.data({ channelID: channelID })
                      .addCallback(this, function(response) {
                        response = eval("(" + response + ")");

                        // State machine logic
                        this.data = response.data;
                        console.debug(this.beforeData);
                        /*
                         * If no data, populate with mean-data
                         */
                        if (! this.data) {
                          console.debug("No data in last 5 seconds");
                          
                          this.sizeOfLastDataSet = 0;
                          
                          var newArray = new Array();
                          for (var k = 0; k < 250; ++k) {
                            newArray.push(this.lastMean);
                          }
                          this.data = newArray;
                          this.beforeData = true;
                        }
                        /*
                         * If fewer than 250 data points, and we're before the
                         *   point of getting 250 points, fill mean-data into
                         *   the beginning of the data array 
                         */
                        else if (this.data.length < 250 && this.beforeData) {
                          var newArray = new Array();
                          console.debug("(length: " + this.data.length + ")");
                          this.sizeOfLastDataSet = this.data.length;
                          for (var k = 0; k < (250 - this.data.length); ++k) {
                            newArray.push(this.lastMean);
                          }
                          this.data = newArray.concat(this.data);
                        }
                        /*
                         * If we're getting 250 data points, update the mean
                         */
                        else if (this.data.length == 250) {
                          this.beforeData = false;
                          
                          this.sizeOfLastDataSet = 250;
                          
                          // Updating the mean
                          this.lastMean = this.calculateMean(this.data); 
                        }
                        /*
                         * If fewer than 250 data points, and we're after the
                         *   point of getting 250 points, append mean-data to
                         *   the end of the data array 
                         */
                        else if (this.data.length < 250 && ! this.beforeData) {
                          this.sizeOfLastDataSet = this.data.length;
                          
                          var newArray = new Array();
                          for (var k = 0; k < (250 - this.data.length); ++k) {
                            newArray.push(this.lastMean);
                          }
                          this.data = this.data.concat(newArray);
                        }
                        
                        if (this.lastMean > 0) {
                          console.debug(this.lastMean);
                          this.normalizeArray(this.data, this.lastMean);
                        }
                        //console.debug("Massaged Data:", this.data);
                        this.accelerationChart.updateSeries("Accel", this.data);
                        this.accelerationChart.render();
                      });
                  }), 500);
              
              console.debug("Channel changed");
              
              this.updateStatus();
            }));
      }, 
      
      /**
       * Inherits from dijit._Widget
       * @function postCreate
       */
      postCreate: function() {
        this.loadAccelerationChart();
        
        // Connecting Demo Functionality
        dojo.connect(this.buttonShowDemo, "onclick", this, function() {
          this.buttonShowDemo.disabled = true;

          var mean = this.calculateMean(this.demoData);
          console.debug("mean: " + mean);
          this.normalizeArray(this.demoData, mean);
          console.debug("Array normalized");

          this.accelerationChart.addSeries("Accel", this.demoData);
          this.accelerationChart.setAxisWindow("x", 6, 0);
          this.accelerationChart.render();
          
          this.currentProcess = setInterval(dojo.hitch(this, function() {
              if ((this.offset += 10) > 500) {
                this.offset = 0;
              }
              this.accelerationChart.setAxisWindow("x", 6, this.offset);
              this.accelerationChart.render();
            }), 1000);
        });
        
        
        // Adding stop-functionality
      dojo.connect(this.buttonStop, "onclick", dojo.hitch(this, function() {
          if (this.currentProcess != -1) {
            clearInterval(this.currentProcess);
            this.buttonShowDemo.disabled = false;
          }
        }));
      },


      /*
       * Functions
       */

      /**
       * @function normalizeArray
       * @param array
       * @param mean
       */
      normalizeArray: function(array, mean) {
        for (var i = 0; i < array.length; ++i) {
          array[i] -= mean;
          array[i] *= 5.0;
          array[i] /= 65535.0;
          array[i] /= 0.833;
        }
      },
      
      /**
       * @function calculateMean
       * @param array
       */
      calculateMean: function(array) {
        var sum = 0;
        for (var i = 0; i < array.length; ++i) {
          sum += array[i];
        }
        return sum / array.length;
      },
      
      /**
       * @function loadAccelerationChart
       */
      loadAccelerationChart: function() {
        this.accelerationChart = new dojox.charting.Chart2D(this.accelerationChart);
        this.accelerationChart.addPlot("default", {
          type: "Lines",
          tension: 3
        });
        this.accelerationChart.addAxis("x", {
          majorTickStep: 50,
          minorTicks: false,
          microTicks: false,
//          labels: [{value: 1, text: "5s Ago"}, {value: 2, text: "4s Ago"},
//                   {value: 3, text: "3s Ago"}, {value: 4, text: "2s Ago"},
//                   {value: 5, text: "1s AgoMay"}]
//                   ,
          labelFunc: function(def, number, precision) {
            // return 5 - number;
            return (number / 50);
//              var date = new Date(number);
//              return dojo.date.locale.format(date,
//                  { selector: "time", timePattern: "HH:mm:ss zzz" })
          }
        });
        this.accelerationChart.addAxis("y", {
          min: -0.05,
          max: 0.05,
          majorTickStep: 0.05,
          labels: [{value: -0.05, text: "-0.05mg" },
                   {value: 0.0, text: "0.0mg" },
                   {value: 0.05, text: "0.05mg" }],
          vertical: true,
          fixLower: "major",
          fixUpper: "major"
        });
        this.accelerationChart.setTheme(dojox.charting.themes.Wetland);
      },

      /**
       * @function updateStatus
       */
      updateStatus: function() {
        if (this.lastUnitSelected == -1 || this.lastChannelSelected == -1) {
          this.displayStatus.innerHTML = "No current monitoring";
          return;
        }
        
        this.displayStatus.innerHTML = "Now monitoring ["
            + this.unitSelect.options[this.lastUnitSelected].text
            + "] [" + this.channelSelect.options[this.lastChannelSelected].text + "]";
      },
      
      /*
       * Properties - dijit._Templated
       */
      
      /** @property widgetsInTemplate */
      widgetsInTemplate: true,
      /** @property templatePath */
      templatePath: dojo.moduleUrl("nist", "widget/templates/Visualizer.html"),
      
      /** @property demoData */
      demoData: [33254,33266,33252,33255,33258,33255,33279,33267,33254,33262,33255,33261,33249,33263,33259,33257,33251,33258,33261,33261,33251,33263,33261,33266,33251,33263,33252,33271,33251,33267,33261,33263,33264,33256,33259,33265,33261,33265,33256,33258,33260,33269,33253,33259,33261,33264,33255,33263,33257,33256,33253,33260,33256,33260,33263,33253,33255,33267,33263,33258,33263,33267,33263,33258,33259,33255,33269,33255,33257,33254,33263,33256,33267,33255,33259,33263,33263,33259,33264,33259,33257,33263,33269,33255,33263,33247,33265,33261,33257,33259,33266,33252,33263,33258,33269,33263,33257,33256,33263,33255,33100,33091,33101,33102,33099,33105,33108,33103,33099,33105,33101,33097,33087,33099,33103,33107,33101,33103,33105,33105,33095,33103,33109,33103,33107,33095,33099,33096,33152,33119,33077,33111,33063,33151,33049,33153,33080,33111,33119,33085,33123,33089,33106,33104,33085,33111,33113,33097,33106,33091,33112,33099,33093,33109,33098,33106,33107,33094,33110,33093,33103,33102,33102,33108,33097,33096,33104,33095,33109,33095,33111,33099,33105,33092,33106,33094,33093,33105,33099,33101,33096,33103,33111,33088,33111,33095,33111,33098,33100,33111,33103,33091,33104,33101,33103,33098,33102,33100,33103,33110,33104,33105,33103,33099,33103,33108,33102,33096,33101,33104,33099,33095,33119,33093,33113,33102,33097,33101,33098,33095,33072,33131,33115,33122,33083,33096,33101,33103,33103,33105,33101,33098,33109,33110,33101,33111,33104,33107,33102,33111,33106,33102,33109,33108,33097,33106,33099,33108,33104,33095,33099,33104,33092,33101,33099,33109,33099,33113,33095,33109,33096,33109,33104,33106,33098,33111,33101,33104,33102,33099,33098,33101,33093,33106,33099,33112,33100,33100,33098,33091,33115,33091,33099,33105,33105,33103,33099,33108,33097,33111,33101,33105,33105,33100,33105,33101,33109,33099,33091,33100,33112,33108,33101,33110,33109,33105,33113,33103,33108,33103,33095,33112,33103,33109,33109,33104,33111,33103,33101,33111,33106,33101,33106,33097,33111,33103,33114,33101,33111,33101,33108,33109,33101,33111,33105,33102,33107,33095,33112,33102,33107,33100,33105,33107,33111,33103,33107,33110,33103,33107,33097,33107,33103,33109,33115,33103,33110,33107,33105,33101,33108,33103,33111,33111,33105,33108,33098,33107,33097,33117,33090,33109,33097,33093,33108,33087,33128,33101,33101,33101,33101,33093,33115,33113,33115,33101,33109,33101,33100,33103,33102,33103,33100,33103,33111,33099,33105,33105,33103,33109,33103,33110,33107,33103,33104,33111,33108,33111,33101,33109,33099,33111,33103,33109,33107,33113,33103,33106,33103,33103,33109,33108,33103,33108,33098,33105,33104,33109,33106,33097,33107,33099,33108,33103,33110,33110,33104,33108,33105,33114,33107,33106,32829,33235,32975,33230,32963,33229,33023,33120,32990,33133,33173,33073,33149,33166,33005,33199,33086,33130,33098,33111,33101,33062,32967,33235,33006,33201,32999,33237,33003,33207,33027,33208,32977,33252,32995,33223,33015,33174,33050,33161,33061,33151,33089,33131,33103,33115,33111,33103,33124,33081,33113,33101,33110,33112,33098,33097,33105,33104,33108,33115,33102,33105,33102,33108,33105,33104,33101,33103,33104,33111,33103,33109,33103,33115,33106,33100,33113,33105,33104,33111,33109,33114,33093,33111,33107,33103,33102,33111,33101,33113,33113,33097,33117,33097,33105,33113,33103,33111,33103,33104,33107,33101,33106,33103,33105,33103,33105,33105,33103,33103,33103,33095,33103,33111,33103,33106,33103,33115,33103,33105,33109,33105,33108,33097,33103,33109,33108,33111,33111,33104,33098,33106,33101,33105,33101,33106,33113,33104,33110,33096,33103,33115,33111,33106,33105,33107,33111,33097,33103,33109,33103,33103,33113,33101,33104,33110,33109,33102]
    }
);