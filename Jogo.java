public class Jogo {
    public static void main(String[] args) {
        SuperHeroi Miranha = new SuperHeroi("Homem Aranha", "Peter Parker");
        Superpoder SoltarTeia = new Superpoder("Soltar teia", 3);
        Superpoder AndarParedes = new Superpoder("Andar em paredes", 2);
        Superpoder SentidoApurado = new Superpoder("Sentido Aranha", 1);

        Miranha.adicionaSuperpoder(SoltarTeia);
        Miranha.adicionaSuperpoder(AndarParedes);
        Miranha.adicionaSuperpoder(SentidoApurado);

       Vilao Duende = new Vilao("Duende Verde", "Norman Osborn", 15); 
        Superpoder Forca = new Superpoder("Força", 5);  
      
      Duende.adicionaSuperpoder(Forca);

        
        Confronto confronto = new Confronto();
        int resultado = confronto.executar(Miranha, Duende);

        if (resultado == 1) {
            System.out.println("O Super-Herói ganhou a batalha!");
        } else if (resultado == 2) {
            System.out.println("O Vilão ganhou a batalha!");
        } else {
            System.out.println("A batalha terminou em empate!");
        }
    }
}
