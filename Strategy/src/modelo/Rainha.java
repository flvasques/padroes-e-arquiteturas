
package modelo;

public class Rainha extends Personagem {
    
    public Rainha(String nome){
        super.ataque = 9;
        super.defesa = 8;
        super.nome = nome;
        super.vida = 100;
        super.msgDerrota = "A Virtuosa Rainha " + super.nome + " caiu\n";
    }
    
}
