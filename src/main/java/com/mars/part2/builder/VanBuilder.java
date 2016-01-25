package com.mars.part2.builder;

import com.mars.part1.vehicletype.AbstractVan;
import com.mars.part1.vehicletype.Vehicle;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Mars on 2015/10/24.
 */
@Slf4j
public class VanBuilder extends VehicleBuilder {

    private AbstractVan vanInProgress;

    public VanBuilder(AbstractVan van) {
        this.vanInProgress = van;
    }


    public void buildBody() {
        log.info("building van body");
    }

    public void buildBoot() {
        log.info("building van boot");
    }

    public void buildChassis() {
        log.info("building van chassis");
    }


    public void buildPassengerArea() {
        log.info("building van passenger");
    }

    public void buildReinforcedStorageArea(){
        log.info("building van storage area");
    }

    public void buildWindows() {
        log.info("building van windows");
    }

    @Override
    public Vehicle build() {
        return vanInProgress;
    }

}
