package com.mars.part2.builder;

import com.mars.part1.enginetype.StandardEngine;
import com.mars.part1.vehicletype.AbstractCar;
import com.mars.part1.vehicletype.Saloon;
import com.mars.part1.vehicletype.Vehicle;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Created by Mars on 2015/10/25.
 */
@Slf4j
public class CarDirectorTest extends TestCase {

    @Test
    public void testBuild() throws Exception {
        AbstractCar car = new Saloon((new StandardEngine(1300)));
        VehicleBuilder builder = new CarBuilder(car);
        VehicleDirector director = new CarDirector();
        Vehicle v = director.build(builder);
        log.info(v.toString());
    }
}