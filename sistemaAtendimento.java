import java.util.Scanner;

public class SistemaAtendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha<Solicitacao> historicoSolicitacoes = new Pilha<>();
        Fila<Cliente> filaAtendimento = new Fila<>();

        int opcao;
        do {
            System.out.println("\n--- Sistema de Gerenciamento de Atendimento ---");
            System.out.println("1. Registrar nova solicitação");
            System.out.println("2. Visualizar histórico de solicitações");
            System.out.println("3. Inserir cliente na fila de atendimento");
            System.out.println("4. Atender cliente");
            System.out.println("5. Exibir fila de clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    // Registrar nova solicitação
                    System.out.print("Digite o código da solicitação: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Descreva a solicitação: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Informe a data e hora (dd/MM/yyyy HH:mm): ");
                    String dataHora = scanner.nextLine();
                    historicoSolicitacoes.empilhar(new Solicitacao(codigo, descricao, dataHora));
                    System.out.println("Solicitação registrada com sucesso.");
                    break;

                case 2:
                    // Exibir histórico de solicitações
                    System.out.println("\n--- Histórico de Solicitações ---");
                    historicoSolicitacoes.exibirPilha();
                    break;

                case 3:
                    // Inserir cliente na fila
                    System.out.print("Informe o ID do cliente: ");
                    String id = scanner.nextLine();
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Motivo do atendimento: ");
                    String motivo = scanner.nextLine();
                    filaAtendimento.adicionar(new Cliente(id, nome, motivo));
                    System.out.println("Cliente adicionado à fila.");
                    break;

                case 4:
                    // Atender cliente
                    Cliente clienteAtendido = filaAtendimento.atender();
                    if (clienteAtendido != null) {
                        System.out.println("Atendendo cliente: " + clienteAtendido);
                    }
                    break;

                case 5:
                    // Exibir fila de clientes
                    System.out.println("\n--- Fila de Clientes ---");
                    filaAtendimento.exibirFila();
                    break;

                case 0:
                    // Encerrar o sistema
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
