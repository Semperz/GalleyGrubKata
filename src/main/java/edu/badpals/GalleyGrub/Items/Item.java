package edu.badpals.GalleyGrub.Items;

import java.util.Objects;

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

    public String extra() {
        return extra;
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
    public boolean isRegular(){
        return extra.isEmpty() ? true:false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(price, item.price) && Objects.equals(extra, item.extra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, extra);
    }
}
