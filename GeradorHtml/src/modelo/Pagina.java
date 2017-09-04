
package modelo;

import persistencia.Escritor;

public class Pagina extends Html {
    private String nome;
    private Componente head;
    private Componente body;
    
    public Pagina(Html h, Html b){
        this.head = (Componente) h;
        this.body = (Componente) b;
    }
    public Pagina(String titulo, Head h, Body b){
        this.nome = titulo;
        this.head = h;
        this.body = b;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Html getHead() {
        return head;
    }

    public void setHead(Html head) {
        this.head = (Componente) head;
    }

    public Html getBody() {
        return body;
    }

    public void setBody(Html body) {
        this.body =  (Componente) body;
    }

    @Override
    public void bild() {
        String htm = "<!DOCTYPE html>\n<html>\n" + head.getTexto() + body.getTexto() + "\n</html>";
        Escritor.bild(htm);
    }
    
}
