package com.company;
import java.util.Comparator;

public class CompareFlightRange implements Comparator<Plane> {
    public int compare(Plane o1, Plane o2){
        return Integer.compare(o1.getFlightRange(), o2.getFlightRange());
    }
}
