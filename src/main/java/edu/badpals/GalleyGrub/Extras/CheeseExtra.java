package edu.badpals.GalleyGrub.Extras;

import edu.badpals.GalleyGrub.Items.Item;
import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.Order.Comanda;

public class CheeseExtra extends Extra {
    private Double CHEESE_PRICE = Prices.getPrices(CHEESE);
    public CheeseExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        int numCheese = 0;
        for (Item item : comanda.itemList()){
            if (item.extra() == CHEESE){
                numCheese++;
            }else{
                ;
            }
        }
        Double cheeseCost = numCheese * CHEESE_PRICE;
        comanda.updateTotal(cheeseCost);
    }
}
