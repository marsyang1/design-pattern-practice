package com.mars.part2.factorymethod;

import com.mars.part1.enginetype.StandardEngine;
import com.mars.part1.enginetype.TurboEngine;
import com.mars.part1.vehicletype.BoxVan;
import com.mars.part1.vehicletype.Pickup;
import com.mars.part1.vehicletype.Vehicle;

/**
 * Created by Mars on 2015/11/5.
 */
public class VanFactory extends VehicleFactory {
    @Override
    protected Vehicle selectVehicle(DrivingStyle style) {
        switch (style){
            case ECONOMICAL:
            case MIDRANGE:
                return new Pickup(new StandardEngine(2200));
            default:
                return new BoxVan(new TurboEngine(2500));
        }
    }
}
