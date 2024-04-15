package edu.badpals.GalleyGrub.Items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static Map<String, Item> itemMap = new HashMap<>();

    private ItemFactory() {
    }

    public static Item getItem(String name, Double price){
        Item item = new Item(name,price);
        itemMap.putIfAbsent(name,item);
        return itemMap.get(name);
    }
    public static Item getItem(String name, Double price, String extra){
        Item item = new Item(name,price,extra);
        itemMap.putIfAbsent(name + "w/" + extra,item);
        return itemMap.get(name + "w/" + extra);
    }
    public int size(){
        return itemMap.size();
    }
    public void clear(){
        itemMap.clear();
    }
}
