package br.com.trabalho2.common;

import br.com.trabalho2.model.Pneu;

public abstract class Veiculo{

    int id;
    int distanciaPercorrida;
    Pneu[] rodas;
    int quantidadeRodas;


    // Não ha a necessidade de criação de construtor padrão quando não ha um construtor com parametros

    public abstract void mover();

    public abstract void desenhar();

    public void calibraPneu(int pneu){}

}
