package br.com.trabalho2.model;

public class Pneu {

    boolean calibragemPneu;
    String identificaoPneu;


    public Pneu(){}

    public Pneu(boolean calibragemPneu, String identificaoPneu) {
        this.identificaoPneu = identificaoPneu;
        this.calibragemPneu = calibragemPneu;
    }

    public String getIdentificaoPneu() {
        return identificaoPneu;
    }

    public void setIdentificaoPneu(String identificaoPneu) {
        this.identificaoPneu = identificaoPneu;
    }

    public boolean isCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(boolean calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }

    @Override
    public String toString() {
        return "Pneu {" +
                    " calibragemPneu: " + calibragemPneu + ", " +
                    " identificacaoPneu: " + identificaoPneu +
                " }";
    }
}
