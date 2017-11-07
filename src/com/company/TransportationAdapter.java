package com.company;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;
import com.eisgroup.javaexam.factory.TransportationFactory;

public class TransportationAdapter extends Transportation {

    private double length;

    public TransportationAdapter(String make, String model, double price, Color color, double length) {
        super(make, model, price, color);
        this.length = length;

    }

    public Transportation produceCar(String s, String s1, double v, Color color) {
        return null;
    }


    public Transportation produceBoat(String s, String s1, double v, Color color, double v1, double lenght) {
        return null;
    }

    @Override
    public double getFinalPrice() {
        return getPrice() * 1.21;
    }

    public double getLength(){
        return length;
    }
}
