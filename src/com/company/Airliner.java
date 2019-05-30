package com.company;

public class Airliner extends Plane {
    private int passangerCapacity;


    public Airliner(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    public Airliner(String name, int flightRange, int cruiseSpeed, int wingSpan, int price, int passangerCapacity){
        super(name, flightRange, cruiseSpeed, wingSpan, price);
        this.passangerCapacity = passangerCapacity;
    }
    @Override
    public String toString(){
        return "Plane:"+"\n"+
                "name = " + name + "\n"+
                "flight range = "+ flightRange + " km" + "\n"+
                "cruise speed = "+ cruiseSpeed + " km/h" + "\n"+
                "wingspan = "+ wingSpan +" m"+"\n"+
                "price = "+price+" $" +"\n"+
                "passanger capacity = "+passangerCapacity;

    }
}
