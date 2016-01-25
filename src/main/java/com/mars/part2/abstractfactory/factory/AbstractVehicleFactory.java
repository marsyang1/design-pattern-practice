package com.mars.part2.abstractfactory.factory;

import com.mars.part2.abstractfactory.vo.Body;
import com.mars.part2.abstractfactory.vo.Chassis;
import com.mars.part2.abstractfactory.vo.Windows;

/**
 * Created by Mars on 2015/10/23.
 */
public interface AbstractVehicleFactory {
    Body createBody();
    Chassis createChassis();
    Windows createWindows();
}
