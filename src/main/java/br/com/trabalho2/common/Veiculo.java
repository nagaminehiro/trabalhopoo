package br.com.trabalho2.common;

import br.com.trabalho2.model.Pneu;

public abstract class Veiculo {

    int id;
    int distanciaPercorrida;
    Pneu[] rodas;
    int quantidadeRodas;

    public double valorBase = 500.00;
    public double combustivel = 0;
    public double valorIpva = 0;


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

    public Pneu[] getRodas() {
        return rodas;
    }

    public void setRodas(Pneu[] rodas) {
        this.rodas = rodas;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
}
