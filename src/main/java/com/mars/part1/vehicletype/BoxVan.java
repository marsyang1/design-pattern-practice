package com.mars.part1.vehicletype;

import com.mars.part1.enginetype.Engine;

/**
 * Created by Mars on 2015/10/24.
 */
public class BoxVan extends AbstractVan {
    public BoxVan(Engine engine) {
        this(engine,Colour.UNPAINTED);
    }

    public BoxVan(Engine engine, Colour unpainted) {
        super(engine, unpainted);
    }

}
