package br.com.trabalho2.common;

import br.com.trabalho2.model.Pneu;

import java.util.List;

public abstract class Veiculo {
    private static int id;
    private static int distanciaPercorrida;
    private static List<Pneu> pneus;
    private static int quantidadePneus;
    public Veiculo() {
        this.id = id;
        this.distanciaPercorrida = distanciaPercorrida;
        this.pneus = pneus;
        this.quantidadePneus = quantidadePneus;
    }
    public abstract void mover();

    public abstract void desenhar();

    public void calibrarPneu(int pneu){}

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

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", distanciaPercorrida=" + distanciaPercorrida +
                ", pneus=" + pneus +
                ", quantidadePneus=" + quantidadePneus +
                '}';
    }
}
