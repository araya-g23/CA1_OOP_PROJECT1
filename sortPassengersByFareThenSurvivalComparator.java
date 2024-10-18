package org.example;

import java.util.Comparator;

public class sortPassengersByFareThenSurvivalComparator implements Comparator<Passenger> {
    public int compare(Passenger p1, Passenger p2) {
        int survival=Double.compare(p1.getFare(),p2.getFare());

        if(survival!=0){
            return survival;
        }
        else{
            return Integer.compare(p1.getSurvived(),p2.getSurvived());
        }
    }
}
