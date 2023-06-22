package br.com.trabalho2.model;

import br.com.trabalho1.veiculo.Pneu;
import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.util.TipoVeiculo;
import br.com.trabalho2.util.VeiculoMapper;

import java.io.Serializable;

@TipoVeiculo("Bicicleta")
public class Bicicleta extends Veiculo implements Serializable {


    @Override
    public void mover() {

    }

    @Override
    public void desenhar() {

    }

    @Override
    public String toString() {
        return "Bicicleta { " +
                    "id: " + super.getId() + ", " +
                    "getPneus: " + VeiculoMapper.printPneus(super.getPneus()) +
                " }";
    }


}
