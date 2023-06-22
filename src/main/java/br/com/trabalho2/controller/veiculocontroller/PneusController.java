package br.com.trabalho2.controller.veiculocontroller;


import br.com.trabalho2.exception.RunException;
import br.com.trabalho2.model.Pneu;
import br.com.trabalho2.util.CommonVeiculos;
import br.com.trabalho2.util.VeiculoMapper;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PneusController {

    public static void calibrarPneu(List<Object> veiculoList, int idVeiculo){
        Scanner scan = new Scanner(System.in);
        var veiculo = VeiculoMapper.getVeiculo(veiculoList, idVeiculo);

        System.out.println("Escolha uma opção");
        System.out.println("1 - Calibrar");
        System.out.println("2 - Esvaziar");
        var opcao = scan.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Escolha o pneu que deseja calibrar! opçoes: " + veiculo.getPneus().stream().map(item -> " " + item.getIdentificaoPneu()).collect(Collectors.joining()));
                System.out.println("Legenda: " + CommonVeiculos.listTipoPneus());
                var pneu = scan.next();

                veiculo.getPneus().stream().filter(item -> item.getIdentificaoPneu().equals(pneu)).forEach(item -> calibrarPneu(item));
                break;
            case 2:
                System.out.println("Escolha o pneu que deseja calibrar! opçoes: " + veiculo.getPneus().stream().map(item -> " " + item.getIdentificaoPneu()).collect(Collectors.joining()));
                System.out.println("Legenda: " + CommonVeiculos.listTipoPneus());
                pneu = scan.next();

                veiculo.getPneus().stream().filter(item -> item.getIdentificaoPneu().equals(pneu)).forEach(item -> esvaziarPneu(item));
                break;
            default: throw new RunException("Opção inválida");
        }
        veiculoList.add(veiculo);
    }

    public static void calibrarPneu(List<Object> veiculoList, String className){

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opção");
        System.out.println("1 - Calibrar");
        System.out.println("2 - Esvaziar");
        var opcao = scan.nextInt();

        List<Object> v = null;
        switch (opcao){
            case 1:
                v = veiculoList.stream().filter(item -> item.getClass().getSimpleName().equals(className)).collect(Collectors.toList());
                veiculoList.removeAll(v);

                var veiculos = v.stream().map(VeiculoMapper::veiculoMapper).collect(Collectors.toList());

                veiculos.forEach(item -> {
                    item.getPneus().forEach(index -> {
                        index.setCalibragemPneu(true);
                    });
                });

                veiculoList.addAll(veiculos);
                break;
            case 2:
                v = veiculoList.stream().filter(item -> item.getClass().getSimpleName().equals(className)).collect(Collectors.toList());
                veiculoList.removeAll(v);

                veiculos = v.stream().map(VeiculoMapper::veiculoMapper).collect(Collectors.toList());

                veiculos.forEach(item -> {
                    item.getPneus().forEach(index -> {
                        index.setCalibragemPneu(false);
                    });
                });

                veiculoList.addAll(veiculos);;
            default: throw new RunException("Opção inválida");
        }

    }

    private static void calibrarPneu(Pneu pneu){
        pneu.setCalibragemPneu(true);
    }

    private static void esvaziarPneu(Pneu pneu){
        pneu.setCalibragemPneu(false);
    }



}
