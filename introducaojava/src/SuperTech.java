import java.util.Scanner;

public class SuperTech {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite o valor bruto da compra: ");
        float valorBruto = input.nextFloat();
        int opcao;
        do {
            System.out.println("Escolha uma das opcoes: \n 1. A vista \n 2. Parcelado no cartao \n 3. Crediario da loja \n 0. Cancelar venda");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Valor a pagar: " +(valorBruto-valorBruto*0.15f));
                    break;
                case 2 :
                    System.out.println("Quantidade de parcelas: (até 5x)");
                    int quante = input.nextInt();
                    for (int i=1; i<=quante; i++) {
                        System.out.println("Sua "+i+" parcela é igual a esse valor: " +valorBruto/i);
                    }
                    break;
                case 3:
                    float extra = valorBruto+valorBruto*0.2f;
                    System.out.println("Valor a pagar: " +extra);
                    System.out.println("Valor a pagar por mes: " +extra/10);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                default:
                    System.out.println("Opcao invalida");
            }
        }
        while (opcao != 0);
    }
}
