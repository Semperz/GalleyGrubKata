package edu.badpals.GalleyGrub.Extras;

import edu.badpals.GalleyGrub.Order.Comanda;

import java.util.Optional;

public class Regular extends Extra {
    public Regular() {
    }
    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> sumaExtra = comanda.itemList()
                .stream()
                .map(i->i.price())
                .reduce((a,b) -> a + b);
        if (sumaExtra.isPresent()){
            comanda.updateTotal(sumaExtra.get());
        }
        if (nextExtra.isPresent()){
            nextExtra.get().sumExtras(comanda);
        }
    }
}
