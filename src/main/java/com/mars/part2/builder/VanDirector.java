package com.mars.part2.builder;

import com.mars.part1.vehicletype.Vehicle;

/**
 * Created by Mars on 2015/10/25.
 */
public class VanDirector extends VehicleDirector {
    public Vehicle build(VehicleBuilder builder) {
        builder.buildChassis();
        builder.buildBody();
        builder.buildReinforcedStorageArea();
        builder.buildWindows();
        return builder.build();
    }
}
