package br.com.trabalho2.controller;


import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.controller.veiculocontroller.IncluirVeiculoController;
import br.com.trabalho2.controller.veiculocontroller.RemoverVeiculoController;
import br.com.trabalho2.model.Esportivo;


import java.util.ArrayList;
import java.util.List;


public class Simulador {

    private static final List<Veiculo> veiculos = new ArrayList<>();


    public void incluirVeiculo() {
        IncluirVeiculoController.incluirVeiculo(veiculos);
    }

    public void removerVeiculo(int id){
        try{
            RemoverVeiculoController.removeVeiculo(veiculos, id);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
