package br.com.trabalho2.common;

import br.com.trabalho2.model.Pneu;

import java.util.List;

public abstract class Veiculo {

    int id;
    int distanciaPercorrida;
    List<Pneu> pneus;
    int quantidadePneus;
    public double valorBase = 500.00;

    public abstract void mover();

    public abstract void desenhar();

    public void calibraPneu(int pneu){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public List<Pneu> getPneus() {
        return pneus;
    }

    public void setPneus(List<Pneu> pneus) {
        this.pneus = pneus;
    }

    public int getQuantidadePneus() {
        return quantidadePneus;
    }

    public void setQuantidadePneus(int quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }
}
