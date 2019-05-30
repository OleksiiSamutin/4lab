package com.company;

public class Cargo extends Plane{
    private int cargoHoldVolume;
    private double cargoLong;
    private double cargoWide;
    private double cargoTall;
    private int maxCommercialWeight;
    public Cargo(String name, int flightRange, int cruiseSpeed, int wingSpan, int price,
                 int cargoHoldVolume, double cargoLong, double cargoWide, double cargoTall, int maxCommercialWeight){
        this.name = name;
        this.flightRange = flightRange;
        this.cruiseSpeed = cruiseSpeed;
        this.wingSpan = wingSpan;
        this.price = price;
        this.cargoHoldVolume = cargoHoldVolume;
        this.cargoLong = cargoLong;
        this.cargoWide = cargoWide;
        this.cargoTall = cargoTall;
        this.maxCommercialWeight = maxCommercialWeight;
    }

    public Cargo(){
        this.name = "Antonov An-225 Mriya";
        this.flightRange = 15400;
        this.cruiseSpeed = 800;
        this.wingSpan = 88;
        this.price = 1000000000;
        this.cargoHoldVolume = 1300;
        this.cargoLong = 43.35;
        this.cargoWide = 6.4;
        this.cargoTall = 4.4;
        this.maxCommercialWeight = 250000;

    }
    @Override
    public String toString(){
        return "Plane:"+"\n"+
                "name = " + name + "\n"+
                "flight range = "+ flightRange + " km" + "\n"+
                "cruise speed = "+ cruiseSpeed + " km/h" + "\n"+
                "wingspan = "+ wingSpan +" m"+"\n"+
                "price = "+price+" $" +"\n"+
                "cargo hold volume = " + cargoHoldVolume +" cubic meter" +"\n"+
                "cargo long = "+ cargoLong + " m" + "\n"+
                "cargo wide = "+ cargoWide + " m" + "\n"+
                "cargo tall = "+ cargoTall + " m" + "\n"+
                "max commercial weight = "+ maxCommercialWeight + " kg";

    }

}
