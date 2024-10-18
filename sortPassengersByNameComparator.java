package org.example;

import java.util.Comparator;

public class sortPassengersByNameComparator implements Comparator<Passenger>
{
    public int compare (Passenger p1, Passenger p2){

        int age= p1.getName().compareTo(p2.getName());
        if(age!=0){
            return age;
        }
        else{
            return Integer.compare(p1.getAge(), p2.getAge()); }
    }
}
