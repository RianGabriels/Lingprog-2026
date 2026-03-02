import java.util.Scanner;

static void main() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    String nome = entrada.next();
    System.out.println("Informe o KWh anterior: ");
    int anterior = entrada.nextInt();
    System.out.println("Informe o tempo do atual: ");
    int atual = entrada.nextInt();
    float consumo = atual - anterior;
    float preco = consumo * 0.60f;
    float addband = 0;
    String corband = "";
    if (consumo <= 100) {
        corband = "Verde";
        addband = 0;
    }
    else if (consumo <= 200) {
        corband = "Amarelo";
        addband = 2.00f;
    }
    else if (consumo <= 300) {
        corband = "Vermelho";
        addband = 5.00f;
    }
    else {
        corband = "Preto";
        addband = 10.00f;
    }
    float valorfinal = preco + addband;
    System.out.println("Cliente: "+nome);
    System.out.println("Consumo total: "+consumo);
    System.out.println("Bandeira: "+corband);
    System.out.println("Valor total: R$"+valorfinal);
}