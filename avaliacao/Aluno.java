public class Aluno {
  private int idade;
  private String nome;

  public Aluno(int idade, String nome){
      this.idade = idade;
      this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public String getNome() {
    return this.nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
