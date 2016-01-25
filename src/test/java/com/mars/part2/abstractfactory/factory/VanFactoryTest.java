package com.mars.part2.abstractfactory.factory;

import com.mars.part2.abstractfactory.vo.Body;
import com.mars.part2.abstractfactory.vo.Chassis;
import com.mars.part2.abstractfactory.vo.Windows;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mars on 2015/10/23.
 */
public class VanFactoryTest extends TestCase {

    final AbstractVehicleFactory factory = new VanFactory();

    @Test
    public void testCreateBody() throws Exception {
        Body body = factory.createBody();
        Assert.assertEquals("Body shell parts for a van", body.getBodyParts());
    }

    @Test
    public void testCreateChassis() throws Exception {
        Chassis chassis = factory.createChassis();
        Assert.assertEquals("Chassis parts for a van", chassis.getChassisParts());
    }

    @Test
    public void testCreateWindows() throws Exception {
        Windows windows = factory.createWindows();
        Assert.assertEquals("Windows glassware for a van", windows.getWindowsParts());
    }
}