
package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class ToDoc extends Conversor {
     FileOutputStream arquivo;
     XWPFDocument word = new XWPFDocument();
     
    @Override
    protected boolean converter() {
        boolean ret = true;
        try {
            XWPFTable p = word.createTable();
            XWPFTableRow l = p.createRow();
            
            for(int i = 0; i < super.cabecalho.size(); i++){
                l.createCell().setText(super.cabecalho.get(i));
            }
            for(int i = 0; i < super.dados.size(); i++){
               l = p.createRow();
                for(int j = 0; j < super.dados.get(i).getDados().length; j++){
                   l.createCell().setText(super.dados.get(i).getDados()[j]);
                }
            }
            
        } catch( RuntimeException ex ){
            JOptionPane.showMessageDialog(null, ex, "Exportador", JOptionPane.ERROR_MESSAGE);
            ret = false;
        }
        return ret;
    }
    @Override
    protected boolean gravar(String nome){
        boolean ret = true;
        try {
            arquivo =  new FileOutputStream(new File(nome));
            word.write(arquivo);
            word.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Exportador", JOptionPane.ERROR_MESSAGE);
            ret = false;
        } finally{
           
            return ret;
        }
    }
    
}
