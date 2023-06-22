package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho2.util.Validations;
import br.com.trabalho2.util.VeiculoMapper;

import java.util.List;
import java.util.Scanner;

public class AbastecerVeiculoController {

    public static void abastecerVeiculo(List<Object> veiculoList, int id){

        Scanner scan = new Scanner(System.in);


        // busco o veiculo na lista pelo ID
        var veiculo = veiculoList.stream().filter(item -> VeiculoMapper.veiculoMapper(item).getId() == id).findFirst().orElse(null);

        // valido se existe o veiculo
        Validations.validateExists(veiculo);
        // valido se ele é diferente de bicicleta
        Validations.validateVehicle(veiculo);

        // converto o tipo do objeto para veiculo Motorizado
        var veiculoType = VeiculoMapper.veiculoMotorizadoMapper(veiculo);

        // removo o veiculo da lista
        veiculoList.remove(veiculo);

        // pergunto quantos litros quer abastecer
        System.out.println("Informe a quantidade de litros que deseja abastecer");
        var litros = scan.nextInt();

        // abasteço o veiculo
        veiculoType.abastecer(litros);

        // insiro ele novamente
        veiculoList.add(veiculoType);
    }
}
