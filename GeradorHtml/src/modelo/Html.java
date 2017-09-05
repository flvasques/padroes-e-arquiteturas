
package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Html {
    protected String attr;
    
    public abstract String preview();
    
    public void build(String s){
        s += "</html>";
       BufferedWriter arquivo;
       try {
            arquivo = new BufferedWriter (new FileWriter(new File("Cobaia.html")));
            arquivo.write(s);
            arquivo.flush();
            arquivo.close();
       } catch (IOException ex) {
            Logger.getLogger(Html.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
}
