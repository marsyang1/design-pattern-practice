package com.mars.part1.vehicletype;

import com.mars.part1.enginetype.Engine;

/**
 * Created by Mars on 2015/10/24.
 */
public abstract class AbstractCar extends AbstractVehicle {

    public AbstractCar(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }

    public AbstractCar(Engine engine, Colour unpainted) {
        super(engine,unpainted);
    }
}
