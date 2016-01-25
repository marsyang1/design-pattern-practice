package com.mars.part2.prototype;

import com.mars.part1.enginetype.StandardEngine;
import com.mars.part1.vehicletype.*;

/**
 * Created by Mars on 2015/11/15.
 */
public class VehicleManagerLazy {
    private Vehicle saloon,coupe,sport,boxVan,pickup;

    public Vehicle createSaloon(){
        if(saloon == null){
            saloon = new Saloon(new StandardEngine(1300));
        }
        return (Vehicle) saloon.clone();
    }

    public Vehicle createCoupe(){
        if(coupe == null){
            coupe = new Coupe(new StandardEngine(1300));
        }
        return (Vehicle) coupe.clone();
    }

    public Vehicle createSport(){
        if(sport == null){
            sport = new Sport(new StandardEngine(1300));
        }
        return (Vehicle) sport.clone();
    }
    public Vehicle createBoxVan(){
        if(boxVan == null){
            boxVan = new BoxVan(new StandardEngine(1300));
        }
        return (Vehicle) boxVan.clone();
    }

    public Vehicle createPickup(){
        if(pickup == null){
            pickup = new Pickup(new StandardEngine(1300));
        }
        return (Vehicle) pickup.clone();
    }
}
