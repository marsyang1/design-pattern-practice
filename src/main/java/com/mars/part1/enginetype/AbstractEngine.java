package com.mars.part1.enginetype;

import com.google.common.base.MoreObjects;

/**
 * Created by Mars on 2015/10/24.
 */
public abstract class AbstractEngine implements Engine{

    private int size;
    private boolean turbo;

    public AbstractEngine(int size,boolean turbo){
        this.size = size;
        this.turbo = turbo;
    }

    public int getSize() {
        return size;
    }

    public boolean isTurbo() {
        return turbo;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("size", size)
                .add("turbo", turbo)
                .toString();
    }
}
