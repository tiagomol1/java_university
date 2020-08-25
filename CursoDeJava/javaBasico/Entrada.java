/**
 * @Author Tiago Murilo
 *
 */
 
import java.util.Scanner; //importação de classe Scanner

public class Entrada {

	public static void main(String[] args){
		
		//chamada do programa
		//System.out.println(args[0]);
		
		//Interagindo com o Usuário
		System.out.println("Qual o seu nome?");
		Scanner s = new Scanner(System.in); //Cria Input para o usuário preencher na entrada
		String nome = s.nextLine(); //Retorna no método uma String, que é o resultado do que foi preenchido
		System.out.println("Bem vindo, " + nome);
		
		
	}

}