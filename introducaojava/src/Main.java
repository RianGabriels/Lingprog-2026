import java.util.Scanner;

public class Main {
    static void main() {
        // solicita entrada de dados
        Scanner entrada = new Scanner(System.in);
        // variavel do tipo string
        System.out.println("Informe seu nome: ");
        String nome = entrada.next();
        // variavel do tipo int
        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();
        // variavel do tipo float
        System.out.println("Informe seu peso: ");
        float peso = entrada.nextFloat();
        System.out.println("Informe sua altura: ");
        float altura = entrada.nextFloat();
        // calcular imc
        float imc = peso/(altura*altura);
        System.out.println( nome + " Seu IMC é " + imc);
        String mensagem = "";
        if (imc >= 0 && imc < 18.5f) {
            mensagem = "Magro";
        }
        else if (imc >= 18.5f && imc < 25f) {
            mensagem = "Peso normal";
        }
        else if (imc >= 25f && imc < 30f) {
            mensagem = "Sobrepeso";
        }
        else if (imc >= 30f) {
            mensagem = "Obesidade";
        }
        else mensagem = "Valor invalido";

        System.out.println(nome+" Sua classificação é: "+mensagem);
    }
}