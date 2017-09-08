
package apresentacao;

import java.io.File;

public class Busca extends javax.swing.JFrame {
    File curDir = new File(".");
    File[] dir;
    Opcoes pai;
    char tipo;
    
     public Busca() {
        initComponents();
    }
    public Busca(Opcoes opt, char t) {
        this.setTitle("Conversor");
        this.setResizable(false);
        initComponents();
        this.pai = opt;
        this.tipo = t;
        carregarLista();
        this.setLocationRelativeTo(pai);
        this.setVisible(true);
        if(this.tipo == 'e')this.cmdConfirma.setVisible(false);
        else this.cmdConfirma.setVisible(true);
        this.setAlwaysOnTop(true);
    }
    private void carregarLista(){
        dir = curDir.listFiles();
        this.listaDir.add("..");
        int cont = 0;
        for(int i = 0; i < dir.length; i++){
            if(dir[i].isDirectory() || (dir[i].isFile() && dir[i].getName().endsWith(".csv"))){
               this.listaDir.add(dir[i].getName());
            }else{
                this.listaDir.add("");
            } 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaDir = new java.awt.List();
        cmdAbrir = new javax.swing.JButton();
        cmdConfirma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDirActionPerformed(evt);
            }
        });

        cmdAbrir.setText("Abrir");
        cmdAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAbrirActionPerformed(evt);
            }
        });

        cmdConfirma.setText("Confirmar");
        cmdConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdAbrir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdConfirma, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(cmdAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(cmdConfirma))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDirActionPerformed
        if(this.tipo == 'e'){
            caminhoEntrada();
        }else if(this.tipo == 's'){
            caminhoSaida();
        }
    }//GEN-LAST:event_listaDirActionPerformed
    
    private void caminhoEntrada(){
        int pos = this.listaDir.getSelectedIndex();
        if(pos == 0){
            String path = curDir.getAbsolutePath();
            path = path.substring(0,path.lastIndexOf("\\"));
            this.curDir = new File(path);
            this.listaDir.removeAll();
            carregarLista();
        }else if(this.dir[pos - 1].isDirectory()){
            this.curDir = new File(this.dir[pos - 1].getAbsolutePath());
            this.listaDir.removeAll();
            carregarLista();
        }else{
            pai.setPath(this.dir[pos - 1].getAbsolutePath(),this.tipo);
            this.dispose();
        }
    }
    private void caminhoSaida(){
        int pos = this.listaDir.getSelectedIndex();
        if(pos == 0){
            String path = curDir.getAbsolutePath();
            path = path.substring(0,path.lastIndexOf("\\"));
            this.curDir = new File(path);
            this.listaDir.removeAll();
            carregarLista();
        }else if(this.dir[pos - 1].isDirectory()){
            this.curDir = new File(this.dir[pos - 1].getAbsolutePath());
            this.listaDir.removeAll();
            carregarLista();
        }
    }
    
    private void cmdAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAbrirActionPerformed
        listaDirActionPerformed(evt);
    }//GEN-LAST:event_cmdAbrirActionPerformed

    private void cmdConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfirmaActionPerformed
        pai.setPath(curDir.getAbsolutePath(),this.tipo);
        this.dispose();
    }//GEN-LAST:event_cmdConfirmaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAbrir;
    private javax.swing.JButton cmdConfirma;
    private java.awt.List listaDir;
    // End of variables declaration//GEN-END:variables
}
