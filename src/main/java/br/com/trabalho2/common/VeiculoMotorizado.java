package br.com.trabalho2.common;


public abstract class VeiculoMotorizado extends Veiculo {
    public double combustivel;

    public void abastecer(double qtdLitros){
        this.combustivel += qtdLitros;
    }
}
