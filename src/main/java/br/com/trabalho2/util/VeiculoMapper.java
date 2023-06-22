package br.com.trabalho2.util;

import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.common.VeiculoMotorizado;

public final class VeiculoMapper {

    public static Veiculo veiculoMapper(Object veiculo){
        return (Veiculo) veiculo;
    }

    public static VeiculoMotorizado veiculoMotorizadoMapper(Object veiculo){
        return (VeiculoMotorizado) veiculo;
    }
}
