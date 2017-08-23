
package strategy;

import negocio.*;
import negocio.Interfaces.*;
import negocio.Itens.*;

public class Main {

    public static void main(String[] args) {
        Personagem rei = new Rei("Artur");
        Personagem rainha = new Rainha("Morgana");
        Personagem cavaleiro = new Cavaleiro("Lancelot");
        Arma arco = new Arco();
        Arma espada = new Espada();
        Arma faca = new Faca();
        Arma machado = new Machado();
        
        System.out.println("Primeira Luta Inicio!!");
        Campo luta1 = new Campo(rainha, cavaleiro);
        rainha.setEquipado(arco);
        cavaleiro.setEquipado(espada);
        while(!luta1.getFim()){
            luta1.novoRound();
        }
        System.out.println("Segunda Luta Inicio!!");
        Campo luta2 = new Campo(rainha, rei);
        rei.setEquipado(machado);
        rainha.setEquipado(faca);
        luta2.novoRound();
        rainha.setEquipado(espada);
        while(!luta2.getFim()){
            luta2.novoRound();
        }
    }
}
