package br.com.trabalho2.util;

import br.com.trabalho2.exception.RunException;
import br.com.trabalho2.model.Bicicleta;

public class Validations {


    public static void validateVehicle(Object item){
        if(item instanceof Bicicleta){
            throw new RunException("Veiculo não pode ser abastecido pois é uma bicicleta!");
        }
    }

    public static void validateExists(Object item){
        if(item == null){
            throw new RunException("Veiculo não encontrado!");
        }
    }

}
