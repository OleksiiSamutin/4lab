package com.company;

public class Plane {
    protected String name;
    protected int flightRange;
    protected int cruiseSpeed;
    protected int wingSpan;
    protected int price;

    public Plane(String name, int flightRange, int cruiseSpeed, int wingSpan, int price){
        this.name = name;
        this.flightRange = flightRange;
        this.cruiseSpeed = cruiseSpeed;
        this.wingSpan = wingSpan;
        this.price = price;
    }

    public Plane(){
        this.name = "Concorde";
        this.flightRange = 7223;
        this.cruiseSpeed = 2158;
        this.wingSpan = 120;
        this.price = 151000000;
    }

    public int getFlightRange(){
        return flightRange;
    }

    public int getPrice(){
        return price;
    }


    @Override
    public String toString(){
        return "Plane:"+"\n"+
                "name = " + name + "\n"+
                "flight range = "+ flightRange + " km" + "\n"+
                "cruise speed = "+ cruiseSpeed + " km/h" + "\n"+
                "wingspan = "+ wingSpan +" m"+"\n"+
                "price = "+price+" $";

    }
}
