
package apresentacao;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.*;
import modelo.componentes.*;
import modelo.enumeradores.*;

public class Montador extends javax.swing.JFrame {
    Html htm = new Pagina("");
    final Pattern regexTexto = Pattern.compile("^[A-Za-z0-9, ]++$");
    public Montador() {
        this.setTitle("Gerdador HTML");
        //this.setSize(1024,720);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        listarTemplates();
        listarHead();
        listarBody();
        this.textoPreview.setEditable(false);
        this.setVisible(true);
        
    }
    private void listarTemplates(){
        this.comboTemplates.removeAllItems();
        this.comboTemplates.addItem(" ");
        this.comboTemplates.addItem("Exemplo-1");
        this.comboTemplates.addItem("Exemplo-2");
        this.comboTemplates.setSelectedIndex(0);
    }
    private void listarHead(){
        this.comboHead.removeAllItems();
        this.comboHead.addItem(" ");
        this.comboHead.addItem("Title");
        this.comboHead.addItem("Meta Tag");
        this.comboHead.addItem("Link");
        this.comboHead.setSelectedIndex(0);
    }
    private void listarBody(){
        this.comboBody.removeAllItems();
        this.comboBody.addItem(" ");
        this.comboBody.addItem("A");
        this.comboBody.addItem("BR");
        this.comboBody.addItem("Form");
        this.comboBody.addItem("Input");
        this.comboBody.addItem("P");
        this.comboBody.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPprev = new javax.swing.JLabel();
        btnPreview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoPreview = new javax.swing.JTextArea();
        btnBuild = new javax.swing.JButton();
        comboTemplates = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblHead = new javax.swing.JLabel();
        comboHead = new javax.swing.JComboBox<>();
        textoAttrHead = new javax.swing.JTextField();
        lblContent = new javax.swing.JLabel();
        textoContent = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        textType = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblArgs = new javax.swing.JLabel();
        textoArgsHead = new javax.swing.JTextField();
        lblBody = new javax.swing.JLabel();
        comboBody = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPprev.setText("Preview Código:");

        btnPreview.setText("Preview");
        btnPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviewActionPerformed(evt);
            }
        });

        textoPreview.setBackground(new java.awt.Color(153, 153, 153));
        textoPreview.setColumns(20);
        textoPreview.setRows(5);
        textoPreview.setTabSize(4);
        textoPreview.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(textoPreview);

        btnBuild.setText("Gerar");
        btnBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuildActionPerformed(evt);
            }
        });

        comboTemplates.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTemplates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTemplatesActionPerformed(evt);
            }
        });

        jLabel1.setText("Templates:");

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblHead.setText("Head:");

        comboHead.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        textoAttrHead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAttrHeadActionPerformed(evt);
            }
        });

        lblContent.setText("Content");

        lblType.setText("Type");

        jButton2.setText("Adcionar");

        lblArgs.setText("Args");

        lblBody.setText("Body");

        comboBody.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPreview))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblArgs)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textoArgsHead))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(comboTemplates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHead)
                                    .addComponent(comboHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(lblType)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textType))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(textoAttrHead, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblContent)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoContent, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButton2))
                            .addComponent(lblBody)
                            .addComponent(comboBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuild))
                    .addComponent(lbPprev))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPprev)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboTemplates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoAttrHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContent)
                            .addComponent(textoContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblType)
                            .addComponent(textType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArgs)
                            .addComponent(textoArgsHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25)
                        .addComponent(lblBody)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnPreview)
                    .addComponent(btnBuild)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
        String html = this.htm.preview()+"</html>";
        this.textoPreview.setText(html);
    }//GEN-LAST:event_btnPreviewActionPerformed

    private void comboTemplatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTemplatesActionPerformed
        setTempalte(this.comboTemplates.getSelectedIndex());
    }//GEN-LAST:event_comboTemplatesActionPerformed

    private void btnBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuildActionPerformed
        String nome = JOptionPane.showInputDialog(this, "Imforme o nome do arquivo:", "Gerdador HTML", JOptionPane.OK_OPTION);
        nome = !regexTexto.matcher(nome).matches() ? "codigo_gerado" : nome;
        this.htm.build(this.htm.preview(), nome);
        this.htm = new Pagina("");
        this.textoPreview.setText("");
    }//GEN-LAST:event_btnBuildActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.htm = new Pagina("");
        this.textoPreview.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoAttrHeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAttrHeadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAttrHeadActionPerformed
    
    private void setTempalte(int i){
        switch(i){
            case 1:
                this.htm = new Pagina("");
                this.htm = new Head(htm);
                this.htm = new Title(htm, "Teplate1", false);
                this.htm = new MetaTag(htm,"charset='utf-8'", true);
                this.htm = new Body(htm, "");
                this.htm = new H(htm, "IMPLEMENTAÇÃO SIMPLES", HTipo.h1, false);
                this.htm = new A(htm, "#", "Aqui vai um Link", true);
            break;
            case 2:
                this.htm = new Pagina("");
                this.htm = new Head(htm);
                this.htm = new Title(htm, "Teplate2", false);
                this.htm = new MetaTag(htm,"charset='utf-8'", false);
                this.htm = new Link(htm,"https://maxcdn.bootstrapcdn.com/bootst"
                        + "rap/4.0.0-beta/css/bootstrap.min.css","stylesheet",true);
                ((Componente)this.htm).setArgs("integrity=\"sha384-/Y6pD6FV/Vv2HJ"
                 +"nA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\"");
                this.htm = new Body(htm, "class=\"container-fluid col-md-offset-2 col-md-6 col-sm-12\"");
                this.htm = new H(htm, "IMPLAMENTANDO MAIS COISAS", HTipo.h2, false);
                this.htm = new P(htm, "Formulário", false);
                this.htm = new Form(htm, " ", " ", false);
                ((Componente)this.htm).setArgs("class=\"formulario\"");
                this.htm = new Input(htm, InputTipo.text, " ",false);
                ((Componente)this.htm).setArgs("class=\"form-control\"");
                this.htm = new Input(htm, InputTipo.submit, " ",true);
                ((Componente)this.htm).setArgs("class=\"btn btn-default\"");
                this.htm = new Br(htm, false);
                this.htm = new A(htm, "#", "Link", true);
            break;
        }
        
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
            java.util.logging.Logger.getLogger(Montador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Montador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Montador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Montador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Montador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuild;
    private javax.swing.JButton btnPreview;
    private javax.swing.JComboBox<String> comboBody;
    private javax.swing.JComboBox<String> comboHead;
    private javax.swing.JComboBox<String> comboTemplates;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPprev;
    private javax.swing.JLabel lblArgs;
    private javax.swing.JLabel lblBody;
    private javax.swing.JLabel lblContent;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField textType;
    private javax.swing.JTextField textoArgsHead;
    private javax.swing.JTextField textoAttrHead;
    private javax.swing.JTextField textoContent;
    private javax.swing.JTextArea textoPreview;
    // End of variables declaration//GEN-END:variables
}
