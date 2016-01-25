package com.mars.part2.builder;

import com.mars.part1.vehicletype.Vehicle;

/**
 * Created by Mars on 2015/10/25.
 */
public class CarDirector extends VehicleDirector {
    public Vehicle build(VehicleBuilder builder) {
        builder.buildChassis();
        builder.buildBody();
        builder.buildPassengerArea();
        builder.buildBoot();
        builder.buildWindows();
        return builder.build();
    }
}
