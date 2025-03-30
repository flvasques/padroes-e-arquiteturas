
package com.mycompany.templatmethod;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.*;


public class Opcoes extends javax.swing.JFrame {
    String path, pathSaida = null;
    int tipoSaida = 0;
    final Pattern regexTexto = Pattern.compile("^[A-Za-z0-9, ]++$");
    public Opcoes() {
        this.setTitle("Conversor");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        carragarCombo();
        this.lblSalvar.setVisible(false);
        this.txtSaida.setVisible(false);
        this.cmdEscolha.setVisible(false);
        this.textoArquivo.setEditable(false);
        this.txtSaida.setEditable(false);
        this.setVisible(true);
    }
    private void carragarCombo(){
        this.comboFormatos.removeAllItems();
        this.comboFormatos.addItem(" ");
        this.comboFormatos.addItem("HTML");
        this.comboFormatos.addItem("PDF");
        this.comboFormatos.addItem("XLS");
        this.comboFormatos.addItem("DOC");
        this.comboFormatos.setSelectedIndex(0);
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoArquivo = new javax.swing.JTextField();
        lblArquivo = new javax.swing.JLabel();
        lblFormato = new javax.swing.JLabel();
        comboFormatos = new javax.swing.JComboBox<>();
        cmdExporta = new javax.swing.JButton();
        cmdBusca = new javax.swing.JButton();
        lblAjuda = new javax.swing.JLabel();
        lblSalvar = new javax.swing.JLabel();
        txtSaida = new javax.swing.JTextField();
        cmdEscolha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoArquivoActionPerformed(evt);
            }
        });

        lblArquivo.setText("Arquivo");

        lblFormato.setText("Novo Formato:");

        comboFormatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFormatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFormatosActionPerformed(evt);
            }
        });

        cmdExporta.setText("Exportar");
        cmdExporta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExportaActionPerformed(evt);
            }
        });

        cmdBusca.setText("Buscar");
        cmdBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscaActionPerformed(evt);
            }
        });

        lblSalvar.setText("Salva em:");

        txtSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaidaActionPerformed(evt);
            }
        });

        cmdEscolha.setText("Escolher");
        cmdEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEscolhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFormato)
                            .addComponent(lblArquivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoArquivo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboFormatos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdExporta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdBusca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdEscolha, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArquivo)
                    .addComponent(textoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdBusca)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormato)
                    .addComponent(comboFormatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalvar)
                    .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cmdEscolha)
                .addGap(18, 18, 18)
                .addComponent(cmdExporta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscaActionPerformed
        new Busca(this,'e');
    }//GEN-LAST:event_cmdBuscaActionPerformed

    private void comboFormatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFormatosActionPerformed
        this.tipoSaida = this.comboFormatos.getSelectedIndex();
        switch(tipoSaida){
            case 0:
                this.lblAjuda.setText(" ");
                break;
            case 1:
                this.lblAjuda.setText("Exporta os dados para uma tablela html.");
                break;
            case 2:
                this.lblAjuda.setText("Exporta os dados para um arquivo PDF.");
                break;
            case 3:
                this.lblAjuda.setText("Exporta os dados para um arquivo padrão do Exel.");
                break;
            case 4:
                this.lblAjuda.setText("Exporta os dados para um arquivo padrão do Word.");
                break;
        }
    }//GEN-LAST:event_comboFormatosActionPerformed

    private void cmdExportaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExportaActionPerformed
        if(this.path != null){
            if(this.comboFormatos.getSelectedIndex() > 0){
               String nome = JOptionPane.showInputDialog(this, "Imforme o nome do arquivo:", "Conversor", JOptionPane.OK_OPTION);
               nome = !regexTexto.matcher(nome).matches() ? "arquivo_exportado" : nome;
               if(this.pathSaida == null) this.pathSaida = "";
               nome = this.pathSaida + nome + "." +this.comboFormatos.getSelectedItem().toString().toLowerCase();
                call(nome);
           }else{
               this.lblAjuda.setText("Escolha um Forato de saida.");
           }
       }
    }//GEN-LAST:event_cmdExportaActionPerformed

    private void textoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoArquivoActionPerformed
       cmdBuscaActionPerformed(evt);
    }//GEN-LAST:event_textoArquivoActionPerformed

    private void cmdEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEscolhaActionPerformed
         new Busca(this,'s');
    }//GEN-LAST:event_cmdEscolhaActionPerformed

    private void txtSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaidaActionPerformed
        cmdEscolhaActionPerformed(evt);
    }//GEN-LAST:event_txtSaidaActionPerformed
    public void setPath(String p,char t){
        if(t == 'e'){
            this.path = p;
            this.textoArquivo.setText(this.path); 
        }else{
            this.pathSaida = p;
            this.txtSaida.setText(p);
        }
    }
    private void call(String nome){
        boolean result = false;
        switch(tipoSaida){
            case 1:
                result = ((Conversor)new ToHtml()).exportar(path, nome);
                break;
            case 2:
                result = ((Conversor)new ToPDF()).exportar(path, nome);
                break;
             case 3:
                result = ((Conversor)new ToXls()).exportar(path, nome);
                break;
            case 4:
                result = ((Conversor)new ToXls()).exportar(path, nome);
                break;
            default:
                this.lblAjuda.setText("Escolha um Forato de saida.");
                break;
        }
        if(result)JOptionPane.showMessageDialog(this, "Aquirvo Exportado com sucesso!", "Conversor", JOptionPane.OK_OPTION);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBusca;
    private javax.swing.JButton cmdEscolha;
    private javax.swing.JButton cmdExporta;
    private javax.swing.JComboBox<String> comboFormatos;
    private javax.swing.JLabel lblAjuda;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblSalvar;
    private javax.swing.JTextField textoArquivo;
    private javax.swing.JTextField txtSaida;
    // End of variables declaration//GEN-END:variables
}
