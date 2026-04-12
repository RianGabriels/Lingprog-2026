import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numerador da primeira fração: ");
        int num1 = input.nextInt();
        System.out.print("Digite o denominador da primeira fração: ");
        int den1 = input.nextInt();
        System.out.print("Digite o numerador da segunda fração: ");
        int num2 = input.nextInt();
        System.out.print("Digite o denominador da segunda fração: ");
        int den2 = input.nextInt();
        int numeradorResultado = (num1 * den2) + (num2 * den1);
        int denominadorResultado = den1 * den2;
        System.out.println("Resultado da soma: " + numeradorResultado + "/" + denominadorResultado);
    }
}