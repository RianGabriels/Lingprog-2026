import java.util.Scanner;

public class SistEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] produtos = new String[5];
        Float[] quantidades = new Float[5];
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto: ");
            produtos[i] = input.next();
            System.out.println("Digite a quantidade em estoque do produto: ");
            quantidades[i] = input.nextFloat();
            }
        boolean estoque = false;
        for (int i = 0; i < quantidades.length; i++) {
            if(quantidades[i] <=
            ){
                System.out.println("Esses são os produtos com estoque critico: "+produtos[i]);
                estoque = true;
                break;
            }
        }
        if (!estoque) {
            System.out.println("Todos os produtos estão em boa quantidade");
        }
    }
}
