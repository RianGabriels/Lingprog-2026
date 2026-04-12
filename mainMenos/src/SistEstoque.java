import java.util.Scanner;

public class SistEstoque {
    public static void digite(String[] produtos, float[] quantidades) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto: ");
            produtos[i] = input.next();
            System.out.println("Digite a quantidade em estoque do produto: ");
            quantidades[i] = input.nextFloat();
        }
    }
    public static void estoque(String[] produtos, float[] quantidades) {
        boolean estoque = false;
        for (int i = 0; i < quantidades.length; i++) {
            if(quantidades[i] <= produtos.length) {
                System.out.println("Esses são os produtos com estoque critico: "+produtos[i]);
                estoque = true;
                break;
            }
        }
        if (!estoque) {
            System.out.println("Todos os produtos estão em boa quantidade");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] produtos = new String[5];
        float[] quantidades = new float[5];

        digite(produtos, quantidades);
        estoque(produtos, quantidades);
    }
}