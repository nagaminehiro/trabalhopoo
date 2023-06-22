package br.com.trabalho2.model;

import br.com.trabalho2.common.IPVA;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.util.TipoVeiculo;
import br.com.trabalho2.util.VeiculoMapper;

@TipoVeiculo("Motocicleta")
public class Motocicleta extends VeiculoMotorizado implements IPVA {

    public int cteBlM = 3;



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
                    "gastoMotocicleta: " + super.getGastoMotocicleta() + ", " +
                    "combustivel: " + super.getCombustivel() + ", " +
                    "pneus: " + super.getQuantidadePneus() + ", " +
                    "distanciaPercorrida: " + super.getDistanciaPercorrida() +  ", " +
                    "getPneus: " + VeiculoMapper.printPneus(super.getPneus()) +
                " }";
    }

}
