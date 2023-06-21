package br.com.trabalho2.model;

import br.com.trabalho2.common.IPVA;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.util.TipoVeiculo;

@TipoVeiculo("Motocicleta")
public class Motocicleta extends VeiculoMotorizado implements IPVA {

    public double cteMotocicleta = 0.75;
    public double gastoMotocicleta = 0.25;
    @Override
    public double calcularIPVA() {
        return valorIpva = cteMotocicleta*super.valorBase;
    }

    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }
}
