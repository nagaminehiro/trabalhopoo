package br.com.trabalho2.controller.veiculocontroller;

import br.com.trabalho1.veiculo.Veiculo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class GravarVeiculosArquivo {

    public void gravarVeiculosArquivo(List<Veiculo> veiculos) {
        File arquivo = new File("veiculo.dat");
        try {
            FileOutputStream fout = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(veiculos);

            oos.flush();
            oos.close();
            fout.close();
            System.out.println("Veículos gravados no arquivo com sucesso.");
        } catch (Exception ex) {
            System.err.println("Erro ao gravar veículos no arquivo: " + ex.toString());
        }
    }
}
