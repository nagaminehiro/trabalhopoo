package br.com.trabalho1;

import br.com.trabalho1.controller.Simulador;
import br.com.trabalho1.veiculo.Veiculo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Simulador simulador = new Simulador();

        // Loop principal do programa
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    // Adicionar o veículo ao simulador
                    simulador.incluirVeiculo();
                    break;
                }

                case 2: {   // Remover um veículo do simulador
                    System.out.println("== Remover Veículo ==");
                    System.out.print("Informe o ID do veículo a ser removido: ");
                    int idVeiculo = scanner.nextInt();

                    Veiculo veiculo = simulador.procuraVeiculo(idVeiculo);

                    if (veiculo != null) {
                        simulador.removerVeiculo(veiculo);
                    }
                    break;
                }

                case 3: {// Abastecer um veículo do simulador
                    System.out.println("== Abastecer Veículo ==");
                    System.out.print("Informe o ID do veículo a ser abastecido: ");
                    int idVeiculo = scanner.nextInt();

                    Veiculo veiculo = simulador.procuraVeiculo(idVeiculo);

                    if (veiculo != null) {
                        System.out.print("Informe a quantidade de combustível em litros: ");
                        double quantidadeCombustivel = scanner.nextDouble();
                        simulador.abastecerVeiculo(veiculo, quantidadeCombustivel);
                    }
                    break;
                }

                case 4: {
                    // Movimentar um veículo do simulador
                    System.out.println("== Movimentar Veículo ==");
                    System.out.print("Informe o ID do veículo a ser movimentado: ");
                    int idVeiculo = scanner.nextInt();

                    Veiculo veiculo = simulador.procuraVeiculo(idVeiculo);
                    if (veiculo != null) {
                        simulador.movimentarVeiculo(veiculo);
                    }
                    break;
                }

                case 5: {
                    // Movimentar todos os veículos do simulador
                    System.out.println("== Movimentar Todos os Veículos ==");
                    simulador.movimentarTodosVeiculos();
                    break;
                }
                case 6: {   // Imprimir os dados de um veículo específico
                    System.out.println("== Imprimir Dados de um Veículo ==");
                    System.out.print("Informe o ID do veículo: ");
                    int idVeiculo = scanner.nextInt();

                    Veiculo veiculo = simulador.procuraVeiculo(idVeiculo);
                    if (veiculo != null) {
                        simulador.imprimirDadosVeiculo(veiculo);
                    }
                    break;
                }
                case 7: {
                    // Esvaziar ou calibrar um pneu específico de um veículo
                    System.out.println("== Esvaziar ou Calibrar Pneu Específico ==");
                    System.out.print("Informe o ID do veículo: ");
                    int idVeiculo = scanner.nextInt();

                    Veiculo veiculo = simulador.procuraVeiculo(idVeiculo);

                    if (veiculo != null) {
                        System.out.print("Informe a ação a ser realizada (esvaziar/calibrar): ");
                        String acao = scanner.next();
                        System.out.print("Informe o número do pneu: ");
                        int numeroPneu = scanner.nextInt();

                        if (veiculo.getPneus().length <= numeroPneu || numeroPneu<0) {
                            System.out.println("Pneu não existe");
                        } else {
                            simulador.esvaziarOuCalibrarPneu(veiculo, acao, numeroPneu);
                        }
                    }
                    break;
                }
                case 8: {
                    // Esvaziar ou calibrar todos os pneus de um veículo
                    System.out.println("== Esvaziar ou Calibrar Todos os Pneus de um Veículo ==");
                    System.out.print("Informe o ID do veículo: ");
                    int idVeiculo = scanner.nextInt();

                    Veiculo veiculo = simulador.procuraVeiculo(idVeiculo);

                    if (veiculo != null) {
                        System.out.print("Informe a ação a ser realizada (esvaziar/calibrar): ");
                        String acaoTodos = scanner.next();
                        simulador.esvaziarCalibrarTodosPneus(veiculo, acaoTodos);
                    }
                    break;
                }
                case 9: {
                    // Imprimir a pista de corrida do simulador
                    System.out.println("== Imprimir Pista de Corrida ==");
                    simulador.imprimirPistaCorrida();
                    break;
                }
                case 10: {   // Imprimir os dados de todos os veículos no simulador
                    System.out.println("== Imprimir Veículos ==");
                    simulador.imprimirDadosVeiculo();
                    break;
                }
                case 11: {   // Imprimir os dados de todos os veículos no simulador
                    System.out.println("== Gravar Veículos em Arquivo ==");
                    simulador.gravarVeiculosArquivo(simulador.getVeiculos());
                    break;
                }
                case 12: {   // Imprimir os dados de todos os veículos no simulador
                    System.out.println("== Ler Veículos de Arquivo ==");
                    simulador.lerVeiculosArquivo();
                    break;
                }
                case 13: {   // Encerrar o programa
                    System.out.println("Encerrando o programa...");
                    break;
                }
                default: {   // Opção inválida
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            }
        } while (opcao != 0);

        // Encerrando o programa
        System.out.println("Encerrando o programa...");
    }

    // Método para exibir o menu de opções
    private static void exibirMenu() {
        System.out.println("\n======= Menu =======");
        System.out.println("1. Incluir Veículo");
        System.out.println("2. Remover Veículo");
        System.out.println("3. Abastecer Veículo");
        System.out.println("4. Movimentar Veículo");
        System.out.println("5. Movimentar Todos os Veículos");
        System.out.println("6. Imprimir Dados de um Veículo");
        System.out.println("7. Esvaziar ou Calibrar Pneu Específico");
        System.out.println("8. Esvaziar ou Calibrar Todos os Pneus de um Veículo");
        System.out.println("9. Imprimir Pista de Corrida");
        System.out.println("10. Imprimir Veículos na Ordem do Array");
        System.out.println("11. Gravar Veículos no Arquivo");
        System.out.println("12. Ler Veículos do Arquivo");
        System.out.println("13. Imprimir Veículos na Ordem do Array");
        System.out.println("Digite o número da opção desejada:");
    }
}