/**
 * @Author Tiago Murilo
 *
 */
 
import javax.swing.JOptionPane; //importanto classe para exibição de mensagens com interação do usuário

public class EntradaDois {

	public static void main(String[] args){
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?"); //exibe campo para usuário preencher
		//System.out.println(nome);
		JOptionPane.showMessageDialog(null, "Oi, " + nome + "!"); //retorna mensagem 
		
	}
}