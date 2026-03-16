import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        int nota = input.nextInt();
        int condicao = 1;
            if(nota < 0 || nota > 10) {
                System.out.println("Nota invalida, tente novamente");
                nota = input.nextInt();
            }
            System.out.println("A nota escolhida foi: "+nota);
    }
}