
package modelo;

import java.util.ArrayList;

public class Head extends Componente {
    private Componente title;
    private ArrayList<Componente> links = new ArrayList<>();
    private ArrayList<Componente> metaTags = new ArrayList<>();
    
    public Head(Componente titulo, Componente link, Componente meta){
        this.title = titulo;
        this.links.add(link);
        this.metaTags.add(meta);
    }
    
    public Head(Componente link, Componente meta){
        this.links.add(link);
        this.metaTags.add(meta); 
    }
    
    public void addLink(Componente link){
        this.links.add(link);
    }
    
    public void addMeta(Componente meta){
        this.metaTags.add(meta);
    }
    
    public void setTitulo(Componente titulo){
        this.title = titulo;
    }

    public Componente getTitle() {
        return title;
    }

    public ArrayList<Componente> getLinks() {
        return links;
    }

    public ArrayList<Componente> getMetaTags() {
        return metaTags;
    }

    @Override
    public String getTexto() {
        String ret = "<head>\n";
        ret += "\t" + this.title.getTexto() + "\n";
        for(int i = 0; i <this.links.size(); ret += "\t" + this.links.get(i).getTexto() + "\n", i++);
        for(int i = 0; i <this.metaTags.size(); ret += "\t" + this.metaTags.get(i).getTexto() + "\n", i++);
        ret += "</head>\n";
        return ret;
    }
}
