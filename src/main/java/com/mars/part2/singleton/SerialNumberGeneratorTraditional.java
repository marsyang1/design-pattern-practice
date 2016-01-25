package com.mars.part2.singleton;

/**
 * Created by Mars on 2015/11/15.
 */
public class SerialNumberGeneratorTraditional {

    private static SerialNumberGeneratorTraditional instance;

    public synchronized static SerialNumberGeneratorTraditional getInstance() {
        if (instance == null) {
            instance = new SerialNumberGeneratorTraditional();
        }
        return instance;
    }

    private int count;

    private SerialNumberGeneratorTraditional() {

    }

    public synchronized int getSerial() {
        return ++count;
    }
}
