package com.mars.part1.vehicletype;

import com.google.common.base.MoreObjects;
import com.mars.part1.enginetype.Engine;

/**
 * Created by Mars on 2015/10/24.
 */
public abstract class AbstractVehicle implements Vehicle {
    private Engine engine;
    private Vehicle.Colour colour;

    public AbstractVehicle(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }

    public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
        this.engine = engine;
        this.colour = colour;
    }

    public Engine EnginegetEngine() {
        return engine;
    }

    public Vehicle.Colour getColour(){
        return colour;
    }

    public void paint(Vehicle.Colour colour){
        this.colour = colour;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("engine", engine)
                .add("colour", colour)
                .toString();
    }

    public Object clone() {
        Object obj = null;
        try{
            obj= super.clone();
        } catch ( CloneNotSupportedException e){
            //should not happen...
        }
        return obj;
    }
}
