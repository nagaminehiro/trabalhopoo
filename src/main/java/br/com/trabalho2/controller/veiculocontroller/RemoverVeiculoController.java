package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.exception.RunException;

import java.util.List;
import java.util.Objects;

public class RemoverVeiculoController {

    public static void removeVeiculo(List<Object> veiculoList, int id){

        if(veiculoList.stream().anyMatch(item -> veiculoMapper(item).getId() == id)){
            veiculoList.removeIf(item -> veiculoMapper(item).getId() == id);
        } else {
            throw new RunException("Veiculo não encontrado!");
        }
    }

    private static Veiculo veiculoMapper(Object veiculo){
        return (Veiculo) veiculo;
    }


}
