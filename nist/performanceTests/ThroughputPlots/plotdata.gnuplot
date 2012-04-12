set term postscript
set output "readplot.ps"
set logscale xy 10
set style line 1 lt 1 lw 2 pt 3 lc rgb "red"
set style line 2 lt 2 lw 2 pt 3 lc rgb "blue"
set style line 3 lt 3 lw 2 pt 3 lc rgb "purple"
set style line 4 lt 4 lw 2 pt 3 lc rgb "green"
set style line 5 lt 5 lw 1 pt 3 lc rgb "black"

set key right center

set xlabel 'Batch factor'
set ylabel '# of 20 byte read ops/sec'


plot 'read.dat' using 1:2 with linespoints title 'latency=0.3ms RT' ls 1, \
'read.dat' using 1:3 with linespoints title 'latency=10ms RT' ls 2, \
'read.dat' using 1:4 with linespoints title 'latency=50ms RT' ls 3, \
'read.dat' using 1:5 with linespoints title 'latency=100ms RT' ls 4,  \
'read.dat' using 1:6 with linespoints title 'Target throughput' ls 5;  

# For writes

set term postscript
set output "writeplots.ps"
set logscale xy 10
set key right center

set xlabel 'Batch factor'
set ylabel '# of 20 byte writes/sec'

plot 'write.dat' using 1:2 with linespoints title 'latency=0.3ms RT' ls 1, \
'write.dat' using 1:3 with linespoints title 'latency=10ms RT' ls 2, \
'write.dat' using 1:4 with linespoints title 'latency=50ms RT' ls 3, \
'write.dat' using 1:5 with linespoints title 'latency=100ms RT' ls 4,  \
'write.dat' using 1:6 with linespoints title 'Target throughput' ls 5;  
