package br.com.trabalho2.model;

import br.com.trabalho2.common.IPVA;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.util.TipoVeiculo;
import br.com.trabalho2.util.VeiculoMapper;

@TipoVeiculo("Carro Passeio")
public class CarroPasseio extends VeiculoMotorizado implements IPVA {



    public int cteBlP = 5;


    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }

    @Override
    public String toString() {
        return "CarroPasseio { " +
                    "id: " + super.getId() + ", " +
                    "ctePasseio: " + ctePasseio + ", " +
                    "gastoPasseio:" + super.getGastoPasseio() + ", " +
                    "combustivel: " + super.getCombustivel() + ", " +
                    "pneus: " + super.getQuantidadePneus() + ", " +
                    "distanciaPercorrida: " + super.getDistanciaPercorrida() +  ", " +
                    "getPneus: " + VeiculoMapper.printPneus(super.getPneus()) +
                " }";
    }
}
