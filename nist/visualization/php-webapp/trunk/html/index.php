<?php

?>

<html>

<head>
  <title>NIST Visualization</title>

  <script type="text/javascript"
      src="javascript/dojo-release-1.4.2-src/dojo/dojo.js"
      djConfig="parseOnLoad: true"></script>

  <style type="text/css">
    html, body { width: 100%; height: 100%; margin: 0; padding: 15px; }
    #borderContainer { width: 1000px; height: 500px;
        margin-left: auto; margin-right: auto; border: 3px solid black;
        padding: 5px; }
  </style>

  <link rel="stylesheet" type="text/css"
      href="javascript/dojo-release-1.4.2-src/dojo/resources/dojo.css" />
  <link rel="stylesheet" type="text/css"
      href="javascript/dojo-release-1.4.2-src/dijit/themes/tundra/tundra.css" />

  <script type="text/javascript">
  dojo.require("dojox.charting.Chart2D");
  dojo.require("dojox.charting.themes.Wetland");
  dojo.require("dijit.layout.BorderContainer");
  dojo.require("dijit.layout.ContentPane");
  dojo.require("dijit.layout.AccordionContainer");
  dojo.require("dijit.layout.AccordionPane");

  var accelerationChart;
  var strainChart;
  var frequencyChart;
  dojo.addOnLoad(function() {
    loadAccelerationChart();
    loadStrainChart();
    loadFrequencyChart();
  });
  var accelerationChartOffset = 0;
  var strainChartOffset = 0;
  var frequencyChartOffset = 0;
  </script>
</head>


<body class="tundra">

<div dojoType="dijit.layout.BorderContainer" design="headline" gutters="true"
    liveSplitters="false" id="borderContainer">
  <div dojoType="dijit.layout.ContentPane" splitter="false" region="top"
      style="padding: 5px; vertical-align: bottom; height: 80px;">
    <table width="100%">
      <tr>
        <td valign="center" style="width: 100px;">
          <img src="http://eecs.umich.edu/eecs/images/logo.gif"
              style="margin-left: auto; margin-right: auto;" />
        </td>
        <td style="text-align: right; padding-right: 25px;">
          <font style="font-size: 20pt; font-weight: bold;">
            NIST - Real-Time Sensor Monitoring
          </font>
        </td>
      </tr>
    </table>
  </div>
  <div dojoType="dijit.layout.ContentPane" splitter="false" region="leading"
        style="width: 400px; padding: 10px;">
    <div style="padding-left: 5px; padding-right: 5px;
        background-color: #EEEEEE; border: thin dashed gray;">
      <p>Select a structure from the drop-down box.  Semi-real-time results will
      begin to populate the three graphs to the right.</p>

      <p>We're currently providing the following three views; click the
        title-panes to reveal them:</p>
      <ul>
        <li>Acceleration Graph - </li>
        <li>Frequency vs. Strain Graph - </li>
        <li>Frequency vs. FFT Graph - </li>
      </ul>
    </div>

    <div style="margin-top: 5px; border: thin dashed gray; padding: 5px;">
      <i>Select a structure:</i><br /><br />
      <b>Structure:</b> <select><option>Test Bridge</option></select>
    </div>
  </div>

  <div dojoType="dijit.layout.AccordionContainer" minSize="20" region="center">
    <div dojoType="dijit.layout.AccordionPane" title="Acceleration Monitoring"
        style="padding: 10px;"
        selected="true">
      <b>Acc(mg)</b>
      <div id="accelerationChart" style="width: 550px; height: 240px;"></div>
      <center><b>Time(sec)</b></center>
    </div>

    <div dojoType="dijit.layout.AccordionPane" title="Strain Monitoring"
        style="padding: 10px;">
      <b>PSD(mg/Hz)</b>
      <div id="strainChart" style="width: 550px; height: 240px;"></div>
      <center><b>Freq(Hz)</b></center>
    </div>

    <div dojoType="dijit.layout.AccordionPane" title="Frequency"
        style="padding: 10px;">
      <b>FFT(mg)</b>
      <div id="frequencyChart" style="width: 550px; height: 240px;"></div>
      <center><b>Freq(Hz)</b></center>
    </div>
  </div>
</div>

<script type="text/javascript">
function loadAccelerationChart() {
  accelerationChart = new dojox.charting.Chart2D("accelerationChart");
  accelerationChart.addPlot("default", {
      type: "Lines",
      tension: 3
    });
  accelerationChart.addAxis("x", {
      //min: 0,
      //max: 70,
      majorTickStep: 5,
      fixLower: "major",
      fixUpper: "major"
    });
  accelerationChart.addAxis("y", {
      //min: -20,
      //max: 20,
      vertical: true,
      fixLower: "major",
      fixUpper: "major"
    });
  accelerationChart.setTheme(dojox.charting.themes.Wetland);
  dojo.xhrGet({
    url: "/nist-visualization/loadAccelerationData.php?offset=" + 0,

    handleAs: "json",

    load: function(response, ioArgs) {
      accelerationChart.addSeries("Accel", response.accelData);
      accelerationChart.render();
    }
  });
  setInterval(updateAccelerationChart, 3000);
}

function loadStrainChart() {
  strainChart = new dojox.charting.Chart2D("strainChart");
  strainChart.addPlot("default", {
      type: "Lines",
      tension: 3
    });
  strainChart.addAxis("x", {
      min: 0,
      max: 70,
      majorTickStep: 5,
      fixLower: "major",
      fixUpper: "major"
    });
  strainChart.addAxis("y", {
      //min: 0,
      //max: 150,
      vertical: true,
      fixLower: "major",
      fixUpper: "major"
    });
  strainChart.setTheme(dojox.charting.themes.Wetland);
  dojo.xhrGet({
    url: "/nist-visualization/loadStrainData.php?offset=" + 0,

    handleAs: "json",

    load: function(response, ioArgs) {
      strainChart.addSeries("Strain", response.strainData);
      strainChart.render();
    }
  });
  //intervalID = setInterval(updateStrainChart, 3000);
}

function loadFrequencyChart() {
  frequencyChart = new dojox.charting.Chart2D("frequencyChart");
  frequencyChart.addPlot("default", {
      type: "StackedAreas",
      tension: 3
    });
  frequencyChart.addAxis("x", {
      //min: 0,
      //max: 70,
      majorTickStep: 5,
      text: "Bip",
      fixLower: "major",
      fixUpper: "major"
    });
  frequencyChart.addAxis("y", {
      //min: 0,
      //max: 5000,
      vertical: true,
      fixLower: "major",
      fixUpper: "major"
    });
  frequencyChart.setTheme(dojox.charting.themes.Wetland);
  dojo.xhrGet({
    url: "/nist-visualization/loadFrequencyData.php?offset=" + 0,

    handleAs: "json",

    load: function(response, ioArgs) {
      frequencyChart.addSeries("Frequency", response.frequencyData);
      frequencyChart.render();
    }
  });
  // setInterval(updateFrequencyChart, 3000);
}

function updateAccelerationChart() {
  dojo.xhrGet({
    url: "/nist-visualization/loadAccelerationData.php?offset=" + (accelerationChartOffset += 5),

    handleAs: "json",

    load: function(response, ioArgs) {
      accelerationChart.updateSeries("Accel", response.accelData);
      accelerationChart.render();
    }
  });
}

function updateStrainChart() {
  dojo.xhrGet({
    url: "/nist-visualization/loadStrainData.php?offset=" + (strainChartOffset += 5),

    handleAs: "json",

    load: function(response, ioArgs) {
      strainChart.updateSeries("Strain", response.strainData);
      strainChart.render();
    }
  });
}

function updateFrequencyChart() {
  dojo.xhrGet({
    url: "/nist-visualization/loadFrequencyData.php?offset=" + (frequencyChartOffset += 5),

    handleAs: "json",

    load: function(response, ioArgs) {
      frequencyChart.updateSeries("Frequency", response.frequencyData);
      frequencyChart.render();
    }
  });
}
</script>

</body>

</html>