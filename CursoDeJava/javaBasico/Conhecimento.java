import javax.swing.JOptionPane; //importanto classe para exibição de mensagens com interação do usuário

public class Conhecimento {

	public static void main (String[] args) {
	
		String peso = JOptionPane.showInputDialog("Qual seu Peso em Quilogramas?"); //Exibe campo para usuário informar o peso (usa a classe importada)
		String altura = JOptionPane.showInputDialog("Qual sua Altura em Metros?");//Exibe campo para usuário informar a altura (usa a classe importada)
	
		double pesoRetorno = Double.parseDouble(peso); ////convertendo um Wrapper 'string/objeto' para umm double
		double alturaRetorno = Double.parseDouble(altura); //convertendo um Wrapper 'string/objeto' para umm double
		
		double imc = pesoRetorno / (alturaRetorno * alturaRetorno); //calculo
		
		//String retorno = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do Peso"; //Regra para exibir mensagem através da 
		
		String msg = ""; //Declarando Variavel
		
		if(imc < 20){
			msg = "Abaixo do Peso";
		  }else if(imc >= 20 && imc <= 25){
			  msg = "Peso Ideal";
		    }else if(imc >= 25 && imc <= 25){
				msg = "Peso Ideal";
			  }else if(imc >= 30 && imc <= 35){
				  msg = "Obesidade Moderada";
				}else if(imc >= 35 && imc <= 40){
					msg = "Obesidade Severa";
				  }else{
					  msg = "Obesidade Mórbita";  
				    }
		
		JOptionPane.showMessageDialog(null, "IMC: " + imc + " \n " + msg); //Exibir Menssagem informativa do usuário com base nos valores que ele informou
		//System.out.println("IMC: " + imc);
		//System.out.println(retorno);
	}
}