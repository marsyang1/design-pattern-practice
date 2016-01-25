package com.mars.part2.prototype;

import com.mars.part1.enginetype.StandardEngine;
import com.mars.part1.vehicletype.*;

/**
 * Created by Mars on 2015/11/15.
 */
public class VehicleManager {
    private Vehicle saloon,coupe,sport,boxVan,pickup;

    public VehicleManager(){
        saloon = new Saloon(new StandardEngine(1300));
        coupe = new Coupe(new StandardEngine(1300));
        sport = new Sport(new StandardEngine(1300));
        boxVan = new BoxVan(new StandardEngine(1300));
        pickup = new Pickup(new StandardEngine(1300));
    }

    public Vehicle createSaloon(){
        return (Vehicle) saloon.clone();
    }

    public Vehicle createCoupe(){
        return (Vehicle) coupe.clone();
    }

    public Vehicle createSport(){
        return (Vehicle) sport.clone();
    }
    public Vehicle createBoxVan(){
        return (Vehicle) boxVan.clone();
    }

    public Vehicle createPickup(){
        return (Vehicle) pickup.clone();
    }

}
