import java.util.Scanner;

public class somatoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos numeros você deseja somar: ");
        int quantos = input.nextInt();
        int numero = 0;
        int soma = 0;
        for (int i = 1; i <= quantos; i++) {
            System.out.println("Digite um numero: ");
            numero = input.nextInt();
            soma = soma+numero;
        }
        System.out.println("A soma dos numeros digitado é: " + soma);
    }
}
