public class SuperHeroi extends Personagem {

    public SuperHeroi(String nome, String nomeVidaReal) {
        super(nome, nomeVidaReal);
    }

    @Override
    public int getPoderTotal() {
        
        int poderTotal = super.getPoderTotal();
        return (int) (poderTotal * 1.1);
    }
}
