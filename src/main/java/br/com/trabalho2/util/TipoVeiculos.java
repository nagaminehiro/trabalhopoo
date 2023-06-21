package br.com.trabalho2.util;

import br.com.trabalho2.model.Bicicleta;
import br.com.trabalho2.model.CarroPasseio;
import br.com.trabalho2.model.Esportivo;
import br.com.trabalho2.model.Motocicleta;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicReference;

public final class TipoVeiculos {

    //public static List<String> tipoVeiculos = List.of("B - Bicicleta");

    private static Hashtable<String, Object> tipoVeiculos = new Hashtable<>();


    private static void setTipoVeiculos(){
        if(tipoVeiculos.isEmpty()){
            tipoVeiculos.put("B", "Bicicleta");
            tipoVeiculos.put("M", "Motocicleta");
            tipoVeiculos.put("C", "Carro Passeio");
            tipoVeiculos.put("E", "Carro Esportivo");
        }
    }

    public static String listTipoVeiculo(){
        setTipoVeiculos();
        AtomicReference<String> ref = new AtomicReference<>("");
        tipoVeiculos.forEach((k, v) -> ref.set(ref.get() + k + " - " + v + ", "));
        return ref.get();
    }

    public static boolean verifyValidValue(String k){
        return tipoVeiculos.containsKey(k);
    }
}
