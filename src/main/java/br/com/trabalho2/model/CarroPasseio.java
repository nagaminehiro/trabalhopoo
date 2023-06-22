package br.com.trabalho2.model;

import br.com.trabalho2.common.IPVA;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.util.TipoVeiculo;

@TipoVeiculo("Carro Passeio")
public class CarroPasseio extends VeiculoMotorizado implements IPVA {

    public double ctePasseio = 1.3;
    public double gastoPasseio = 0.75;

    @Override
    public double calcularIPVA() {
        return ctePasseio*super.valorBase;
    }

    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }

    @Override
    public String toString() {
        return "CarroPasseio {" +
                    "ctePasseio: " + ctePasseio + "," +
                    "gastoPasseio:" + gastoPasseio + "," +
                    "combustivel:" + super.combustivel +
                '}';
    }
}
