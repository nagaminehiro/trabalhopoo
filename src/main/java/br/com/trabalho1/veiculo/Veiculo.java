package br.com.trabalho1.veiculo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Classe que representa um veículo.
 */
public class Veiculo implements Serializable {
    private final int id;
    private Pneu[] pneus;
    private double combustivel;
    private final double valorVenda;
    private final boolean ipvaPago;
    private int espacoPercorrido;

    /**
     * Construtor da classe Veiculo.
     *
     * @param id         Identificador do veículo
     * @param pneus      Array de objetos Pneus que representam os pneus do veículo
     * @param valorVenda Valor de venda do veículo
     * @param ipvaPago   Indica se o IPVA do veículo está pago
     */
    public Veiculo(int id, Pneu[] pneus, double valorVenda, boolean ipvaPago) {
        this.id = id;
        this.pneus = pneus;
        this.combustivel = 2.5;
        this.valorVenda = valorVenda;
        this.ipvaPago = ipvaPago;
        this.espacoPercorrido = 0;
    }

    /**
     * Obtém o identificador do veículo.
     *
     * @return O identificador do veículo
     */
    public int getId() {
        return id;
    }


    /**
     * Obtém os pneus do veículo.
     *
     * @return Array de objetos Pneu que representam os pneus do veículo
     */
    public Pneu[] getPneus() {
        return pneus;
    }

    /**
     * Obtém a quantidade de combustível do veículo.
     *
     * @return A quantidade de combustível do veículo
     */
    public double getCombustivel() {
        return combustivel;
    }

    /**
     * Define a quantidade de combustível do veículo.
     *
     * @param combustivel A quantidade de combustível do veículo
     */
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * Obtém o espaço percorrido pelo veículo.
     *
     * @return O espaço percorrido pelo veículo
     */
    public int getEspacoPercorrido() {
        return espacoPercorrido;
    }

    /**
     * Define o estado de um pneu específico do veículo.
     *
     * @param indice    Índice do pneu a ser modificado
     * @param calibrado Valor indicando se o pneu está calibrado
     */
    public boolean setPneu(int indice, boolean calibrado) {
        if (indice >= 0 && indice < pneus.length) {
            pneus[indice].setVazio(!calibrado);
            return true;
        } else {
            System.out.println("Pneu inválido.");
            return false;
        }
    }

    /**
     * Verifica se todos os pneus do veículo estão calibrados.
     *
     * @return true se todos os pneus estão calibrados, caso contrário, false
     */
    private boolean todosPneusCalibrados() {
        for (Pneu pneu : pneus) {
            if (pneu.isVazio()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Movimenta o veículo.
     * Incrementa o espaço percorrido em 5 unidades e reduz o combustível em 0.55 unidades, desde que haja combustível suficiente, todos os pneus estejam calibrados e o IPVA esteja pago. Caso contrário, exibe uma mensagem informando que não foi possível movimentar o veículo.
     */


    public void movimentar() {
        if (combustivel >= 0.55 && todosPneusCalibrados() && ipvaPago) {
            espacoPercorrido += 5;
            combustivel -= 0.55;
        } else {
            System.out.println("Não foi possível movimentar o veículo " + id);
        }
    }

    /**
     * Retorna uma representação em formato de string do objeto Veiculo.
     *
     * @return Uma string contendo as informações do veículo
     */
    @Override
    public String toString() {
        return "Veículo " + id +
                " | Espaço percorrido: " + espacoPercorrido +
                " | Combustível: " + combustivel +
                " | Valor de venda: " + valorVenda +
                " | IPVA pago: " + (ipvaPago ? "Sim" : "Não") +
                " | Pneus: " + Arrays.toString(pneus);
    }

}
