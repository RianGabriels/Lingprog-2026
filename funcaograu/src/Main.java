import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite qual operação deseja executar:");
        System.out.println("1 - Função do 1º grau");
        System.out.println("2 - Função do 2º grau");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o valor de a:");
                double a1 = input.nextDouble();
                System.out.println("Digite o valor de b:");
                double b1 = input.nextDouble();
                if (a1 == 0) {
                    System.out.println("Isso não é uma função de 1º grau");
                } else {
                    double x = -b1 / a1;
                    System.out.println("Resultado: x = " + x);
                }
                break;
            case 2:
                System.out.println("Digite o valor de a:");
                double a2 = input.nextDouble();
                System.out.println("Digite o valor de b:");
                double b2 = input.nextDouble();
                System.out.println("Digite o valor de c:");
                double c = input.nextDouble();
                if (a2 == 0) {
                    System.out.println("Isso não é uma função do 2º grau");
                } else {
                    double delta = (b2 * b2) - (4 * a2 * c);
                    if (delta < 0) {
                        System.out.println("Não existem raízes reais");
                    } else {
                        double x1 = (-b2 + Math.sqrt(delta)) / (2 * a2);
                        double x2 = (-b2 - Math.sqrt(delta)) / (2 * a2);
                        System.out.println("Delta = " + delta);
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    }
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}