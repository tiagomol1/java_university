import java.util.Scanner;

public class AccountTest{

	public static void main (String[] args){
		Account a = new Account(); //Constrói um objeto de conta
								   //armazena em args
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um nome para a conta: ");
		String name = input.nextLine();
		
		a.setName(name); //armazernar o "name" na conta
		
		//imprime o resultado
		System.out.println("O nome na conta eh: " + a.getName());
	}
	
}