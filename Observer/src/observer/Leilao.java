
package observer;

import java.util.ArrayList;
import java.util.Random;
import negocio.Interfaces.ILeiloeiro;
import negocio.Interfaces.IParticipante;
import modelo.Lance;

public class Leilao extends javax.swing.JFrame {
    ILeiloeiro leiloeiro;
    IParticipante partticipante;
    ArrayList<Lance> meus = new ArrayList();
    ArrayList<Lance> lances = new ArrayList();
    public Leilao(ILeiloeiro l,IParticipante p) { 
        this.setTitle("Arremate.JAVA");
        this.setSize(500,800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        this.setVisible(true);
        this.listaLances.add("Lances");
        this.listaMeusLances.add("Meus Lances");
        this.leiloeiro = l;
        this.partticipante = p;
        this.partticipante.setTelaLeilao(this);
        Random valor = new Random();
        this.leiloeiro.iniciar(((double) valor.nextInt(2000 - 100)));
    }

    private Leilao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoLance = new javax.swing.JTextField();
        lblLance = new javax.swing.JLabel();
        cmdLance = new javax.swing.JButton();
        listaMeusLances = new java.awt.List();
        lblMeusLances = new javax.swing.JLabel();
        listaLances = new java.awt.List();
        lblLances = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoLance.setText("0,00");

        lblLance.setText("Dar Lance");

        cmdLance.setText("Enviar");
        cmdLance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLanceActionPerformed(evt);
            }
        });

        listaMeusLances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMeusLancesActionPerformed(evt);
            }
        });

        lblMeusLances.setText("Meus  Lances:");

        lblLances.setText("Lances:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoLance, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdLance))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMeusLances)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLances)
                                .addGap(257, 257, 257))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listaMeusLances, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(listaLances, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textoLance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLance)
                    .addComponent(cmdLance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMeusLances)
                    .addComponent(lblLances))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listaLances, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(listaMeusLances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaMeusLancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMeusLancesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMeusLancesActionPerformed

    private void cmdLanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLanceActionPerformed
       String texto = this.textoLance.getText().replace(",", ".");
       double valor = Double.parseDouble(texto);
       this.meus.add(this.partticipante.darLance(valor));
       listarMeus();
    }//GEN-LAST:event_cmdLanceActionPerformed
    private void listarMeus(){
        this.listaMeusLances.removeAll();
        String l;
        for(int i = 0; i < this.meus.size(); i++){
            l = "Lance " + 
            (this.meus.get(i).getDono() == null ?( "INICIAL " ):( "de " + this.meus.get(i).getDono().getNome()))
             + " por R$" + this.meus.get(i).getValor();
            this.listaMeusLances.add(l);
        }
    }
    private void listarLances(){
        this.listaLances.removeAll();
        String l;
        Lance temp;
         for(int i = 0; i < this.lances.size(); i++){
            temp = this.lances.get(i);
            l = "Lance " + 
            (temp.getDono() == null ?( "INICIAL " ):( "de " + temp.getDono().getNome()))
             + " por R$" + temp.getValor();
            this.listaLances.add(l);
        }
    }
    public void addLance(Lance l){
       this.lances.add(l);
       listarLances();
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
            java.util.logging.Logger.getLogger(Leilao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leilao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leilao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leilao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leilao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdLance;
    private javax.swing.JLabel lblLance;
    private javax.swing.JLabel lblLances;
    private javax.swing.JLabel lblMeusLances;
    private java.awt.List listaLances;
    private java.awt.List listaMeusLances;
    private javax.swing.JTextField textoLance;
    // End of variables declaration//GEN-END:variables
}
