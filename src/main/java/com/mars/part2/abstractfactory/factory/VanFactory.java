package com.mars.part2.abstractfactory.factory;

import com.mars.part2.abstractfactory.vo.*;

/**
 * Created by Mars on 2015/10/23.
 */
public class VanFactory implements AbstractVehicleFactory {

    public Body createBody() {
        return new VanBody();
    }

    public Chassis createChassis() {
        return new VanChassis();
    }

    public Windows createWindows() {
        return new VanWindows();
    }
}
