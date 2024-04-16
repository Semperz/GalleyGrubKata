package edu.badpals.GalleyGrub.Extras;

import edu.badpals.GalleyGrub.Items.Item;
import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.Order.Comanda;

public class SauceExtra extends Extra {
    private Double SAUCE_PRICE = Prices.getPrices(SAUCE);
    public SauceExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        int numSauce = 0;
        for (Item item : comanda.itemList()){
            if (item.extra() == SAUCE){
                numSauce++;
            }else{
                ;
            }
        }
        Double sauceCost = numSauce * SAUCE_PRICE;
        comanda.updateTotal(sauceCost);
    }
}
