package com.mars.part2.builder;

import com.mars.part1.vehicletype.AbstractCar;
import com.mars.part1.vehicletype.Vehicle;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Mars on 2015/10/24.
 */
@Slf4j
public class CarBuilder extends VehicleBuilder {

    private AbstractCar carInProgress;

    public CarBuilder(AbstractCar car) {
        this.carInProgress = car;
    }


    public void buildBody() {
        log.info("building car body");
    }

    public void buildBoot() {
        log.info("building car boot");
    }

    public void buildChassis() {
        log.info("building car chassis");
    }


    public void buildPassengerArea() {
        log.info("building car passenger");
    }

    public void buildWindows() {
        log.info("building car windows");
    }

    @Override
    public Vehicle build() {
        return carInProgress;
    }

}
