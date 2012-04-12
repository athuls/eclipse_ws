% Plot Narada DAQ Data
clear; clc; close all;

% get folder number from user
run_num = input('Enter Folder Number: ');
if run_num >= 100000
    error('badInput:unusable:tooLarge','%s','Input is too large!');
end

% load parameters from .txt file
path_base = sprintf('AccData\\%05d\\',run_num);
path = [path_base 'TestName.txt'];
[DAQset] = load_DAQ_settings(path);

% Find actual points collected
points1 = DAQset.fs * DAQset.T;
points2 = DAQset.points_per_poll;
if points2 > points1
    points = points1;
elseif mod(points1,points2) ~= 0
    points = (floor(points1/points2)+1)*points2;
else
    points = points1;
end
num_poll_cycles = ceil(points1/points2);

% Preallocate the memory
data = zeros(DAQset.num_units, max(max(DAQset.channel_num_list(:,:))), num_poll_cycles*DAQset.points_per_poll);

% Load the data:
time = 1/DAQset.fs*[1:points]';
for k = 1:DAQset.num_units
    chan = DAQset.channel_num_list(k,:);
    for j = 1:chan
        filename = [path_base sprintf('U%02d_CH%01d_mg.dat', DAQset.unit_list(k,1), DAQset.chans(k,j))];
        tempdata(:,1) = load(filename);
        for i=1:length(tempdata)
            data(k, j, i) = tempdata(i,1);
        end
    end
end

% Process data:
dt = 1.0/DAQset.fs;
Nfft = 12; % input('number of FFT: ');%number of FFT

for k=1:DAQset.num_units
    chan = DAQset.channel_num_list(k,:);
    for j = 1:chan
%  Fourie Transform
    temp(1,:) = DAQset.fs*(0:2^(Nfft-1))/2^Nfft;
    tempfft = abs(fft(detrend(data(k,j,:)),2^Nfft));
    temp(2,:) = tempfft(1:2^(Nfft-1)+1);
    filename = sprintf('FFT\\U%02d_CH%01d_FF.dat', DAQset.unit_list(k,1), DAQset.chans(k,j));
    fid = fopen(filename, 'wt');
    fprintf(fid, '%f %f\n', temp);
    fclose(fid);
%  Power Spectrum Density
    [temp2(2,:), temp2(1,:)] = periodogram(data(k,j,:),[],[],DAQset.fs);
    filename = sprintf('PSD\\U%02d_CH%01d_PSD.dat', DAQset.unit_list(k,1), DAQset.chans(k,j));
    fid = fopen(filename, 'wt');
    fprintf(fid, '%f %f\n', temp2);
    fclose(fid);
    end
end
close all;