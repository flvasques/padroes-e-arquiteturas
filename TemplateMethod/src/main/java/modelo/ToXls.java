
package modelo;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Sheet;

public class ToXls extends Conversor {
    FileOutputStream arquivo;
    Workbook planilha = new HSSFWorkbook();
    
    @Override
    protected boolean converter() {
        boolean ret = true;
        try {
            Sheet plan = (Sheet) planilha.createSheet("Dados");
            HSSFRow linha = (HSSFRow) plan.createRow(0); 
            for(int i = 0; i < super.cabecalho.size(); i++){
                linha.createCell(i).setCellValue(super.cabecalho.get(i));
            }
            for(int i = 0; i < super.dados.size(); i++){
                linha = (HSSFRow) plan.createRow(i + 1);
                for(int j = 0; j < super.dados.get(i).getDados().length; j++){
                   linha.createCell(j).setCellValue(super.dados.get(i).getDados()[j]);
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
            planilha.write(arquivo);
            planilha.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Exportador", JOptionPane.ERROR_MESSAGE);
            ret = false;
        } finally{
            return ret;
        }
    }
    
}
