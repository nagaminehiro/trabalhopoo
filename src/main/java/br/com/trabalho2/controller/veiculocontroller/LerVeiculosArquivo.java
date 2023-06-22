package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho1.veiculo.Veiculo;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LerVeiculosArquivo {

    public static List<Veiculo> lerVeiculosArquivo() {
        List<Veiculo> veiculosArq = null;
        File arquivo = new File("veiculo.dat");
        try {
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin);

            veiculosArq = (List<Veiculo>) oin.readObject();
            oin.close();
            fin.close();
            for (Veiculo veiculo: veiculosArq) {
                System.out.println(veiculo);
            }
        } catch (Exception ex) {
            System.err.println("Erro ao ler veículos do arquivo: " + ex.toString());
        }
        return veiculosArq;
    }
}
