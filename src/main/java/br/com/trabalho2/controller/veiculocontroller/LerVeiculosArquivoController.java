package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho1.veiculo.Veiculo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LerVeiculosArquivoController {

    public static List<Veiculo> lerVeiculosArquivo() throws Exception{
        File arquivo = new File("veiculo.dat");
        FileInputStream fin = new FileInputStream(arquivo);
        ObjectInputStream oin = new ObjectInputStream(fin);

        var veiculosArq = oin.readObject();
        oin.close();
        fin.close();
        System.out.println(veiculosArq);
        return null;
    }
}
