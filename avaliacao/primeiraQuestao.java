import java.util.Scanner;

/**
 * primeiraQuestao
 */
public class primeiraQuestao {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String execute = "S";
    Double mediaAlunos = 0.0;
    Integer count = 0;

    while (execute.equals("s") || execute.equals("S")) {

      count ++;

      System.out.print("Digite a Primeira nota: ");
      Double n1 = input.nextDouble();
      
      System.out.print("Digite a Segunda nota: ");
      Double n2 = input.nextDouble();
      
      System.out.print("Digite a Terceira nota: ");
      Double n3 = input.nextDouble();

      Double media = (n1 + n2 + n3) / 3;

      if(media >= 6){
        System.out.println("\nVoce passou! Sua media:" + media);
      }else{
        System.out.println("\nVoce nao passou! Sua media:" + media);
      }
       
      System.out.println("\nDeseja Continuar? S-Sim | N-Nao");
      
      execute = input.next();

      mediaAlunos += media;

      System.out.println("\n");

    }

    if(count > 1){
      mediaAlunos = mediaAlunos / count;
      
      System.out.println("-------------------");
      System.out.println("A media dos alunos foi: " + mediaAlunos + "\n");
    }

    System.out.println("-------------------");
    System.out.println("Sistema encerrado");
  
  }  
  
}