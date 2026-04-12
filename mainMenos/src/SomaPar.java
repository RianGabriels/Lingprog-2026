import java.util.Scanner;

public class SomaPar {
    public static void digite(int[] num) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um numero: ");
            num[i] = input.nextInt();
            if (num[i] % 2 == 0) {
                soma += num[i];
            }
        }
        System.out.println("Soma dos numeros pares: "+soma);
    }
    public static void main(String[] args) {
        int[] num = new int[8];

        digite(num);
    }
}