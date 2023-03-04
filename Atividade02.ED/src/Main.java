//Algoritmo 358
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precoCompra = new double[100];
        double[] precoVenda = new double[100];
        int totLucroMenor10 = 0;
        int totLucroMenor20 = 0;
        int totLucroMaior20 = 0;

        // Entrada de dados
        for (int i = 0; i < 100; i++) {
            System.out.print("Preço de compra da mercadoria " + (i+1) + ": ");
            precoCompra[i] = sc.nextDouble();

            System.out.print("Preço de venda da mercadoria " + (i+1) + ": ");
            precoVenda[i] = sc.nextDouble();
        }

        // Processamento
        for (int i = 0; i < 100; i++) {
            double lucro = precoVenda[i] - precoCompra[i];

            if (lucro < 0) {
                // Tratamento de erro caso o preço de venda seja menor do que o preço de compra
                System.out.println("Erro: Preço de venda menor do que o preço de compra para a mercadoria " + (i+1));
                continue;
            }

            if (lucro < 0.1 * precoCompra[i]) {
                totLucroMenor10++;
            } else if (lucro <= 0.2 * precoCompra[i]) {
                totLucroMenor20++;
            } else {
                totLucroMaior20++;
            }
           
        }

        // Saída de dados
        System.out.println("Total de mercadorias com lucro < 10%: " + totLucroMenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totLucroMaior20);

        
    }
    
}