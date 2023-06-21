package br.com.trabalho2.model;

import br.com.trabalho2.common.IPVA;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.util.TipoVeiculo;

@TipoVeiculo("Motocicleta")
public class Motocicleta extends VeiculoMotorizado implements IPVA {

    @Override
    public double calcularIPVA() {
        return 0;
    }

    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }
}
