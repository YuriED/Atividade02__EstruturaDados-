//Algoritmo 351
import java.util.Scanner;
public class ProcuraNome {
    public static void name(String[]args) {
        Scanner input =new Scanner (System.in);
        String []nomes =new String [5];

        for (int i=0;i<5;i++){
            System.out.println("Digite o nome do aluno "+(i+1)+":");
            nomes[i]= input.nextLine();
        }
        System.out.println("\nDigite o numero da pessoa:");
        int num = input.nextInt();
        if (num >=1&& num <=5){
            System.out.println("Nome correspondente ao número"+num+":"+nomes [num-1]);
        }else{
            System.out.println("Número inválido.");
        }
        input.close();
    }
    
}
