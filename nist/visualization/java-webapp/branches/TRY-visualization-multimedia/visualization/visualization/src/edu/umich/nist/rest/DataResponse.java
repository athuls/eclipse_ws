package edu.umich.nist.rest;

public class DataResponse {
    public long startTimeInMillis;
    public long stopTimeInMillis;
    public int[] data;
    
    public DataResponse(long startTimeInMillis, long stopTimeInMillis, int[] data) {
        this.startTimeInMillis = startTimeInMillis;
        this.stopTimeInMillis = stopTimeInMillis;
        this.data = data;
    }
}
