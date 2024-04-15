package edu.badpals.GalleyGrub.Order;

import edu.badpals.GalleyGrub.Items.Item;
import edu.badpals.GalleyGrub.Items.ItemFactory;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private Double total = 0d;
    private List<Item> itemList = new ArrayList<>();

    public Order() {
    }

    @Override
    public void addItem(String name, Double price){
        itemList.add(ItemFactory.getItem(name, price));
    }
    @Override
    public void addItem(String name, Double price, String extra){
        itemList.add(ItemFactory.getItem(name, price, extra));
    }
    @Override
    public List<Item> itemList() {
        return itemList;
    }

    @Override
    public int size(){
        return itemList.size();
    }
    @Override
    public Double getTotal() {
        return total;
    }
    @Override
    public void updateTotal(Double total) {
        this.total += total;
    }

    @Override
    public void display() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n\t")
            .append("--- ORDER ---");
    for (Item item : itemList()){
        sb.append("\n\t")
                .append(item.toString());}
    System.out.println(sb);
    }
}
