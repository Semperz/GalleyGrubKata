package edu.badpals.GalleyGrub.Order;

import edu.badpals.GalleyGrub.Items.Item;

import java.util.List;

public interface Comanda {

    void addItem(String name, Double price);
    void addItem(String name, Double price, String extra);

    List<Item> itemList();

    int size();

    Double getTotal();

    void updateTotal(Double total);

    void display();
}
