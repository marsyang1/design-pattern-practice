package com.mars.part1.vehicletype;

import com.mars.part1.enginetype.Engine;

/**
 * Created by Mars on 2015/10/24.
 */
public interface Vehicle extends Cloneable {

    public enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW}

    Engine EnginegetEngine();

    Vehicle.Colour getColour();

    void paint(Vehicle.Colour colour);

    public Object clone();

}
