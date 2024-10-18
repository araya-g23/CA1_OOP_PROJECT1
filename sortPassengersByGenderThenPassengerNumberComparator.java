package org.example;

import java.util.Comparator;

public class sortPassengersByGenderThenPassengerNumberComparator implements Comparator<Passenger> {
    public int compare(Passenger p1, Passenger p2) {
        int gender=p1.getGender().compareToIgnoreCase(p2.getGender());

        if(gender==0){
            return p1.getPassengerId().compareTo(p2.getPassengerId());
        }
        else{
            return gender;
        }
    }
}
