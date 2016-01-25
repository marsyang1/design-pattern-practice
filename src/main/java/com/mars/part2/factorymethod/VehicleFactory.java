package com.mars.part2.factorymethod;

import com.mars.part1.vehicletype.Vehicle;

/**
 * Created by Mars on 2015/11/5.
 */
public abstract class VehicleFactory {

    public enum DrivingStyle {ECONOMICAL, MIDRANGE, POWERFUL}

    ;

    public enum Category {CAR, VAN}

    ;

    public static Vehicle make(Category category, DrivingStyle style, Vehicle.Colour colour) {
        VehicleFactory factory = (category == Category.CAR ? new CarFactory() : new VanFactory());
        return factory.build(style, colour);
    }

    public Vehicle build(DrivingStyle style, Vehicle.Colour colour) {
        Vehicle v = selectVehicle(style);
        v.paint(colour);
        return v;
    }

    protected abstract Vehicle selectVehicle(DrivingStyle style);


}
