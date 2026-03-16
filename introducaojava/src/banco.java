import java.util.Scanner;

public class banco {
    public static void main(String[] args){
        float saldo = 0;
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Digite uma das opcoes: \n 1. Consultar saldo \n 2. Depositar \n 3. Sacar \n 4. Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual da conta: "+saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor do deposito: ");
                    float valor = input.nextFloat();
                    saldo += valor;
                    break;
                case 3:
                    System.out.println("Quanto deseja sacar: ");
                    valor = input.nextFloat();
                    if (valor <= saldo){
                        saldo -= valor;
                        System.out.println("Saldo realizado com sucesso");
                    }
                    else
                        System.out.println("Saldo insuficiente");
                    break;
                case 4:
                    System.out.println("Progama será encerrado");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
        while (opcao != 4);
    }
}
