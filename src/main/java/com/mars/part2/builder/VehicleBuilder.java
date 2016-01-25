package com.mars.part2.builder;

import com.mars.part1.vehicletype.Vehicle;

/**
 * Created by Mars on 2015/10/24.
 */
public abstract class VehicleBuilder {
   public void buildBody() {};
   public void buildBoot() {};
   public void buildChassis(){};
   public void buildPassengerArea(){};
   public void buildReinforcedStorageArea(){};
   public void buildWindows(){};

    public abstract Vehicle build();

}
