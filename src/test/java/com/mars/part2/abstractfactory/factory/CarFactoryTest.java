package com.mars.part2.abstractfactory.factory;

import com.mars.part2.abstractfactory.vo.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mars on 2015/10/23.
 */
public class CarFactoryTest {

    final AbstractVehicleFactory factory = new CarFactory();

    @Test
    public void testCreateBody() throws Exception {
        Body body = factory.createBody();
        Assert.assertEquals("Body shell parts for a car", body.getBodyParts());
    }

    @Test
    public void testCreateChassis() throws Exception {
        Chassis chassis = factory.createChassis();
        Assert.assertEquals("Chassis parts for a car", chassis.getChassisParts());
    }

    @Test
    public void testCreateWindows() throws Exception {
        Windows windows = factory.createWindows();
        Assert.assertEquals("Windows glassware for a car", windows.getWindowsParts());
    }
}