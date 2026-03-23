import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = input.nextInt();
        }
        int menor = numeros[0];
        int maior = numeros[0];
        int posmaior = numeros[0];
        int posmenor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
                posmenor = i;
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
                posmaior = i;
            }
        }
        System.out.println("Menor valor: " + menor + " Na posição: " + posmenor);
        System.out.println("Maior valor: " + maior + " Na posição: " + posmaior);
    }
}
