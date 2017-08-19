
package apresentacao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import negocio.Cliente;
import negocio.Endereco;

public class SalvarCliente extends javax.swing.JFrame {
    Cliente contato = null;
    Endereco enderecoContato = null;
    final Pattern regexTexto = Pattern.compile("^[A-Za-z, ]++$");
    public SalvarCliente() {
        this.setTitle("AGENDA");
        this.setSize(580,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        this.setVisible(true);
        this.cmdApagar.setEnabled(false);
    }
    
    public SalvarCliente(Cliente c) throws SQLException {
        this.setTitle("AGENDA");
        this.setSize(580,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        this.setVisible(true);
        this.contato = c;
        this.textoNome.setText(this.contato.getNome());
        listarEnderecos();
        this.enderecoContato = null;
    }
    
    private void listarEnderecos() throws SQLException{
       this.contato.setEndereco(Endereco.listar(this.contato.getId()));
       if(this.contato.getEndereco().size() > 0){
           for (int i = 0; i < this.contato.getEndereco().size(); i++) {
               this.enderecoContato = (Endereco) this.contato.getEndereco().get(i);
               this.listaEnderecos.add(this.enderecoContato.getLogradouro() + 
                    " - " + this.enderecoContato.getNumero());               
               this.enderecoContato = null;
           }
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl01 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        cmdSalva = new javax.swing.JToggleButton();
        cmdVoltar = new javax.swing.JToggleButton();
        listaEnderecos = new java.awt.List();
        lbl02 = new javax.swing.JLabel();
        lbl03 = new javax.swing.JLabel();
        lbl04 = new javax.swing.JLabel();
        lbl05 = new javax.swing.JLabel();
        textoLogradouro = new javax.swing.JTextField();
        textoBairro = new javax.swing.JTextField();
        textnumero = new javax.swing.JTextField();
        textoComplemento = new javax.swing.JTextField();
        cmdApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl01.setText("Nome:");

        cmdSalva.setText("Salvar");
        cmdSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalvaActionPerformed(evt);
            }
        });

        cmdVoltar.setText("<< Voltar");
        cmdVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVoltarActionPerformed(evt);
            }
        });

        listaEnderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEnderecosActionPerformed(evt);
            }
        });

        lbl02.setText("Logradouro");

        lbl03.setText("Bairro");

        lbl04.setText("Numero");

        lbl05.setText("Complemento");

        cmdApagar.setText("Apagar Contato");
        cmdApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl01, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdVoltar)
                        .addGap(100, 100, 100)
                        .addComponent(cmdApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdSalva))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl03)
                            .addComponent(lbl04)
                            .addComponent(lbl05)
                            .addComponent(lbl02))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                .addComponent(textnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoComplemento)
                                .addComponent(textoNome))))
                    .addComponent(listaEnderecos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl01, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl03)
                    .addComponent(textoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl02)
                    .addComponent(textoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl04)
                    .addComponent(textnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl05)
                    .addComponent(textoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(listaEnderecos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdVoltar)
                    .addComponent(cmdSalva)
                    .addComponent(cmdApagar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVoltarActionPerformed
        try {
            new AgendaMain();
            this.dispose();
        } catch (SQLException ex) {
            
        } 
    }//GEN-LAST:event_cmdVoltarActionPerformed

    private void cmdSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalvaActionPerformed
        
        if(this.contato == null){
            novoContato();
        }else{
            atualizaContato(); 
        }
        if(this.contato != null && this.enderecoContato == null){
            if((this.textoBairro.getText().compareTo("") != 0) || (this.textoLogradouro.getText().compareTo("") != 0)){
                novoEndereco();  
            }
        }else if(this.contato != null && this.enderecoContato != null) {
           if((this.textoBairro.getText().compareTo("") != 0) || (this.textoLogradouro.getText().compareTo("") != 0)){
                atualizaEndereco();
           }
        }
    }//GEN-LAST:event_cmdSalvaActionPerformed

    private void listaEnderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEnderecosActionPerformed
       int pos = this.listaEnderecos.getSelectedIndex();
       this.enderecoContato = (Endereco) this.contato.getEndereco().get(pos);
       this.textoLogradouro.setText(this.enderecoContato.getLogradouro());
       this.textoBairro.setText(this.enderecoContato.getBairro());
       this.textnumero.setText(this.enderecoContato.getNumero());
       this.textoComplemento.setText(this.enderecoContato.getComplemento());
       this.cmdApagar.setText("Apagar Endereço");
    }//GEN-LAST:event_listaEnderecosActionPerformed

    private void cmdApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdApagarActionPerformed
        if(this.enderecoContato == null){
            apagarContato();
        }else{
           apagarEndereco();
        }
    }//GEN-LAST:event_cmdApagarActionPerformed
    private void novoContato(){
        String nome = this.textoNome.getText();
        if(regexTexto.matcher(nome).matches()){
                this.contato = new Cliente();
                this.contato.setNome(nome);
                try {
                    this.contato.salva();
                   if(this.contato.getId() == 0) this.contato = null;
                   this.cmdApagar.setEnabled(true);
                } catch (SQLException ex) {
                    this.contato = null;
                } 
            }else{
                JOptionPane.showMessageDialog(this, "Nome Invalido: "+nome, "Agenda", HEIGHT);
            }
    }
    private void atualizaContato(){
        String nome = this.textoNome.getText();
        if(nome.compareTo(this.contato.getNome()) != 0){
                try {
                    this.contato.setNome(nome);
                    this.contato.atualizar();
                } catch (SQLException ex) {
                    
                }
            }
    }
    
    private void novoEndereco(){
        String logradouro = this.textoLogradouro.getText(),
        bairro = this.textoBairro.getText(),
        numero = this.textnumero.getText(),
        complemento = this.textoComplemento.getText();
        this.enderecoContato = new Endereco();
        this.enderecoContato.setBairro(bairro);
        this.enderecoContato.setLogradouro(logradouro);
        this.enderecoContato.setNumero(numero);
        this.enderecoContato.setComplemento(complemento);
        this.enderecoContato.setDono(this.contato);
        try {
            this.enderecoContato.salvar();
            this.contato.setEndereco(this.enderecoContato);
            this.listaEnderecos.add(this.enderecoContato.getLogradouro() + 
                " - " + this.enderecoContato.getNumero());
            this.enderecoContato = null;
            this.textoLogradouro.setText("");
            this.textoBairro.setText("");
            this.textnumero.setText("");
            this.textoComplemento.setText("");
        } catch (SQLException ex) {
            this.enderecoContato = null;
        }
    }
    private void atualizaEndereco(){
        String logradouro = this.textoLogradouro.getText(),
        bairro = this.textoBairro.getText(),
        numero = this.textnumero.getText(),
        complemento = this.textoComplemento.getText();
        this.enderecoContato.setBairro(bairro);
        this.enderecoContato.setLogradouro(logradouro);
        this.enderecoContato.setNumero(numero);
        this.enderecoContato.setComplemento(complemento);
        try {
            this.enderecoContato.atualizar();
            this.enderecoContato.atualizar();
            this.textoLogradouro.setText("");
            this.textoBairro.setText("");
            this.textnumero.setText("");
            this.textoComplemento.setText("");
            this.listaEnderecos.removeAll();
            this.listarEnderecos();
            this.enderecoContato = null;
            this.cmdApagar.setText("Apagar Contato");
        } catch (SQLException ex) {

        }
    }
    private void apagarContato(){
        if(this.contato.getEndereco() != null){
            if(this.contato.getEndereco().size() > 0){
                ArrayList<Endereco> ends = this.contato.getEndereco();
                for (int i = 0; i < this.contato.getEndereco().size(); i++) {
                    try {
                        ends.get(i).excluir();
                    } catch (SQLException ex) {
                    }
               }
            }
        }
             try {
                  this.contato.excluir();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            this.contato = null;
            this.enderecoContato = null;
            this.listaEnderecos.removeAll();
            this.textoLogradouro.setText("");
            this.textoBairro.setText("");
            this.textnumero.setText("");
            this.textoComplemento.setText("");
            this.textoNome.setText("");
            this.cmdApagar.setEnabled(false);
    }
    private void apagarEndereco(){
        this.textoLogradouro.setText("");
        this.textoBairro.setText("");
        this.textnumero.setText("");
        this.textoComplemento.setText("");
        this.cmdApagar.setText("Apagar Contato");
        try {
            this.enderecoContato.excluir();
            this.enderecoContato = null;
            this.listaEnderecos.removeAll();
            this.listarEnderecos();
            this.enderecoContato = null;
        } catch (SQLException ex) {

        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalvarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalvarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalvarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalvarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalvarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdApagar;
    private javax.swing.JToggleButton cmdSalva;
    private javax.swing.JToggleButton cmdVoltar;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl03;
    private javax.swing.JLabel lbl04;
    private javax.swing.JLabel lbl05;
    private java.awt.List listaEnderecos;
    private javax.swing.JTextField textnumero;
    private javax.swing.JTextField textoBairro;
    private javax.swing.JTextField textoComplemento;
    private javax.swing.JTextField textoLogradouro;
    private javax.swing.JTextField textoNome;
    // End of variables declaration//GEN-END:variables
}
