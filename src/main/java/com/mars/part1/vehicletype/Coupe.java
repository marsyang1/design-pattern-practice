package com.mars.part1.vehicletype;

import com.mars.part1.enginetype.Engine;

/**
 * Created by Mars on 2015/10/24.
 */
public class Coupe extends AbstractCar {

    public Coupe(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }

    public Coupe(Engine engine, Colour colour) {
        super(engine,colour);
    }

}
