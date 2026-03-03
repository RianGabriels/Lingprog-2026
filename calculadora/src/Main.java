import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double primeiro = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double segundo = entrada.nextDouble();
        System.out.println(
                "Digite a operação que voçê deseja executar: "+
                        "1 para Soma"+
                        "2 para Subtração"+
                        "3 para Mutiplicação"+
                        "4 para Divisão"
        );
        int operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                System.out.println(primeiro + segundo);
                break;
            case 2:
                System.out.println(primeiro - segundo);
                break;
            case 3:
                System.out.println(primeiro * segundo);
                break;
            case 4:
                System.out.println(primeiro / segundo);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}