package br.com.trabalho2.controller;

import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.controller.veiculocontroller.*;
import br.com.trabalho2.model.*;
import br.com.trabalho2.util.CommonVeiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Simulador {

    private static final List<Object> veiculos = new ArrayList<>();
    private static final int qtdVeiculos = 20;


    public static void incluirVeiculo(List<Object> veiculoList){
        Scanner scanner = new Scanner(System.in);
        if(veiculoList.size() < Simulador.qtdVeiculos){
            Random random = new Random();
            int id = random.nextInt(1000);
            boolean ipvaPago = random.nextBoolean();
            boolean pneuCalibrado = random.nextBoolean();
            double qtdCombustivel = 2.5;

            System.out.println("Informe o tipo do veiculo: EX: " + CommonVeiculos.listTipoVeiculo());
            var ret = scanner.next();
            do{
                if(!CommonVeiculos.verifyValidValue(ret)){
                    System.out.println("Veiculo inválido selecione: EX: " + CommonVeiculos.listTipoVeiculo());
                    ret = scanner.next();
                }
            }while (!CommonVeiculos.verifyValidValue(ret));


            if(ret.equals("B")){
                var veiculo = new Bicicleta();
                veiculo.setId(id);
                veiculo.setQuantidadePneus(2);
                veiculo.setPneus(setPneus(retIdentificacaoPneu(ret),pneuCalibrado));
                veiculoList.add(veiculo);

            } else {
                var veiculo = getInstanceVeiculoMotorizado(ret);
                veiculo.setId(id);
                veiculo.setQuantidadePneus((veiculo instanceof Motocicleta ? 2 : 4));
                veiculo.setPneus(setPneus(retIdentificacaoPneu(ret),pneuCalibrado));
                veiculo.setCombustivel(2.25);
                veiculoList.add(veiculo);
            }
        }
    }

    private static VeiculoMotorizado getInstanceVeiculoMotorizado(String v){
        return switch (v){
            case "M" -> new Motocicleta();
            case "C" -> new CarroPasseio();
            case "E" -> new Esportivo();
            default -> null;
        };
    }

    private static List<Pneu> setPneus(List<String> identificacaoPneus, boolean estaCalibrado){
        List<Pneu> pneus = new ArrayList<>();
        var i = 0;
        for (var pneu: identificacaoPneus) {
            pneus.add( new Pneu(estaCalibrado, pneu));
        }
        return pneus;
    }

    private static List<String> retIdentificacaoPneu(String v){
        return switch (v){
            case "M", "B" -> List.of("D","T");
            default -> List.of("DD","DE","TE","TD");
        };
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
            PneusController.calibrarPneu(veiculos, className);
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
    public void lerVeiculosArquivo(){
        try{
            LerVeiculosArquivoController.lerVeiculosArquivo();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void movimentarVeiculoEspecifico(){
        try{
            MovimentarVeiculoController.movimentarVeiculoEspecifico();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void movimentarVeiculosPorTipo() {
        try {
            MovimentarVeiculoController.movimentarVeiculosPorTipo();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void movimentarTodosOsVeiculos() {
        try {
            MovimentarVeiculoController.movimentarTodosVeiculos();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
