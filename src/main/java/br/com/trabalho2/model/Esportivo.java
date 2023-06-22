package br.com.trabalho2.model;

import br.com.trabalho2.common.IPVA;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.util.TipoVeiculo;

@TipoVeiculo("Carro Esportivo")
public class Esportivo extends VeiculoMotorizado implements IPVA {

    public double gastoEsportivo = 2.3;
    public double cteEsportivo = 3.15;

    @Override
    public double calcularIPVA() {
        return (cteEsportivo*super.valorBase);
    }

    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }

    @Override
    public String toString() {
        return "Esportivo {" +
                    "gastoEsportivo: " + gastoEsportivo + "," +
                    "cteEsportivo: " + cteEsportivo + "," +
                    "combustivel: " + super.combustivel + "," +
                    "pneus: " + super.getQuantidadePneus() +
                    "distanciaPercorrida: " + super.getDistanciaPercorrida() +
                    "getPneus: " + super.getPneus() +
                '}';
    }
}
