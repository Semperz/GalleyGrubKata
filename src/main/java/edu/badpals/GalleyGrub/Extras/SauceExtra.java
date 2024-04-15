package edu.badpals.GalleyGrub.Extras;

import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.Order.Comanda;

public class SauceExtra extends Extra {
    private Double SAUCE_PRICE = Prices.getPrices(SAUCE);
    public SauceExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {

    }
}
