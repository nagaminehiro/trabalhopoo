package br.com.trabalho2.model;

public class Pneu {

    boolean calibragemPneu;

    public Pneu(boolean calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }

    public boolean isCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(boolean calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }
}
