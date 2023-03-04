//Algoritmo 356
import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[20];
        double[] salarios = new double[20];
        double[] novosSalarios = new double[20];

        // Entrada de dados
        for (int i = 0; i < 20; i++) {
            System.out.printf("\nDigite o nome da %dª pessoa: ", i+1);
            nomes[i] = input.nextLine();
            
            while (nomes[i].length() > 30) {
                System.out.println("\nNomes com até 30 caracteres. Tente novamente.");
                System.out.printf("\nDigite o nome da %dª pessoa: ", i+1);
                nomes[i] = input.nextLine();
            }

            System.out.printf("Digite o salário de %s: R$ ", nomes[i]);
            salarios[i] = Double.parseDouble(input.nextLine());

            novosSalarios[i] = salarios[i] * 1.08;
        }

        input.close();

        // Saída de dados
        System.out.println("\n\n\t\t\t\tRELACAO FINAL");
        for (int i = 0; i < 20; i++) {
            System.out.printf("\n%d - %s\tR$ %.2f", i+1, nomes[i], novosSalarios[i]);
        }
    }
}