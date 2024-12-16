import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declarando variáveis
        int op = 1;
        int escolha;


        // Instanciando objetos
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        while (op == 1){
            System.out.println("Você deseja cadastrar um Carro ?");
            System.out.println("Digite 1 se deseja continuar, digite 2 se deseja parar!\n");
            escolha = scanner.nextInt();

            if (escolha == 2)
                // O loop vai parar
                break;

            scanner.nextLine();

            System.out.println("Digite a placa do carro:");
            carro.placa = scanner.nextLine();
            System.out.println("Digite o modelo do carro (Sedã, Hat, SUV, etc):");
            carro.modelo = scanner.nextLine();
            System.out.println("Digite o ano de fabricação do carro ou ano em que foi lançado:");
            carro.ano_de_fabricacao = scanner.nextInt();

            carro.calcularImposto();
            carro.totalIsentos();

            System.out.println("Placa: " + carro.placa);
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Ano de Fabricação: " + carro.ano_de_fabricacao);
            System.out.println("Imposto a ser pago: R$" + carro.imposto);
            System.out.println("\n----------------------------------------------------");
        }
        carro.Relatorio();
    }
}