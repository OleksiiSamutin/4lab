package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Airliner[] planes = new Airliner[5];

	    planes[0]= new Airliner("Boeing 737",5925,852,34,112600000,215);
	    planes[1]= new Airliner("AirBus A380-800",15200,945,79, 389900000,853);
	    planes[2]= new Airliner("Boeing 747-8",14300,917,68,379000000,605);
	    planes[3] = new Airliner("Airbus A340-600",13980,871, 63,306000000,380);
	    planes[4] = new Airliner("Boeing 777",15843, 892,64,352000000,440);
	    //planes[3]= new Airliner("Cessna CitationJet/M2",2871,748,14,4700000);

	    Arrays.sort(planes, new ComparePrice());

        for (Plane plane : planes){
            System.out.println(plane);
            System.out.println("=================");
        }
        Arrays.sort(planes, new CompareFlightRange().reversed());
        System.out.println("_____________________________________________________________");
        for (Plane plane : planes){
            System.out.println(plane);
            System.out.println("==================");
        }

    }
}
