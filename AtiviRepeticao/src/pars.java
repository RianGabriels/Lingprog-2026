import java.util.Scanner;

public class pars{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o limite inferior:");
        int inferior = input.nextInt();
        System.out.println("Digite o limite superior:");
        int superior = input.nextInt();
        System.out.println("Numeros pares no intervalo:");
        for (int i = inferior; i <= superior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
