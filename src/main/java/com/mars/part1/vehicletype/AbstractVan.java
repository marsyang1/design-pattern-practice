package com.mars.part1.vehicletype;

import com.mars.part1.enginetype.Engine;

/**
 * Created by Mars on 2015/10/24.
 */
public abstract class AbstractVan extends AbstractVehicle{

    public AbstractVan(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }

    public AbstractVan(Engine engine, Colour unpainted) {
        super(engine,unpainted);
    }

}
