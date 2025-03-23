
package modelo;

public class Rei extends Personagem {
    
    public Rei(String nome){
        super.ataque = 7;
        super.defesa = 10;
        super.nome = nome;
        super.vida = 100;
        super.msgDerrota = "O Grande Rei " + super.nome + " caiu\n";
    }
    
}
