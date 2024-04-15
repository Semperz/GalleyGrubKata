package edu.badpals.GalleyGrub.Items;

import java.util.HashMap;
import java.util.Map;

public class Item implements Product {
    String name = "";
    Double price = 0d;
    String extra = "";

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name + "w/" + extra;
        this.price = price;
        this.extra = extra;
    }

    public String name() {
        return name;
    }

    public Double price() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name())
                .append("....")
                .append(String.format("%.2f", price()))
                .append("$");
        return sb.toString();
    }
}
