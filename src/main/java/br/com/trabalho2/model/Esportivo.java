package br.com.trabalho2.model;

import br.com.trabalho2.common.IPVA;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.util.TipoVeiculo;
import br.com.trabalho2.util.VeiculoMapper;

@TipoVeiculo("Carro Esportivo")
public class Esportivo extends VeiculoMotorizado implements IPVA {

    public int cteBlE = 10;

    public Esportivo() {
        super(getId(), getDistanciaPercorrida(), getPneus(), getQuantidadePneus());
    }


    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }

    @Override
    public String toString() {
        return "Esportivo { " +
                    "id: " + super.getId() + ", " +
                    "gastoEsportivo: " + super.getGastoEsportivo() + ", " +
                    "cteEsportivo: " + cteEsportivo + ", " +
                    "combustivel: " + super.getCombustivel() + ", " +
                    "pneus: " + super.getQuantidadePneus() + ", " +
                    "distanciaPercorrida: " + super.getDistanciaPercorrida() + ", " +
                    "getPneus: " + VeiculoMapper.printPneus(super.getPneus()) +
                " } ";
    }
}
