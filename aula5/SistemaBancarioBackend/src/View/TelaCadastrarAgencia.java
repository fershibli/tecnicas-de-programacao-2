/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import DAO.Agencia;
import DAO.connectDAO;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Alunos
 */
public class TelaCadastrarAgencia extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarAgencia
     */
    public TelaCadastrarAgencia() {
        initComponents();
    }
    
    String operacaoAtivaGlobal = "Nenhum";
    
    public TelaCadastrarAgencia(String operacaoAtiva) {
        initComponents();
        operacaoAtivaGlobal = operacaoAtiva;
        
        String operacao = "Incluir";
        if (operacaoAtiva.equals(operacao)) {
            this.setAllVisible(true);
        }
        
        operacao = "Alterar";
        String operacaoExcluir = "Excluir";
        if (operacaoAtiva.equals(operacao) || operacaoAtiva.equals(operacaoExcluir)) {
            this.setAllVisible(false);
            labelCodAgencia.setVisible(true);
            codAgencia.setVisible(true);
            
            buttonVoltar.setVisible(true);
            buttonCadastrar.setVisible(true);
            buttonCadastrar.setText("Pesquisar");
        }
        
    }
    
    Agencia agenciaTela = new Agencia();


    private void setAllVisible(Boolean visible) {
        labelCodAgencia.setVisible(visible);
        jLabel2.setVisible(visible);
        jLabel3.setVisible(visible);
        jLabel4.setVisible(visible);
        jLabel5.setVisible(visible);
        jLabel6.setVisible(visible);
        jLabel7.setVisible(visible);
        jLabel8.setVisible(visible);
        jLabel9.setVisible(visible);
        codAgencia.setVisible(visible);
        nomeAgencia.setVisible(visible);
        enderecoAgencia.setVisible(visible);
        numeroEndAgencia.setVisible(visible);
        bairroAgencia.setVisible(visible);
        cepAgencia.setVisible(visible);
        cidadeAgencia.setVisible(visible);
        ufAgencia.setVisible(visible);
        telefoneAgencia.setVisible(visible);
        buttonCadastrar.setVisible(visible);
        buttonLimpar.setVisible(visible);
        buttonVoltar.setVisible(visible);
        jLabel11.setVisible(visible);
        complementoEndAgencia.setVisible(visible);
    }
    
    private void setAllEnabled(Boolean enabled) {
        labelCodAgencia.setEnabled(enabled);
        jLabel2.setEnabled(enabled);
        jLabel3.setEnabled(enabled);
        jLabel4.setEnabled(enabled);
        jLabel5.setEnabled(enabled);
        jLabel6.setEnabled(enabled);
        jLabel7.setEnabled(enabled);
        jLabel8.setEnabled(enabled);
        jLabel9.setEnabled(enabled);
        codAgencia.setEnabled(enabled);
        nomeAgencia.setEnabled(enabled);
        enderecoAgencia.setEnabled(enabled);
        numeroEndAgencia.setEnabled(enabled);
        bairroAgencia.setEnabled(enabled);
        cepAgencia.setEnabled(enabled);
        cidadeAgencia.setEnabled(enabled);
        ufAgencia.setEnabled(enabled);
        telefoneAgencia.setEnabled(enabled);
        buttonCadastrar.setEnabled(enabled);
        buttonLimpar.setEnabled(enabled);
        buttonVoltar.setEnabled(enabled);
        jLabel11.setEnabled(enabled);
        complementoEndAgencia.setEnabled(enabled);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCodAgencia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codAgencia = new javax.swing.JTextField();
        nomeAgencia = new javax.swing.JTextField();
        enderecoAgencia = new javax.swing.JTextField();
        numeroEndAgencia = new javax.swing.JTextField();
        bairroAgencia = new javax.swing.JTextField();
        cepAgencia = new javax.swing.JTextField();
        cidadeAgencia = new javax.swing.JTextField();
        ufAgencia = new javax.swing.JComboBox<>();
        telefoneAgencia = new javax.swing.JTextField();
        buttonCadastrar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        complementoEndAgencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCodAgencia.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        labelCodAgencia.setText("Cód. da Agência:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Número:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("CEP:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("UF:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Telefone:");

        cidadeAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeAgenciaActionPerformed(evt);
            }
        });

        ufAgencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        telefoneAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneAgenciaActionPerformed(evt);
            }
        });

        buttonCadastrar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonLimpar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparlimparActionPerformed(evt);
            }
        });

        buttonVoltar.setText("← Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaMenu(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setText("Complemento:");

        complementoEndAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoEndAgenciaActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonCadastrar)
                                .addGap(380, 380, 380)
                                .addComponent(buttonLimpar))
                            .addComponent(buttonVoltar))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enderecoAgencia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCodAgencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeAgencia))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cidadeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ufAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefoneAgencia))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21)
                                .addComponent(bairroAgencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cepAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroEndAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complementoEndAgencia)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodAgencia)
                    .addComponent(jLabel2)
                    .addComponent(codAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enderecoAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEndAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(complementoEndAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cepAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(ufAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLimpar)
                    .addComponent(buttonCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cidadeAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeAgenciaActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if (operacaoAtivaGlobal.equals("Incluir")){
            try {
                this.agenciaTela.setNumAgencia(this.codAgencia.getText());
                this.agenciaTela.setNome(this.nomeAgencia.getText());
                this.agenciaTela.setEndereco(this.enderecoAgencia.getText());
                this.agenciaTela.setNumero(this.numeroEndAgencia.getText());
                this.agenciaTela.setComplemento(this.complementoEndAgencia.getText());
                this.agenciaTela.setBairro(this.bairroAgencia.getText());
                this.agenciaTela.setCidade(this.cidadeAgencia.getText());
                this.agenciaTela.setUf(this.ufAgencia.getSelectedItem().toString());
                this.agenciaTela.setCep(this.cepAgencia.getText());
                this.agenciaTela.setTelefone(this.telefoneAgencia.getText());

                connectDAO connDAO = new connectDAO();
                connDAO.connectDB();
                connDAO.insereRegistroJFBD(this.agenciaTela);
            } catch (IllegalArgumentException err) {        
                JOptionPane.showMessageDialog(this, err.getMessage());
                return;
            }



            JOptionPane.showMessageDialog(this, "Agência Cadastrada!");

            TelaMenu telaMenu = new TelaMenu();
            telaMenu.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        
        if (operacaoAtivaGlobal.equals("Alteração")){
            try {
                this.agenciaTela.setNumAgencia(this.codAgencia.getText());
                this.agenciaTela.setNome(this.nomeAgencia.getText());
                this.agenciaTela.setEndereco(this.enderecoAgencia.getText());
                this.agenciaTela.setNumero(this.numeroEndAgencia.getText());
                this.agenciaTela.setComplemento(this.complementoEndAgencia.getText());
                this.agenciaTela.setBairro(this.bairroAgencia.getText());
                this.agenciaTela.setCidade(this.cidadeAgencia.getText());
                this.agenciaTela.setUf(this.ufAgencia.getSelectedItem().toString());
                this.agenciaTela.setCep(this.cepAgencia.getText());
                this.agenciaTela.setTelefone(this.telefoneAgencia.getText());

                connectDAO connDAO = new connectDAO();
                connDAO.connectDB();
                connDAO.alteraRegistroJFBD(this.agenciaTela);
            } catch (IllegalArgumentException err) {        
                JOptionPane.showMessageDialog(this, err.getMessage());
                return;
            }



            JOptionPane.showMessageDialog(this, "Agência Atualizada!");

            TelaMenu telaMenu = new TelaMenu();
            telaMenu.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        
        if (operacaoAtivaGlobal.equals("Exclusão")) {
            connectDAO connDAO = new connectDAO();
            connDAO.connectDB();
            connDAO.excluiRegistroJFBD(this.agenciaTela);
            
            JOptionPane.showMessageDialog(this, "Agencia Excluída!");

            TelaMenu telaMenu = new TelaMenu();
            telaMenu.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        
        if (operacaoAtivaGlobal.equals("Alterar") || operacaoAtivaGlobal.equals("Excluir")){
            connectDAO connDAO = new connectDAO();
            
            this.agenciaTela.setNumAgencia(this.codAgencia.getText());
            
            List<String> dadosSQL = connDAO.consultaRegistroJFBD(this.agenciaTela);
            
            this.agenciaTela.importaSQLValues(dadosSQL);
            
            this.codAgencia.setText(this.agenciaTela.getNumAgencia());
            
            this.nomeAgencia.setText(this.agenciaTela.getNome());
            this.enderecoAgencia.setText(this.agenciaTela.getEndereco());
            this.numeroEndAgencia.setText(this.agenciaTela.getNumero());
            this.complementoEndAgencia.setText(this.agenciaTela.getComplemento());
            this.bairroAgencia.setText(this.agenciaTela.getBairro());
            this.cidadeAgencia.setText(this.agenciaTela.getCidade());
            this.ufAgencia.setSelectedItem(this.agenciaTela.getUf());
            this.cepAgencia.setText(this.agenciaTela.getCep());
            this.telefoneAgencia.setText(this.agenciaTela.getTelefone());
            
            
            this.setAllVisible(true);
            
            if (operacaoAtivaGlobal.equals("Excluir")) {
                buttonCadastrar.setText("Excluir");
                operacaoAtivaGlobal = "Exclusão";
                this.setAllEnabled(false);
                this.buttonVoltar.setEnabled(true);
                this.buttonCadastrar.setEnabled(true);
            } else {
                buttonCadastrar.setText("Alterar");
                operacaoAtivaGlobal = "Alteração";
            }
        }
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonLimparlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparlimparActionPerformed
        this.codAgencia.setText("");
        this.nomeAgencia.setText("");
        this.enderecoAgencia.setText("");
        this.numeroEndAgencia.setText("");
        this.bairroAgencia.setText("");
        this.cidadeAgencia.setText("");
        this.ufAgencia.setSelectedIndex(0);
        this.cepAgencia.setText("");
        this.telefoneAgencia.setText("");
        this.complementoEndAgencia.setText("");
    }//GEN-LAST:event_buttonLimparlimparActionPerformed

    private void voltarTelaMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaMenu
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_voltarTelaMenu

    private void complementoEndAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoEndAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoEndAgenciaActionPerformed

    private void telefoneAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneAgenciaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarAgencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroAgencia;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField cepAgencia;
    private javax.swing.JTextField cidadeAgencia;
    private javax.swing.JTextField codAgencia;
    private javax.swing.JTextField complementoEndAgencia;
    private javax.swing.JTextField enderecoAgencia;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCodAgencia;
    private javax.swing.JTextField nomeAgencia;
    private javax.swing.JTextField numeroEndAgencia;
    private javax.swing.JTextField telefoneAgencia;
    private javax.swing.JComboBox<String> ufAgencia;
    // End of variables declaration//GEN-END:variables
}
