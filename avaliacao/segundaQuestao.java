/**
 * segundaQuestao
 */
public class segundaQuestao {

  public static void main(String[] args) {
    
    Retangulo  r1 = new Retangulo(1.5, 2.0);

    System.out.printf("Retangulo 1: Base %.2f, Altura %.2f \n", r1.getBase(), r1.getAltura());
    System.out.printf("Area: %.2f, Perimetro: %.2f \n", r1.getArea(), r1.getPerimetro());

    r1.setBase(3.5);
    r1.setAltura(6.0);
    System.out.printf("Retangulo 2: Base %.2f, Altura %.2f \n", r1.getBase(), r1.getAltura());
    System.out.printf("Area: %.2f, Perimetro: %.2f \n", r1.getArea(), r1.getPerimetro());


  }

}