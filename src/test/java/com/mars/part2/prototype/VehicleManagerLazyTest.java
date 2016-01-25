package com.mars.part2.prototype;

import com.mars.part1.vehicletype.Vehicle;
import junit.framework.TestCase;

/**
 * Created by Mars on 2015/11/15.
 */
public class VehicleManagerLazyTest extends TestCase {

    public void testCreateSaloon() throws Exception {
        VehicleManagerLazy manager = new VehicleManagerLazy();
        Vehicle saloon1 = manager.createSaloon();
        Vehicle saloon2 = manager.createSaloon();
        Vehicle pickup1 = manager.createPickup();
    }
}