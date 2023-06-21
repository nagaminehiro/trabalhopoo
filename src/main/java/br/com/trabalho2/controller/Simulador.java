package br.com.trabalho2.controller;

import br.com.trabalho1.veiculo.Veiculo;
import br.com.trabalho2.util.TipoVeiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Simulador {

    private static final List<Veiculo> veiculos = new ArrayList<>();


    public void incluirVeiculo() {
        Scanner scanner = new Scanner(System.in);
        if(veiculos.size() < 20){
            Random random = new Random();
            int id = random.nextInt(1000);
            boolean ipvaPago = random.nextBoolean();
            boolean pneuCalibrado = random.nextBoolean();

            System.out.println("Informe o tipo do veiculo: EX: " + TipoVeiculos.listTipoVeiculo());
            var ret = scanner.next();
            do{
                if(!TipoVeiculos.verifyValidValue(ret)){
                    System.out.println("Veiculo inválido selecione: EX: " + TipoVeiculos.listTipoVeiculo());
                    ret = scanner.next();
                }
            }while (!TipoVeiculos.verifyValidValue(ret));

            if(ipvaPago){

            }

            if(pneuCalibrado){

            }

        }
    }

}
