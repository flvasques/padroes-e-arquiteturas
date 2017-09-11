
package modelo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class ToPDF extends Conversor {

    @Override
    protected boolean converter() {
        return true;
    }
    
    @Override
    protected boolean gravar(String nome){
        boolean ret = false;
        Document doc = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(nome));
            doc.open();
            doc.setMargins(20, 20, 20, 20);
            Font normal = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL, BaseColor.BLACK);
            Font negrito = new Font(Font.FontFamily.TIMES_ROMAN, 14,Font.BOLD, BaseColor.BLACK);
            PdfPTable dados = new PdfPTable(super.cabecalho.size());
            for(int i = 0; i < super.cabecalho.size(); i++){
                dados.addCell(new Paragraph(super.cabecalho.get(i),negrito));
            }
            for(int i = 0; i < super.dados.size(); i++){
                for(int j = 0; j <super.dados.get(i).getDados().length; j++){
                    dados.addCell(new Paragraph(super.dados.get(i).getDados()[j],normal));
                }
            }
            ret = true;
            doc.add(dados);
        } catch (FileNotFoundException | DocumentException ex) {
            JOptionPane.showMessageDialog(null, ex, "Exportador", JOptionPane.ERROR_MESSAGE);
        } finally{
            doc.close();
            return ret;
        }
        
    }
}
