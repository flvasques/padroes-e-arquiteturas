
package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public abstract class Conversor {
   protected ArrayList<String> cabecalho = new ArrayList<>();
   protected ArrayList<PessoaDados> dados = new ArrayList<>();
   protected String gravavel;
   
   public final boolean exportar(String caminho, String nome){
       boolean ret = false;
       
       ret = carregar(caminho);
       if(ret)ret = converter();
       if(ret)ret = gravar(nome);
       return ret;
   }
   private boolean carregar(String caminho){
       String[] vetorLinha;
       PessoaDados dado;
        try {
            FileReader arquivo = new FileReader(caminho);
            Scanner leitor = new Scanner (arquivo);
            if(leitor.hasNextLine()){
                vetorLinha = leitor.nextLine().split(";");
                this.cabecalho.addAll(Arrays.asList(vetorLinha));
            }
            while(leitor.hasNextLine()){
                vetorLinha = leitor.nextLine().split(";");
                dado = new PessoaDados();
                dado.setDados(vetorLinha);
                this.dados.add(dado);
            }  
            
            return true;  
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,e.toString(), "Exportador", JOptionPane.ERROR_MESSAGE);
            return false;
        }
   }
   protected boolean gravar(String nome){
      BufferedWriter arquivo;
       try {
            arquivo = new BufferedWriter (new FileWriter(new File(nome)));
            arquivo.write(this.gravavel);
            arquivo.flush();
            arquivo.close();
            return true;
       } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Exportador", JOptionPane.ERROR_MESSAGE);
            return false;
       }
   }
   
   protected abstract boolean converter();
}
