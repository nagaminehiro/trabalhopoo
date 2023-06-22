package br.com.trabalho2.util;

import br.com.trabalho2.common.Veiculo;
import br.com.trabalho2.common.VeiculoMotorizado;
import br.com.trabalho2.model.Bicicleta;
import br.com.trabalho2.model.CarroPasseio;
import br.com.trabalho2.model.Esportivo;
import br.com.trabalho2.model.Motocicleta;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicReference;

public final class CommonVeiculos {

    private static Hashtable<String, Object> tipoVeiculos = new Hashtable<>();
    private static Hashtable<String, Object> pneus = new Hashtable<>();


    private static void setTipoVeiculos(){
        if(tipoVeiculos.isEmpty()){
            tipoVeiculos.put("B", "Bicicleta");
            tipoVeiculos.put("M", "Motocicleta");
            tipoVeiculos.put("C", "Carro Passeio");
            tipoVeiculos.put("E", "Carro Esportivo");
        }
    }

    private static void setTipoPneus(){
        if(pneus.isEmpty()){
            pneus.put("D", "Dianteiro");
            pneus.put("T", "Traseiro");
            pneus.put("DE", "Dianteiro Esquerdo");
            pneus.put("DD", "Dianteiro Direito");
            pneus.put("TE", "Traseiro Esquerdo");
            pneus.put("TD", "Traseiro Direito");
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



    public static String listTipoPneus(){
        setTipoPneus();
        AtomicReference<String> ref = new AtomicReference<>("");
        pneus.forEach((k, v) -> ref.set(ref.get() + k + " - " + v + ", "));
        return ref.get();
    }

    public static boolean verifyValidValuePneus(String k){
        return pneus.containsKey(k);
    }

    public static String getClassName(String v){
        return switch (v){
            case "M" -> Motocicleta.class.getSimpleName();
            case "C" -> CarroPasseio.class.getSimpleName();
            case "E" -> Esportivo.class.getSimpleName();
            case "B" -> Bicicleta.class.getSimpleName();
            default -> null;
        };
    }
}
