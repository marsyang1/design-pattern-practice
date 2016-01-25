package com.mars.part2.factorymethod;

import com.mars.part1.vehicletype.Vehicle;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Mars on 2015/11/15.
 */
@Slf4j
public class VehicleFactoryTest extends TestCase {

    public void testMake() throws Exception {
        Vehicle sporty = VehicleFactory.make(VehicleFactory.Category.CAR, VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.RED);
        log.info(sporty.toString());
    }
}