import java.util.Scanner;

public class BuscaNome {
    public static void digite(String[] nomes) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = input.nextLine();
        }
        System.out.print("Qual nome deseja buscar: ");
        String nome = input.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nome)) {
                System.out.println("Nome encontrado na posição: " + i+1);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nome não cadastrado");
        }
    }
    public static void main(String[] args) {
        String[] nomes = new String[5];

        digite(nomes);
    }
}
