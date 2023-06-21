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
        return valorIpva = cteEsportivo*super.valorBase;
    }

    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }
}
