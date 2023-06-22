package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho2.util.Validations;
import br.com.trabalho2.util.VeiculoMapper;

import java.util.List;

public class ImprimirVeiculoController {

    public static void imprimeVeiculo(List<Object> veiculos){
        veiculos.forEach(item -> System.out.println(item.toString()));
    }

    public static void imprimeVeiculoEspecifico(List<Object> veiculos, int id){
        var veiculo = veiculos.stream().filter(item -> VeiculoMapper.veiculoMapper(item).getId() == id);
        Validations.validateExists(veiculo);
        veiculo.toString();
    }
}
