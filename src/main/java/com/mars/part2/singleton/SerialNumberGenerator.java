package com.mars.part2.singleton;

/**
 * Created by Mars on 2015/11/15.
 */
public enum SerialNumberGenerator {
    ENGINE , VEHICLE;

    private int count;

    public synchronized int getSerial() {
        return ++count;
    }
}
