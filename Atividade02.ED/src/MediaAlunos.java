//Algoritmo 348
import java.util.Scanner;
public class MediaAlunos {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        float []pr1=new float [5];
        float []pr2=new float [5];
        float []media=new float [5];

        for (int i=0;i<5;i++){
            System.out.println("Digite o nome do aluno "+(i+1)+":");
            nomes[i]= input.nextLine();
            System.out.println("Digite a primeira nota  do aluno "+(i+1)+":");
            pr1[i]= input.nextFloat();
            System.out.println("Digite a segunda nota  do aluno "+(i+1)+":");
            pr2[i]= input.nextFloat();
            input.nextLine();
            media[i]=(pr1[i]+pr2[i])/2;
        }
        System.out.println("\n\n\t\t\tRELACAO FINAL \n");
        for(int i=0;i<5;i++){
            System.out.println("\nAluno"+(i+i)+"-"+nomes[i]);
            System.out.println("Nota 1: "+pr1[i]);
            System.out.println("Nota 2: "+pr2[i]);
            System.out.println("média: "+media[i]);
        }
        input.close();
    }
}
