import java.util.Scanner;

static void main(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite 1. cadastro 2. consulta 3. Sair");
    int opcao = entrada.nextInt();
    switch (opcao){
        case 1:
            System.out.println("Cadastro realizado");
            break;
        case 2:
            System.out.println("Consulta realizada");
            break;
        case 3:
            System.out.println("Programa será encerrado");
            break;
        default:
            System.out.println("Opção inválida");
    }
}