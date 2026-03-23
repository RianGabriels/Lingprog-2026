import java.util.Scanner;

public class NomeInverte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new  String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = input.nextLine();
        }
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println("Nome ordem invertida: " + nomes[i]);
        }
    }
}