public class Main {
    static void main() {
        // variavel do tipo string
        String nome = "Rian";
        // variavel do tipo int
        int idade = 20;
        // variavel do tipo float
        float peso = 74.5f;
        float altura = 1.80f;
        // calcular imc
        float imc = peso/(altura*altura);
        System.out.println( nome + " Seu IMC é " + imc);
        if (imc < 18.5f) {
            System.out.println("Você...");
        }
    }
}