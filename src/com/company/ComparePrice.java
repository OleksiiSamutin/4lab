package com.company;
import java.util.Comparator;
public class ComparePrice implements Comparator<Plane>{
    public int compare(Plane o1, Plane o2) {
        return Integer.compare(o1.getPrice(),o2.getPrice());

    }

}
