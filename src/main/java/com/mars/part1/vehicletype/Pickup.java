package com.mars.part1.vehicletype;

import com.mars.part1.enginetype.Engine;

/**
 * Created by Mars on 2015/10/24.
 */
public class Pickup extends AbstractVan {
    public Pickup(Engine engine) {
        this(engine,Colour.UNPAINTED);
    }

    public Pickup(Engine engine, Colour unpainted) {
        super(engine, unpainted);
    }

}
