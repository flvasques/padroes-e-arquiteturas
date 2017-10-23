
package modelo.Padrao;

public class SMS {
    private String destino = "";
    private String origem = "";
    private String texto = "";
    
    public SMS (){}
    public SMS (String d, String o, String t){
        destino = d;
        origem = o;
        texto = t;
    }
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
