/**
 * @Author Tiago Murilo
 * Demonstração de Wrapper Primitivo
 */

public class WrapperPrimitiva{
	
	public static void main(String[] args){
			
		Double preco = new Double("12.45");
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();
		Boolean casado = new Boolean("true");
		
		//Conversão Estatica
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		//Conversão Binário
		int i2 = Integer.valueOf("101011", 2);
	
	}
}