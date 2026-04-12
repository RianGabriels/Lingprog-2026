import java.util.Scanner;

public class NomeInverte {
    public static void digite(String[] nomes) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = input.nextLine();
        }
    }
    public static void inverte(String[] nomes) {
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println("Nome ordem invertida: " + nomes[i]);
        }
    }
    public static void main(String[] args) {
        String[] nomes = new  String[5];

        digite(nomes);
        inverte(nomes);
    }
}