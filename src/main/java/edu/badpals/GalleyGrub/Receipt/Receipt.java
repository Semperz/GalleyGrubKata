package edu.badpals.GalleyGrub.Receipt;

import edu.badpals.GalleyGrub.Extras.Extra;
import edu.badpals.GalleyGrub.Order.Comanda;

public class Receipt implements Ticket {
    private Double total = 0d;
    private Comanda order = null;
    private Extra firstExtra = null;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return order;
    }

    @Override
    public void setChain(Extra extra) {
        this.firstExtra = extra;
    }

    @Override
    public Extra getChain() {
        return firstExtra;
    }

    @Override
    public Double total() {
        sumExtraCharge();
        this.total = order.getTotal();
        return total;
    }

    @Override
    public void sumExtraCharge() {
        if(!(this.firstExtra == null)) {
            firstExtra.sumExtras(this.order);
        }

    }

    @Override
    public void print() {
        order.display();
        StringBuilder sb = new StringBuilder();
        sb.append('\t')
                .append("TOTAL --------> ")
                .append(total + "$");
        System.out.println(sb);
    }
}