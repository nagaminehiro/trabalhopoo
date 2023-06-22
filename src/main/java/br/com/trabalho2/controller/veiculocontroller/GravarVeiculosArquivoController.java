package br.com.trabalho2.controller.veiculocontroller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class GravarVeiculosArquivoController {

    public static void gravarVeiculosArquivo(List<Object> veiculos)throws IOException {
        File arquivo = new File("veiculo.dat");
        FileOutputStream fout = new FileOutputStream(arquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(veiculos);
        oos.flush();
        oos.close();
        fout.close();
        System.out.println("Veículos gravados no arquivo com sucesso.");
    }
}
