public class superheroi extends Personagem {
  public superheroi(String nome, String nomeVidaReal){
    super(nome, nomeVidaReal);
  }
  public int getPoderTotal(){
    int total = 0;
    for(int i = 0; i < getpoderes().length; i++){
      total += getpoderes()[i].getcategoria();
    }
    return (int) (total + total * 0.1); // corrected the return statement
  }
}