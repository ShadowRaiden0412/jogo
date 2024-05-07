public class superpoder {
  private String nome;
  private int categoria;

public superpoder(String nome, int categoria){
  this.nome = nome;
  this.categoria = categoria;
}
  public String getnome(){
    return nome;
  }
  public void setnome(String nome){
    this.nome = nome;
  }
  public int getcategoria(){
    return categoria;
  }
  public void setcategoria(int categoria)
  {
    this.categoria = categoria;
  }
}