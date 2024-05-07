public class Jogo {
    public static void main(String[] args) {
        superheroi superheroi = new superheroi("Superman", "Clark Kent");
        vilao vilao = new vilao("Lex Luthor", "Lex Luthor", 10);
        superpoder poderVoo = new superpoder("Voo", 5);
        superpoder poderForca = new superpoder("Força", 4);
        superpoder poderTelecinese = new superpoder("Telecinese", 6);
        superpoder[] poderesSuperHeroi = {poderVoo, poderForca};
        superpoder[] poderesVilao = {poderForca, poderTelecinese};
        superheroi.setpoderes(poderesSuperHeroi);
        vilao.setpoderes(poderesVilao);
        // Further interactions or comparisons can be added here
    }
}