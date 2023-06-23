package br.com.trabalho2.common;


public abstract class VeiculoMotorizado extends Veiculo {
    public double combustivel = 2.25;

    public void abastecer(double qtdLitros){
        this.combustivel += qtdLitros;
    }
}
