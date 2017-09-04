
package apresentacao;
        
import modelo.*;
import modelo.componentes.*;

public class Main {

    public static void main(String[] args) {
        Componente link = new Link();
        Componente meta = new MetaTag("charset=\"utf-8\"");
        Componente title = new Title();
        Html head = new Head(title, link ,meta);
        Html body = new Body();
        Html pag = new Pagina(head, body);
        pag.bild();
    }
    
}
