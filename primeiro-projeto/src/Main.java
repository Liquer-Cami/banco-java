import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Camila";
        String tipoConta = "corrente";
        double saldo = 1500.00;
        int opcao = 0;
        System.out.println("==================");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("saldo: " + saldo);
        System.out.println("==================");
        Scanner leitura = new Scanner(System.in);

        String menu = """
                Digite a opço desejada:
                1- Consultar saldo
                2- Trasnferir saldo
                3- Receber valor
                4- Sair
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            double valor = 0;

            if(opcao == 1){
                valor = saldo;
                System.out.println("Saldo atual: " + saldo);
            }
            if (opcao == 2) {
                System.out.println("Digite o valor que gostaria de transferir");
                valor = leitura.nextDouble();
                saldo -= valor;
                System.out.println("Seu saldo atual é " + saldo);
            } else if (saldo < valor) {
                System.out.println("Saldo insuficiente");
            }
            if (opcao == 3) {
                System.out.println("Digite o valor recebido");
                valor = leitura.nextDouble();
                saldo+=valor;
                System.out.println("O saldo atual é " + saldo);
            }
        }

    }

    }













