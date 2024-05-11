public class Personagem {
    private String nome;
    private String nomeVidaReal;
    private Superpoder[] poderes;
    private int numPoderes; 

    public Personagem(String nome, String nomeVidaReal) {
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
        this.poderes = new Superpoder[4]; 
        this.numPoderes = 0; 
    }
    public void adicionaSuperpoder(Superpoder sp) {
        if (numPoderes < 4) {
            poderes[numPoderes] = sp;
            numPoderes++;
        } else {
            System.out.println("O personagem atingiu o número máximo de poderes.");
        }
    }

    public int getPoderTotal() {
        int poderTotal = 0;
        for (int i = 0; i < numPoderes; i++) {
            poderTotal += poderes[i].getCategoria();
        }
        return poderTotal;
    }
}
