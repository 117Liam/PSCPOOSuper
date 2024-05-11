public class Confronto {

    public int executar(SuperHeroi superheroi, Vilao vilao) {
        int poderSuperheroi = superheroi.getPoderTotal();
        int poderVilao = vilao.getPoderTotal();

        if (poderSuperheroi > poderVilao) {
            return 1; // Vitória do Herói
        } else if (poderVilao > poderSuperheroi) {
            return 2; // Vitória do Vilão
        } else {
            return 0; // Empate
        }
    }
}
