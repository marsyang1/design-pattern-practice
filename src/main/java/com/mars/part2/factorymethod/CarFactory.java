package com.mars.part2.factorymethod;

import com.mars.part1.enginetype.StandardEngine;
import com.mars.part1.enginetype.TurboEngine;
import com.mars.part1.vehicletype.Coupe;
import com.mars.part1.vehicletype.Saloon;
import com.mars.part1.vehicletype.Sport;
import com.mars.part1.vehicletype.Vehicle;

/**
 * Created by Mars on 2015/11/5.
 */
public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle selectVehicle(DrivingStyle style) {
        switch (style){
            case ECONOMICAL:
                return new Saloon(new StandardEngine(1300));
            case MIDRANGE:
                return new Coupe(new StandardEngine(1600));
            default:
                return new Sport(new TurboEngine(2000));
        }
    }
}
