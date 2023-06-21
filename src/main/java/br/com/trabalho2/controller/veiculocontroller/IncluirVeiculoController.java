package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.util.TipoVeiculos;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IncluirVeiculoController {

    public static void incluirVeiculo(List<Veiculo> veiculoList){
        Scanner scanner = new Scanner(System.in);
        if(veiculoList.size() < 20){
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
