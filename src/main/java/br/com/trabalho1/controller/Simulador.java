package br.com.trabalho1.controller;

import br.com.trabalho1.veiculo.Pneu;
import br.com.trabalho1.veiculo.Veiculo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulador {

    private static final List<Veiculo> veiculos = new ArrayList<>();

    /**
     * Construtor da classe Simulador.
     */
    public Simulador() {

    }


    /**
     * Inclui um veículo na lista de veículos do simulador.
     *
     * @return true se o veículo foi incluído com sucesso, false caso contrário.
     */
    public void incluirVeiculo() {
        if (veiculos.size() <= 20) {
            Random random = new Random();
            int id = random.nextInt(1000);
            Pneu[] pneus = { new Pneu(random.nextBoolean()), new Pneu(random.nextBoolean()), new Pneu(random.nextBoolean()), new Pneu(random.nextBoolean()) };
            double valorVenda = random.nextDouble() * 100000;
            boolean ipvaPago = random.nextBoolean();
            Veiculo veiculo = new Veiculo(id, pneus, valorVenda, ipvaPago);
            veiculos.add(veiculo);
            System.out.println("Veículo " + id + " incluído.");
        } else {
            System.out.println("Número máximo de veículos atingido.");
        }
    }

    /**
     * Remove um veículo da lista de veículos do simulador.
     *
     * @param veiculo o veículo a ser removido.
     * @return true se o veículo foi removido com sucesso, false caso contrário.
     */
    public boolean removerVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            veiculos.remove(veiculo);
            System.out.println("Veículo " + veiculo.getId() + " removido.");
            return true;
        }
        return false;
    }

    public Veiculo procuraVeiculo(int id) {
        Veiculo veiculoEncontrado = null;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() == id) {
                veiculoEncontrado = veiculo;
                break;
            }
        }
        if (veiculoEncontrado == null) {
            System.out.println("Veículo não encontrado.");
        }
        return veiculoEncontrado;
    }

    /**
     * Abastece um veículo com uma determinada quantidade de litros.
     *
     * @param veiculo o veículo a ser abastecido.
     * @param quantidadeLitros a quantidade de litros a ser abastecida.
     * @return true se o veículo foi abastecido com sucesso, false caso contrário.
     */
    public boolean abastecerVeiculo(Veiculo veiculo, double quantidadeLitros) {
        if (veiculo != null) {
            double novoCombustivel = veiculo.getCombustivel() + quantidadeLitros;
            veiculo.setCombustivel(novoCombustivel);
            System.out.println("Veículo " + veiculo.getId() + " abastecido com " + quantidadeLitros + " litros.");
        }
        return false;
    }

    /**
     * Movimenta um veículo.
     *
     * @param veiculoMovimentado o veículo a ser movimentado.
     * @return true se o veículo foi movimentado com sucesso, false caso contrário.
     */
    public boolean movimentarVeiculo(Veiculo veiculoMovimentado) {
        if (veiculoMovimentado != null) {
            veiculoMovimentado.movimentar();
            System.out.println("Veículo " + veiculoMovimentado.getId() + " movimentado.");
            return true;
        }
        return false;
    }

    /**
     * Movimenta todos os veículos.
     */
    public void movimentarTodosVeiculos() {
        for (Veiculo veiculo : veiculos) {
            veiculo.movimentar();
        }
        System.out.println("Todos os veículos foram movimentados.");
    }
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    /**
     * Imprime os dados de um veículo com base no seu ID.
     *
     * @param veiculoEncontrado o veículo a ser impresso.
     */
    public void imprimirDadosVeiculo(Veiculo veiculoEncontrado) {
        if (veiculoEncontrado != null) {
            System.out.println(veiculoEncontrado);
        }
    }

    /**
     * Esvazia ou calibra um pneu de um veículo com base no seu ID e no índice do pneu.
     *
     * @param pneuAlterado o veículo.
     * @param acao a ação a ser realizada (esvaziar ou calibrar).
     * @param indicePneu o índice do pneu a ser esvaziado ou calibrado.
     */
    public void esvaziarOuCalibrarPneu(Veiculo pneuAlterado, String acao, int indicePneu) {

        if (pneuAlterado != null) {
            if (indicePneu >= 0 && indicePneu < pneuAlterado.getPneus().length) {
                if (acao.equalsIgnoreCase("esvaziar")) {
                    if(pneuAlterado.setPneu(indicePneu, false)) {
                        System.out.println("Pneu " + indicePneu + " do veículo " + pneuAlterado.getId() + " esvaziado.");
                    }
                } else if (acao.equalsIgnoreCase("calibrar")) {
                    if (pneuAlterado.setPneu(indicePneu, true)) {
                        System.out.println("Pneu " + indicePneu + " do veículo " + pneuAlterado.getId() + " calibrado.");
                    }
                } else {
                    System.out.println("Ação inválida.");
                }
            }
        }
    }

    /**
     * Esvazia ou calibra todos os pneus de um veículo com base no seu ID e na ação desejada.
     *
     * @param veiculo o ID do veículo.
     * @param acao a ação a ser realizada (esvaziar ou calibrar).
     */
    public void esvaziarCalibrarTodosPneus(Veiculo veiculo, String acao) {
        if (veiculo != null) {
            Pneu[] pneus = veiculo.getPneus();
            for (int i = 0; i < pneus.length; i++) {
                if (acao.equalsIgnoreCase("esvaziar")) {
                    veiculo.setPneu(i, false);
                } else if (acao.equalsIgnoreCase("calibrar")) {
                    veiculo.setPneu(i, true);
                }
            }
            System.out.println("Todos os pneus do veículo " + veiculo.getId() + " foram " + acao + "dos.");
        }
    }

    /**
     * Imprime a representação gráfica da pista de corrida com os veículos presentes.
     */
    public void imprimirPistaCorrida() {
        System.out.println("Pista de Corrida:");
        System.out.println("------------------");

        // Percorre os veículos e imprime na ordem em que estão no array
        System.out.println("Pista de Corrida:");
        for (Veiculo veiculo : veiculos) {
            System.out.println("Veículo " + veiculo.getId() + ":");
            int espacosPercorridos = veiculo.getEspacoPercorrido();

            var parte1 = "    __";
            var parte2 = " _/  | \\_";
            var parte3 = "|  _     _``-.       Carro popular";
            var parte4 = "'-()---()--'";

            System.out.println(" ".repeat(espacosPercorridos) + parte1);
            System.out.println(" ".repeat(espacosPercorridos) + parte2);
            System.out.println(" ".repeat(espacosPercorridos) + parte3);
            System.out.println(" ".repeat(espacosPercorridos) + parte4);

            System.out.println("\n\n");
        }
    }

    /**
     * Imprime os dados de todos os veículos presentes na lista.
     */
    public void imprimirDadosVeiculo() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
        }
    }



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

