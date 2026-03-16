import java.util.Scanner;

public class medianota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = input.nextInt();
        int soma = 0;
        int quantos = 1;
        while (idade > -1) {
            System.out.println("Digite uma idade: ");
            idade = input.nextInt();
            quantos++;
            soma = soma + idade;
            continue;
        }
        System.out.println("Digite uma idade: "+soma/quantos);
    }
}
