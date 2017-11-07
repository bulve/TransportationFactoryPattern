package com.company;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class TransportationFactoryClass implements com.eisgroup.javaexam.factory.TransportationFactory {

    @Override
    public Transportation produceCar(String s, String s1, double v, Color color) {

        return new Transportation(s,s1,v,color) {
            @Override
            public double getFinalPrice() {
                return v * 1.21;
            }
        };
    }

    @Override
    public Transportation produceBoat(String s, String s1, double v, Color color, double v1) {
        return new TransportationAdapter(s,s1,v,color,v1);
    }



}
