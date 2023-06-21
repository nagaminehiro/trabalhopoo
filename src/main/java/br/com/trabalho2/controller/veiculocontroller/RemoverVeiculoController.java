package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.exception.RunException;

import java.util.List;

public class RemoverVeiculoController {

    public static void removeVeiculo(List<Veiculo> veiculoList, int id){
        if(veiculoList.stream().anyMatch(item -> item.getId() == id)){
            veiculoList.removeIf(item -> item.getId() == id);
        } else {
            throw new RunException("Veiculo não encontrado!");
        }

    }
}
