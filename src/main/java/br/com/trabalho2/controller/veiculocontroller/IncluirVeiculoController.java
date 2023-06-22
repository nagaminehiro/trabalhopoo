package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.model.Bicicleta;
import br.com.trabalho2.model.CarroPasseio;
import br.com.trabalho2.model.Esportivo;
import br.com.trabalho2.model.Motocicleta;
import br.com.trabalho2.util.TipoVeiculos;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IncluirVeiculoController {

    public static void incluirVeiculo(List<Object> veiculoList){
        Scanner scanner = new Scanner(System.in);
        if(veiculoList.size() < 20){
            Random random = new Random();
            int id = random.nextInt(1000);
            boolean ipvaPago = random.nextBoolean();
            boolean pneuCalibrado = random.nextBoolean();
            double qtdCombustivel = 2.5;

            System.out.println("Informe o tipo do veiculo: EX: " + TipoVeiculos.listTipoVeiculo());
            var ret = scanner.next();
            do{
                if(!TipoVeiculos.verifyValidValue(ret)){
                    System.out.println("Veiculo inválido selecione: EX: " + TipoVeiculos.listTipoVeiculo());
                    ret = scanner.next();
                }
            }while (!TipoVeiculos.verifyValidValue(ret));


            if(ret.equals("B")){
               var veiculo = new Bicicleta();
               veiculo.setId(id);
               veiculo.setQuantidadePneus(2);
               veiculoList.add(veiculo);

            } else {
                var veiculo = getInstanceVeiculoMotorizado(ret);
                veiculo.setId(id);
                veiculo.setQuantidadePneus((veiculo instanceof Motocicleta ? 2 : 4));
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
}
