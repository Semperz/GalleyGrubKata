package edu.badpals.GalleyGrub.Receipt;

import edu.badpals.GalleyGrub.Extras.Extra;
import edu.badpals.GalleyGrub.Order.Comanda;

public interface Ticket {
        Comanda getOrder();
        void setChain(Extra extra);
        Extra getChain();
        Double total();
        void sumExtraCharge();
        void print();
}
