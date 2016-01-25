package com.mars.part2.abstractfactory.factory;

import com.mars.part2.abstractfactory.vo.*;

/**
 * Created by Mars on 2015/10/23.
 */
public class CarFactory implements AbstractVehicleFactory {

    public Body createBody() {
        return new CarBody();
    }

    public Chassis createChassis() {
        return new CarChassis();
    }

    public Windows createWindows() {
        return new CarWindows();
    }
}
