package br.com.trabalho2.common;


import br.com.trabalho2.model.Pneu;

import java.util.List;

public abstract class VeiculoMotorizado extends Veiculo {
    private double combustivel = 2.25;
    private double gastoPasseio = 0.75;
    private double gastoEsportivo = 2.3;
    private double gastoMotocicleta = 0.25;
    private float valorIPVA = 0;

    public VeiculoMotorizado(int id, int distanciaPercorrida, List<Pneu> pneus, int quantidadePneus) {
        this.setId(id);
        this.setDistanciaPercorrida(distanciaPercorrida);
        this.setPneus(pneus);
        this.setQuantidadePneus(quantidadePneus);
    }

    public double getGastoPasseio() {
        return gastoPasseio;
    }

    public void setGastoPasseio(double gastoPasseio) {
        this.gastoPasseio = gastoPasseio;
    }

    public double getGastoEsportivo() {
        return gastoEsportivo;
    }

    public void setGastoEsportivo(double gastoEsportivo) {
        this.gastoEsportivo = gastoEsportivo;
    }

    public double getGastoMotocicleta() {
        return gastoMotocicleta;
    }

    public void setGastoMotocicleta(double gastoMotocicleta) {
        this.gastoMotocicleta = gastoMotocicleta;
    }

    public float getValorIPVA() {
        return valorIPVA;
    }

    public void setValorIPVA(float valorIPVA) {
        this.valorIPVA = valorIPVA;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void abastecer(double qtdLitros){
        this.combustivel += qtdLitros;
    }

    @Override
    public String toString() {
        return "VeiculoMotorizado{" +
                "combustivel=" + combustivel +
                ", gastoPasseio=" + gastoPasseio +
                ", gastoEsportivo=" + gastoEsportivo +
                ", gastoMotocicleta=" + gastoMotocicleta +
                ", valorIPVA=" + valorIPVA +
                '}';
    }
}
