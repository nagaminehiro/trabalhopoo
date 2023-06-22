package br.com.trabalho2.util;

import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.model.Pneu;

import java.util.List;
import java.util.stream.Collectors;

public final class VeiculoMapper {



    public static Veiculo veiculoMapper(Object veiculo){
        return (Veiculo) veiculo;
    }

    public static VeiculoMotorizado veiculoMotorizadoMapper(Object veiculo){
        return (VeiculoMotorizado) veiculo;
    }

    public static String printPneus(List<Pneu> pneuList){
        return pneuList.stream().map(item -> item.toString()).collect(Collectors.joining());
    }

    public static Veiculo getVeiculo(List<Object> veiculoList, int id){
        // busco o veiculo na lista pelo ID
        var veiculo = veiculoList.stream().filter(item -> VeiculoMapper.veiculoMapper(item).getId() == id).findFirst().orElse(null);
        // valido se existe o veiculo
        Validations.validateExists(veiculo);
        // valido se ele é diferente de bicicleta
        Validations.validateVehicle(veiculo);
        // removo o veiculo da lista
        veiculoList.remove(veiculo);
        // converto o tipo do objeto para veiculo Motorizado
        return VeiculoMapper.veiculoMotorizadoMapper(veiculo);
    }
}
