import java.util.Scanner;

public class Ex2 {
    public static boolean ehPar(int numero) {
        return (numero % 2 == 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = input.nextInt();
        System.out.println("Seu numero é: "+ehPar(numero));
        if (ehPar(numero)) {
            System.out.println("Numero é par");
        }
        else System.out.println("Numero é impar");
    }
}
