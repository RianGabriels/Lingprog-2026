import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = input.nextLine();
        if (senha == nome) {
            System.out.println("Digite uma senha diferente do seu nome");
            senha = input.nextLine();
        }
        System.out.println("Digite seu nome: "+nome);
        System.out.println("Digite sua senha: "+senha);
    }
}
