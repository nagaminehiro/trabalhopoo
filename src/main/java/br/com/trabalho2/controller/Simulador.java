package br.com.trabalho2.controller;

import br.com.trabalho2.controller.veiculocontroller.*;

import java.util.ArrayList;
import java.util.List;


public class Simulador {

    private static final List<Object> veiculos = new ArrayList<>();


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

    public void abastecerVeiculo(int id){
        try{
            AbastecerVeiculoController.abastecerVeiculo(veiculos, id);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void imprimirVeiculos(){
        try{
            ImprimirVeiculoController.imprimeVeiculo(veiculos);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void imprimirVeiculo(int id){
        try{
            ImprimirVeiculoController.imprimeVeiculoEspecifico(veiculos, id);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void calibrarEsvaziarPneuEspecifico(int id){
        try{
            PneusController.calibrarPneu(veiculos, id);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void calibrarEsvaziarTodos(String className){
        try{
            PneusController.calibrarAllPneu(veiculos, className);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void gravarVeiculosArquivo(){
        try{
            GravarVeiculosArquivoController.gravarVeiculosArquivo(veiculos);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}
