package com.mars.part2.builder;

import com.mars.part1.vehicletype.Vehicle;

/**
 * Created by Mars on 2015/10/25.
 */
public abstract class VehicleDirector {
    public abstract Vehicle build(VehicleBuilder builder);
}
