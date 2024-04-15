package edu.badpals.GalleyGrub.Extras;

import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.Order.Comanda;

public class CheeseExtra extends Extra {
    private Double CHEESE_PRICE = Prices.getPrices(CHEESE);
    public CheeseExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {

    }
}
