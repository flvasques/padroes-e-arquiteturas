
package modelo;

public class Cavaleiro extends Personagem {
    
    public Cavaleiro(String nome) {
        super.ataque = 10;
        super.defesa = 7;
        super.nome = nome;
        super.vida = 100;
        super.msgDerrota = "O Poderoso Cavaleiro " + super.nome + " caiu \n";
    }   
    
}
