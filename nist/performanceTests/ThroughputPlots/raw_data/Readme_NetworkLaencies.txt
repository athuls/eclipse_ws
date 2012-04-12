Latency

PING cheetah.eecs.umich.edu (141.212.110.188): 56 data bytes
64 bytes from 141.212.110.188: icmp_seq=0 ttl=64 time=11.068 ms
64 bytes from 141.212.110.188: icmp_seq=1 ttl=64 time=10.596 ms
c64 bytes from 141.212.110.188: icmp_seq=2 ttl=64 time=10.507 ms
64 bytes from 141.212.110.188: icmp_seq=3 ttl=64 time=10.203 ms
c64 bytes from 141.212.110.188: icmp_seq=4 ttl=64 time=9.668 ms
64 bytes from 141.212.110.188: icmp_seq=5 ttl=64 time=10.412 ms
64 bytes from 141.212.110.188: icmp_seq=6 ttl=64 time=10.548 ms
^C
delhi-/var/log% date
Mon Jul  5 10:11:12 EDT 2010

----------------------------


PING cheetah.eecs.umich.edu (141.212.110.188): 56 data bytes
64 bytes from 141.212.110.188: icmp_seq=0 ttl=64 time=49.941 ms
64 bytes from 141.212.110.188: icmp_seq=1 ttl=64 time=49.571 ms
64 bytes from 141.212.110.188: icmp_seq=2 ttl=64 time=50.901 ms
c64 bytes from 141.212.110.188: icmp_seq=3 ttl=64 time=50.495 ms
^R
64 bytes from 141.212.110.188: icmp_seq=4 ttl=64 time=50.241 ms
64 bytes from 141.212.110.188: icmp_seq=5 ttl=64 time=50.435 ms
64 bytes from 141.212.110.188: icmp_seq=6 ttl=64 time=50.704 ms
64 bytes from 141.212.110.188: icmp_seq=7 ttl=64 time=49.542 ms
64 bytes from 141.212.110.188: icmp_seq=8 ttl=64 time=51.217 ms
64 bytes from 141.212.110.188: icmp_seq=9 ttl=64 time=51.045 ms
64 bytes from 141.212.110.188: icmp_seq=10 ttl=64 time=50.572 ms
^C
--- cheetah.eecs.umich.edu ping statistics ---
11 packets transmitted, 11 packets received, 0.0% packet loss
round-trip min/avg/max/stddev = 49.542/50.424/51.217/0.533 ms
 delhi-/var/log% date
Mon Jul  5 10:12:47 EDT 2010

Initializing Communicator
Attempting to retrieve SenStore
Sensor: 29
Accel ID: 27
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 56.0sec.
Data throughput in KBytes/second = 0.35714285714285715
Data consisting of 20 bytes; batch size = 10; average time per 1000 cycles = 5.3sec.
Data throughput in KBytes/second = 3.7735849056603774
Data consisting of 20 bytes; batch size = 100; average time per 1000 cycles = 0.54sec.
Data throughput in KBytes/second = 37.03703703703704
Data consisting of 20 bytes; batch size = 1000; average time per 1000 cycles = 0.107sec.
Data throughput in KBytes/second = 186.9158878504673
Data consisting of 20 bytes; batch size = 10000; average time per 1000 cycles = 0.0277sec.
Data throughput in KBytes/second = 722.0216606498195
Data consisting of 20 bytes; batch size = 50000; average time per 1000 cycles = 0.01782sec.
Data throughput in KBytes/second = 1122.334455667789
Done!
Initializing Communicator
Attempting to retrieve SenStore
accelSignalID = 27
Signal  has 1 times (3 data points)
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 165.0sec.
Data throughput in KBytes/second = 0.12121212121212122
accelSignalID = 27
Signal  has 11 times (33 data points)
Data consisting of 20 bytes; batch size = 11; average time per 1000 cycles = 15.272727272727273sec.
Data throughput in KBytes/second = 1.3095238095238095
accelSignalID = 27
Signal  has 99 times (297 data points)
Data consisting of 20 bytes; batch size = 99; average time per 1000 cycles = 1.7171717171717171sec.
Data throughput in KBytes/second = 11.647058823529411
accelSignalID = 27
Signal  has 1001 times (3003 data points)
Data consisting of 20 bytes; batch size = 1001; average time per 1000 cycles = 0.3106893106893107sec.
Data throughput in KBytes/second = 64.37299035369774
accelSignalID = 27
Signal  has 9999 times (29997 data points)
Data consisting of 20 bytes; batch size = 9999; average time per 1000 cycles = 0.0659065906590659sec.
Data throughput in KBytes/second = 303.4597875569044
accelSignalID = 27
Signal  has 49999 times (149997 data points)
Data consisting of 20 bytes; batch size = 49999; average time per 1000 cycles = 0.02268045360907218sec.
Data throughput in KBytes/second = 881.8165784832452
Done!
----------------------------------------------------------------

 delhi-/var/log% ipfw pipe 1 config delay 100ms
 delhi-/var/log% ping cheetah.eecs.umich.edu
PING cheetah.eecs.umich.edu (141.212.110.188): 56 data bytes
64 bytes from 141.212.110.188: icmp_seq=0 ttl=64 time=100.662 ms
64 bytes from 141.212.110.188: icmp_seq=1 ttl=64 time=99.800 ms
c64 bytes from 141.212.110.188: icmp_seq=2 ttl=64 time=100.593 ms
^R
64 bytes from 141.212.110.188: icmp_seq=3 ttl=64 time=100.333 ms
^C
--- cheetah.eecs.umich.edu ping statistics ---
4 packets transmitted, 4 packets received, 0.0% packet loss
round-trip min/avg/max/stddev = 99.800/100.347/100.662/0.339 ms
 delhi-/var/log% date
Mon Jul  5 10:14:19 EDT 2010

Initializing Communicator
Attempting to retrieve SenStore
Sensor: 30
Accel ID: 28
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 104.0sec.
Data throughput in KBytes/second = 0.19230769230769232
Data consisting of 20 bytes; batch size = 10; average time per 1000 cycles = 10.4sec.
Data throughput in KBytes/second = 1.9230769230769231
Data consisting of 20 bytes; batch size = 100; average time per 1000 cycles = 1.05sec.
Data throughput in KBytes/second = 19.047619047619047
Data consisting of 20 bytes; batch size = 1000; average time per 1000 cycles = 0.21sec.
Data throughput in KBytes/second = 95.23809523809524
Data consisting of 20 bytes; batch size = 10000; average time per 1000 cycles = 0.0439sec.
Data throughput in KBytes/second = 455.58086560364467
Data consisting of 20 bytes; batch size = 50000; average time per 1000 cycles = 0.03378sec.
Data throughput in KBytes/second = 592.0663114268798
Done!
Initializing Communicator
Attempting to retrieve SenStore
accelSignalID = 28
Signal  has 1 times (3 data points)
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 316.0sec.
Data throughput in KBytes/second = 0.06329113924050633
accelSignalID = 28
Signal  has 11 times (33 data points)
Data consisting of 20 bytes; batch size = 11; average time per 1000 cycles = 28.90909090909091sec.
Data throughput in KBytes/second = 0.6918238993710691
accelSignalID = 28
Signal  has 99 times (297 data points)
Data consisting of 20 bytes; batch size = 99; average time per 1000 cycles = 3.2323232323232323sec.
Data throughput in KBytes/second = 6.1875
accelSignalID = 28
Signal  has 1000 times (3000 data points)
Data consisting of 20 bytes; batch size = 1000; average time per 1000 cycles = 0.461sec.
Data throughput in KBytes/second = 43.38394793926247
accelSignalID = 28
Signal  has 10000 times (30000 data points)
Data consisting of 20 bytes; batch size = 10000; average time per 1000 cycles = 0.1056sec.
Data throughput in KBytes/second = 189.3939393939394
accelSignalID = 28
Signal  has 49999 times (149997 data points)
Data consisting of 20 bytes; batch size = 49999; average time per 1000 cycles = 0.042660853217064344sec.
Data throughput in KBytes/second = 468.81387716830756
Done!
---------------------------------------------

 delhi-/var/log% ping cheetah.eecs.umich.edu
PING cheetah.eecs.umich.edu (141.212.110.188): 56 data bytes
64 bytes from 141.212.110.188: icmp_seq=0 ttl=64 time=0.205 ms
64 bytes from 141.212.110.188: icmp_seq=1 ttl=64 time=0.409 ms
64 bytes from 141.212.110.188: icmp_seq=2 ttl=64 time=0.358 ms
64 bytes from 141.212.110.188: icmp_seq=3 ttl=64 time=0.390 ms
64 bytes from 141.212.110.188: icmp_seq=4 ttl=64 time=0.383 ms
64 bytes from 141.212.110.188: icmp_seq=5 ttl=64 time=0.347 ms
^C
--- cheetah.eecs.umich.edu ping statistics ---
6 packets transmitted, 6 packets received, 0.0% packet loss
round-trip min/avg/max/stddev = 0.205/0.349/0.409/0.067 ms
 delhi-/var/log% 
 delhi-/var/log% 
 delhi-/var/log% date
Mon Jul  5 10:16:01 EDT 2010
Initializing Communicator
Attempting to retrieve SenStore
Sensor: 31
Accel ID: 29
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 5.0sec.
Data throughput in KBytes/second = 4.0
Data consisting of 20 bytes; batch size = 10; average time per 1000 cycles = 0.4sec.
Data throughput in KBytes/second = 50.0
Data consisting of 20 bytes; batch size = 100; average time per 1000 cycles = 0.04sec.
Data throughput in KBytes/second = 500.0
Data consisting of 20 bytes; batch size = 1000; average time per 1000 cycles = 0.0080sec.
Data throughput in KBytes/second = 2500.0
Data consisting of 20 bytes; batch size = 10000; average time per 1000 cycles = 0.0038sec.
Data throughput in KBytes/second = 5263.1578947368425
Data consisting of 20 bytes; batch size = 50000; average time per 1000 cycles = 0.00176sec.
Data throughput in KBytes/second = 11363.636363636364
Done!
Initializing Communicator
Attempting to retrieve SenStore
accelSignalID = 29
Signal  has 1 times (3 data points)
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 14.0sec.
Data throughput in KBytes/second = 1.4285714285714286
accelSignalID = 29
Signal  has 11 times (33 data points)
Data consisting of 20 bytes; batch size = 11; average time per 1000 cycles = 1.7272727272727273sec.
Data throughput in KBytes/second = 11.578947368421053
accelSignalID = 29
Signal  has 99 times (297 data points)
Data consisting of 20 bytes; batch size = 99; average time per 1000 cycles = 0.1919191919191919sec.
Data throughput in KBytes/second = 104.21052631578948
accelSignalID = 29
Signal  has 1001 times (3003 data points)
Data consisting of 20 bytes; batch size = 1001; average time per 1000 cycles = 0.08591408591408592sec.
Data throughput in KBytes/second = 232.7906976744186
accelSignalID = 29
Signal  has 9999 times (29997 data points)
Data consisting of 20 bytes; batch size = 9999; average time per 1000 cycles = 0.0058005800580058sec.
Data throughput in KBytes/second = 3447.9310344827586
accelSignalID = 29
Signal  has 49999 times (149997 data points)
Data consisting of 20 bytes; batch size = 49999; average time per 1000 cycles = 0.002760055201104022sec.
Data throughput in KBytes/second = 7246.231884057971
Done!
-------------------------------------------

 delhi-/var/log% ipfw pipe 1 config delay 10ms
 delhi-/var/log% date
Mon Jul  5 10:16:57 EDT 2010
 delhi-/var/log% ping cheetah
PING cheetah.eecs.umich.edu (141.212.110.188): 56 data bytes
64 bytes from 141.212.110.188: icmp_seq=0 ttl=64 time=10.934 ms
64 bytes from 141.212.110.188: icmp_seq=1 ttl=64 time=9.550 ms
c64 bytes from 141.212.110.188: icmp_seq=2 ttl=64 time=10.710 ms
^R
64 bytes from 141.212.110.188: icmp_seq=3 ttl=64 time=10.830 ms
^C
--- cheetah.eecs.umich.edu ping statistics ---
4 packets transmitted, 4 packets received, 0.0% packet loss
round-trip min/avg/max/stddev = 9.550/10.506/10.934/0.558 ms
Initializing Communicator
Attempting to retrieve SenStore
Sensor: 32
Accel ID: 30
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 15.0sec.
Data throughput in KBytes/second = 1.3333333333333333
Data consisting of 20 bytes; batch size = 10; average time per 1000 cycles = 1.5sec.
Data throughput in KBytes/second = 13.333333333333334
Data consisting of 20 bytes; batch size = 100; average time per 1000 cycles = 0.14sec.
Data throughput in KBytes/second = 142.85714285714286
Data consisting of 20 bytes; batch size = 1000; average time per 1000 cycles = 0.029sec.
Data throughput in KBytes/second = 689.6551724137931
Data consisting of 20 bytes; batch size = 10000; average time per 1000 cycles = 0.0078sec.
Data throughput in KBytes/second = 2564.102564102564
Data consisting of 20 bytes; batch size = 50000; average time per 1000 cycles = 0.0050sec.
Data throughput in KBytes/second = 4000.0
Done!
Initializing Communicator
Attempting to retrieve SenStore
accelSignalID = 30
Signal  has 1 times (3 data points)
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 48.0sec.
Data throughput in KBytes/second = 0.4166666666666667
accelSignalID = 30
Signal  has 10 times (30 data points)
Data consisting of 20 bytes; batch size = 10; average time per 1000 cycles = 4.8sec.
Data throughput in KBytes/second = 4.166666666666667
accelSignalID = 30
Signal  has 100 times (300 data points)
Data consisting of 20 bytes; batch size = 100; average time per 1000 cycles = 0.49sec.
Data throughput in KBytes/second = 40.816326530612244
accelSignalID = 30
Signal  has 1001 times (3003 data points)
Data consisting of 20 bytes; batch size = 1001; average time per 1000 cycles = 0.1918081918081918sec.
Data throughput in KBytes/second = 104.27083333333333
accelSignalID = 30
Signal  has 9999 times (29997 data points)
Data consisting of 20 bytes; batch size = 9999; average time per 1000 cycles = 0.0203020302030203sec.
Data throughput in KBytes/second = 985.1231527093596
accelSignalID = 30
Signal  has 49999 times (149997 data points)
Data consisting of 20 bytes; batch size = 49999; average time per 1000 cycles = 0.010280205604112082sec.
Data throughput in KBytes/second = 1945.4863813229572
Done!
---------------------------------

delhi-/var/log% ping cheetah.eecs.umich.edu
PING cheetah.eecs.umich.edu (141.212.110.188): 56 data bytes
Request timeout for icmp_seq 0
64 bytes from 141.212.110.188: icmp_seq=0 ttl=64 time=1001.053 ms
64 bytes from 141.212.110.188: icmp_seq=1 ttl=64 time=1000.687 ms
c64 bytes from 141.212.110.188: icmp_seq=2 ttl=64 time=1000.226 ms
64 bytes from 141.212.110.188: icmp_seq=3 ttl=64 time=1000.261 ms
^C
Initializing Communicator
Attempting to retrieve SenStore
Sensor: 33
Accel ID: 31
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 1006.0sec.
Data throughput in KBytes/second = 0.019880715705765408
Data consisting of 20 bytes; batch size = 10; average time per 1000 cycles = 100.5sec.
Data throughput in KBytes/second = 0.19900497512437812
Data consisting of 20 bytes; batch size = 100; average time per 1000 cycles = 10.1sec.
Data throughput in KBytes/second = 1.9801980198019802
Data consisting of 20 bytes; batch size = 1000; average time per 1000 cycles = 5.014sec.
Data throughput in KBytes/second = 3.9888312724371757
Data consisting of 20 bytes; batch size = 10000; average time per 1000 cycles = 1.4045sec.
Data throughput in KBytes/second = 14.239943040227839
Data consisting of 20 bytes; batch size = 50000; average time per 1000 cycles = 0.50198sec.
Data throughput in KBytes/second = 39.842224789832265
Done!
Initializing Communicator
Attempting to retrieve SenStore
accelSignalID = 31
Signal  has 1 times (3 data points)
Data consisting of 20 bytes; batch size = 1; average time per 1000 cycles = 3018.0sec.
Data throughput in KBytes/second = 0.0066269052352551355
accelSignalID = 31
Signal  has 10 times (30 data points)
Data consisting of 20 bytes; batch size = 10; average time per 1000 cycles = 302.0sec.
Data throughput in KBytes/second = 0.06622516556291391
accelSignalID = 31
Signal  has 100 times (300 data points)
Data consisting of 20 bytes; batch size = 100; average time per 1000 cycles = 30.21sec.
Data throughput in KBytes/second = 0.6620324395895398
accelSignalID = 31
Signal  has 1001 times (3003 data points)
Data consisting of 20 bytes; batch size = 1001; average time per 1000 cycles = 4.01998001998002sec.
Data throughput in KBytes/second = 4.975149105367794
accelSignalID = 31
Signal  has 9999 times (29997 data points)
Data consisting of 20 bytes; batch size = 9999; average time per 1000 cycles = 1.0129012901290129sec.
Data throughput in KBytes/second = 19.74526066350711
accelSignalID = 31
Signal  has 49999 times (149997 data points)
Data consisting of 20 bytes; batch size = 49999; average time per 1000 cycles = 0.4028080561611232sec.
Data throughput in KBytes/second = 49.65143992055611
Done!
 delhi-/var/log% date
Mon Jul  5 10:20:40 EDT 2010

----------------------------------------
 delhi-/var/log% ipfw pipe 1 config delay 200ms
 delhi-/var/log% date
Mon Jul  5 10:21:13 EDT 2010
 delhi-/var/log% ping cheetah.eecs.umich.edu
PING cheetah.eecs.umich.edu (141.212.110.188): 56 data bytes
64 bytes from 141.212.110.188: icmp_seq=0 ttl=64 time=200.397 ms
64 bytes from 141.212.110.188: icmp_seq=1 ttl=64 time=200.435 ms
64 bytes from 141.212.110.188: icmp_seq=2 ttl=64 time=200.368 ms
c64 bytes from 141.212.110.188: icmp_seq=3 ttl=64 time=200.046 ms
64 bytes from 141.212.110.188: icmp_seq=4 ttl=64 time=200.136 ms
^C
--- cheetah.eecs.umich.edu ping statistics ---
6 packets transmitted, 5 packets received, 16.7% packet loss
round-trip min/avg/max/stddev = 200.046/200.276/200.435/0.155 ms

Initializing\ Communicator\
Attempting\ to\ retrieve\ SenStore\
Sensor:\ 34\
Accel\ ID:\ 32\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 1\;\ average\ time\ per\ 1000\ cycles\ \=\ 206.0sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 0.0970873786407767\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 10\;\ average\ time\ per\ 1000\ cycles\ \=\ 20.4sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 0.9803921568627451\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 100\;\ average\ time\ per\ 1000\ cycles\ \=\ 2.04sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 9.803921568627452\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 1000\;\ average\ time\ per\ 1000\ cycles\ \=\ 0.409sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 48.899755501222494\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 10000\;\ average\ time\ per\ 1000\ cycles\ \=\ 0.2242sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 89.20606601248885\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 50000\;\ average\ time\ per\ 1000\ cycles\ \=\ 0.09392sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 212.94718909710392\
Done\!\
Initializing\ Communicator\
Attempting\ to\ retrieve\ SenStore\
accelSignalID\ \=\ 32\
Signal\ \ has\ 1\ times\ \(3\ data\ points\)\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 1\;\ average\ time\ per\ 1000\ cycles\ \=\ 616.0sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 0.032467532467532464\
accelSignalID\ \=\ 32\
Signal\ \ has\ 10\ times\ \(30\ data\ points\)\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 10\;\ average\ time\ per\ 1000\ cycles\ \=\ 61.9sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 0.32310177705977383\
accelSignalID\ \=\ 32\
Signal\ \ has\ 100\ times\ \(300\ data\ points\)\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 100\;\ average\ time\ per\ 1000\ cycles\ \=\ 6.2sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 3.225806451612903\
accelSignalID\ \=\ 32\
Signal\ \ has\ 1001\ times\ \(3003\ data\ points\)\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 1001\;\ average\ time\ per\ 1000\ cycles\ \=\ 0.972027972027972sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 20.575539568345324\
accelSignalID\ \=\ 32\
Signal\ \ has\ 9999\ times\ \(29997\ data\ points\)\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 9999\;\ average\ time\ per\ 1000\ cycles\ \=\ 0.22122212221222123sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 90.40687160940325\
accelSignalID\ \=\ 32\
Signal\ \ has\ 49999\ times\ \(149997\ data\ points\)\
Data\ consisting\ of\ 20\ bytes\;\ batch\ size\ \=\ 49999\;\ average\ time\ per\ 1000\ cycles\ \=\ 0.09476189523790476sec.\
Data\ throughput\ in\ KBytes/second\ \=\ 211.0552975939215\
Done\!\
