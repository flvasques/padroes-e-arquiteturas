
package negocio;

import java.util.ArrayList;

public class Personagem {
    private String nome;
    private ClassePersonagem classe;
    private ArrayList<Item> mochila;
    private Item equipado;
    public Personagem(){
        this.mochila = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ClassePersonagem getClasse() {
        return classe;
    }
    public void setClasse(ClassePersonagem classe) {
        this.classe = classe;
    }
    public ArrayList<Item> getMochila() {
        return mochila;
    }
    public void setMochila(ArrayList<Item> mochila) {
        this.mochila = mochila;
    }
    public void setMochila(Item item){
        this.mochila.add(item);
    }   
    public Item getEquipado() {
        return equipado;
    }
    public void setEquipado(Item equipado) {
        this.equipado = equipado;
    }
    
}