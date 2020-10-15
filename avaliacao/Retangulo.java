public class Retangulo {

  private Double altura;
  private Double base;

  public Retangulo(Double altura, Double base){
    this.altura = altura;
    this.base = base;
  }

  public void setBase(Double base){
    this.base = base;
  }

  public void setAltura(Double altura){
    this.altura = altura;
  }

  public Double getBase(){
    return this.base;
  }

  public Double getAltura(){
    return this.altura;
  }

  public Double getArea(){
    return this.base * this.altura;
  }

  public Double getPerimetro(){
    return 2* this.altura + 2* this.base;
  }

}
