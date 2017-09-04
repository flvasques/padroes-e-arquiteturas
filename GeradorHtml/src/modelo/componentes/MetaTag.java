
package modelo.componentes;

import modelo.Componente;

public class MetaTag extends Componente {
    String descricao, content;

    public MetaTag (String d){
        this.descricao = d;
    }
    
    public String getDiscrocao() {
        return descricao;
    }

    public void setDiscrocao(String discrocao) {
        this.descricao = discrocao;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getTexto() {
        return "<meta "+ this.descricao+ " "+ (this.content != null ? this.content : "") 
                +"/>";
    }
}
