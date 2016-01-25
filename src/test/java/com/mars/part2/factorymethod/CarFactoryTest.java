package com.mars.part2.factorymethod;

import com.mars.part1.vehicletype.Vehicle;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Mars on 2015/11/5.
 */
@Slf4j
public class CarFactoryTest extends TestCase {

    public void testSelectVehicle() throws Exception {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.build(VehicleFactory.DrivingStyle.ECONOMICAL, Vehicle.Colour.BLUE);
        log.info(car.toString());

        VehicleFactory vanFactory = new VanFactory();
        Vehicle van = vanFactory.build(VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.WHITE);
        log.info(van.toString());


        Vehicle sporty = VehicleFactory.make(VehicleFactory.Category.CAR
                , VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.RED);
        log.info(sporty.toString());
    }
}