package br.com.trabalho1.veiculo;

import java.io.Serializable;

public class Pneu implements Serializable {
    private boolean vazio; // atributo privado que indica se o pneu está vazio ou não

    // Construtor da classe Pneu
    public Pneu(boolean vazio) {
        this.vazio = vazio; // inicializa o atributo "vazio" com o valor passado como argumento
    }

    // Método getter para obter o valor atual do atributo "vazio"
    public boolean isVazio() {
        return vazio;
    }

    // Método setter para definir o valor do atributo "vazio"
    public void setVazio(boolean vazio) {
        this.vazio = vazio;
    }

    // Método toString() que retorna uma representação em formato de string do objeto Pneu
    @Override
    public String toString() {
        return "Pneu [vazio=" + vazio + "]";
    }
}
