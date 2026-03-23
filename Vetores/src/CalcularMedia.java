import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        float soma = 0;
        float[] notas = new float[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a nota: "+(i+1));
            notas[i] = input.nextFloat();
            soma += notas[i];
        }
        System.out.println("A média é: "+soma/5);
    }
}