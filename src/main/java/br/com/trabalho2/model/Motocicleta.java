package br.com.trabalho2.model;

import br.com.trabalho2.common.IPVA;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.util.TipoVeiculo;
import br.com.trabalho2.util.VeiculoMapper;

@TipoVeiculo("Motocicleta")
public class Motocicleta extends VeiculoMotorizado implements IPVA {

    public int cteBlM = 3;
    public double cteMotocicleta = 0.75;
    public double gastoMotocicleta = 0.25;
    @Override
    public double calcularIPVA() {
        return (cteMotocicleta*super.valorBase);
    }

    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }

    @Override
    public String toString() {
        return "Motocicleta {" +
                    "id: " + super.getId() + ", " +
                    "cteMotocicleta: " + cteMotocicleta + ", " +
                    "gastoMotocicleta: " + gastoMotocicleta + ", " +
                    "combustivel: " + super.combustivel + ", " +
                    "pneus: " + super.getQuantidadePneus() + ", " +
                    "distanciaPercorrida: " + super.getDistanciaPercorrida() +  ", " +
                    "getPneus: " + VeiculoMapper.printPneus(super.getPneus()) +
                " }";
    }

}
