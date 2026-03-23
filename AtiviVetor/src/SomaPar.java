import java.util.Scanner;

public class SomaPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int[] num = new int[8];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um numero: ");
            num[i] = input.nextInt();
            if (num[i] % 2 == 0) {
                soma += num[i];
            }
        }
        System.out.println("Soma dos numeros pares: "+soma);
    }
}
