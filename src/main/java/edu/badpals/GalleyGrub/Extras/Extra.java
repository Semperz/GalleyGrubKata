package edu.badpals.GalleyGrub.Extras;

import edu.badpals.GalleyGrub.Order.Comanda;

import java.util.Optional;

public abstract class Extra {
   static final String CHEESE = "cheese";
   final static String SAUCE = "sauce";
   final static String SIZE_LARGE = "large";
   String extraProduct = "";
   Optional<Extra> nextExtra = Optional.ofNullable(null);

    public Extra() {
    }

    public void setNextExtra(Optional<Extra> nextExtra) {
        this.nextExtra = nextExtra;
    }
    public abstract void sumExtras(Comanda comanda);
}
