public class Personagem {
  private String nome;
  private String nomeVidaReal;
  private superpoder[] poderes;


  public Personagem (String nome, String nomeVidaReal){
    this.nome = nome;
    this.nomeVidaReal = nomeVidaReal;
  }
  public void checkSuperpoderLength() {
    if (poderes.length <= 4) {
      // Handle the condition here
    }
  }
  public superpoder[] getpoderes(){
    return poderes;
  }
  public int getPoderTotal(){
    int total = 0;
    for(int i = 0; i < poderes.length; i++){
      total += poderes[i].getcategoria();
    }
    return total;
  }
}

