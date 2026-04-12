import java.util.Scanner;

public class SubValor {
    public static void digite(int[] numeros){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = input.nextInt();
            if (numeros[i] <= -1) {
                numeros[i] = 0;
            }
        }
    }
    public static void substitua(int[] numeros){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        digite(numeros);
        substitua(numeros);
    }
}
