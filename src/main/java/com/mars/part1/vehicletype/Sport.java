package com.mars.part1.vehicletype;

import com.mars.part1.enginetype.Engine;

/**
 * Created by Mars on 2015/10/24.
 */
public class Sport extends AbstractCar {
    public Sport(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }

    public Sport(Engine engine, Colour colour) {
        super(engine,colour);
    }

}
