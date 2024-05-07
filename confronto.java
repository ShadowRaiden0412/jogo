public class Confronto {
    public int executar(SuperHeroi superheroi, Vilao vilao) {
        int poderTotalSuperheroi = superheroi.getPoderTotal();
        int poderTotalVilao = vilao.getPoderTotal();

        if (poderTotalSuperheroi > poderTotalVilao) {
            return 1; // Super-herói ganha a batalha
        } else if (poderTotalSuperheroi < poderTotalVilao) {
            return 2; // Vilão ganha a batalha
        } else {
            return 0; // Empate
        }
    }
}