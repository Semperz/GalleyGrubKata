package edu.badpals.GalleyGrub.Extras;

import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.Order.Comanda;

public class SizeLargeExtra extends Extra {
    private Double SIZE_PRICE = Prices.getPrices(SIZE_LARGE);

    public SizeLargeExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {

    }
}
