/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.Cliente;
import DAO.connectDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class TelaCadastrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public TelaCadastrarCliente() {
        initComponents();
    }
    
    String operacaoAtivaGlobal = "Nenhum";
    
    public TelaCadastrarCliente(String operacaoAtiva){
        initComponents();
        operacaoAtivaGlobal = operacaoAtiva;
        
        String operacao = "Incluir";
        if (operacaoAtiva.equals(operacao)) {
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            statusCliente.setVisible(true);
            nomeCliente.setVisible(true);
            jLabel7.setVisible(true);
            idCliente.setVisible(true);
            enderecoCliente.setVisible(true);
            numeroCliente.setVisible(true);
            jLabel8.setVisible(true);
            complementoCliente.setVisible(true);
            bairroCliente.setVisible(true);
            jLabel9.setVisible(true);
            cepCliente.setVisible(true);
            cidadeCliente.setVisible(true);
            jLabel10.setVisible(true);
            cpfCliente.setVisible(true);
            jLabel12.setVisible(true);
            cnpjCliente.setVisible(true);
            jLabel13.setVisible(true);
            dataNascCliente.setVisible(true);
            jButton1.setVisible(true);
            ButtonCadastrar.setVisible(true);
            jButton3.setVisible(true);
            jLabel14.setVisible(true);
            telefoneCliente.setVisible(true);
            ufCliente.setVisible(true);
            jButton4.setVisible(true);
        }
        
        operacao = "Alterar";
        if (operacaoAtiva.equals(operacao)) {
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            statusCliente.setVisible(false);
            nomeCliente.setVisible(false);
            jLabel7.setVisible(true); // label ID
            idCliente.setVisible(true); // field ID
            enderecoCliente.setVisible(false);
            numeroCliente.setVisible(false);
            jLabel8.setVisible(false);
            complementoCliente.setVisible(false);
            bairroCliente.setVisible(false);
            jLabel9.setVisible(false);
            cepCliente.setVisible(false);
            cidadeCliente.setVisible(false);
            jLabel10.setVisible(false);
            cpfCliente.setVisible(false);
            jLabel12.setVisible(false);
            cnpjCliente.setVisible(false);
            jLabel13.setVisible(false);
            dataNascCliente.setVisible(false);
            jButton1.setVisible(false);
            ButtonCadastrar.setVisible(true); // button
            jButton3.setVisible(false);
            jLabel14.setVisible(false);
            telefoneCliente.setVisible(false);
            ufCliente.setVisible(false);
            jButton4.setVisible(false);
            
            ButtonCadastrar.setText("Pesquisar");
        }
        
        
    }
    
    Cliente clienteTela = new Cliente();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        statusCliente = new javax.swing.JCheckBox();
        nomeCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        enderecoCliente = new javax.swing.JTextField();
        numeroCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        complementoCliente = new javax.swing.JTextField();
        bairroCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cepCliente = new javax.swing.JTextField();
        cidadeCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cpfCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cnpjCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dataNascCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        telefoneCliente = new javax.swing.JTextField();
        ufCliente = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Endereço:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Número:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Bairro:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Cidade:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("CPF:");

        statusCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        statusCliente.setText("Status ativo?");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("ID:");

        idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Complemento:");

        complementoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoClienteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("CEP:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("UF:");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel12.setText("CNPJ:");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setText("Data de Nascimento:");

        jButton1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        ButtonCadastrar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton3.setText("Detalhes");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel14.setText("Telefone:");

        ufCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jButton4.setText("← Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaMenu(evt);
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
                        .addComponent(ButtonCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complementoCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cepCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpjCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ufCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(statusCliente))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNascCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(dataNascCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(complementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ufCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ButtonCadastrar)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClienteActionPerformed

    private void complementoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoClienteActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        
        String operacao = "Incluir";
        if(operacaoAtivaGlobal.equals(operacao)){
            try {
                this.clienteTela.setIdCli(Integer.parseInt(this.idCliente.getText()));
                this.clienteTela.setNome(this.nomeCliente.getText());
                this.clienteTela.setCpf(this.cpfCliente.getText());
                this.clienteTela.setCnpj(this.cnpjCliente.getText());
                this.clienteTela.setEndereco(this.enderecoCliente.getText());
                this.clienteTela.setNumero(this.numeroCliente.getText());
                this.clienteTela.setComplemento(this.complementoCliente.getText());
                this.clienteTela.setBairro(this.bairroCliente.getText());
                this.clienteTela.setCidade(this.cidadeCliente.getText());
                this.clienteTela.setUf(this.ufCliente.getSelectedItem().toString());
                this.clienteTela.setCep(this.cepCliente.getText());
                this.clienteTela.setTelefone(this.telefoneCliente.getText());
                SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
                Date dataNascClienteFormatada = dateFormater.parse(this.dataNascCliente.getText());
                this.clienteTela.setDataNascimento(dataNascClienteFormatada);
                this.clienteTela.setStatus(this.statusCliente.isSelected());

                connectDAO connDAO = new connectDAO();
                connDAO.connectDB();
                connDAO.insereRegistroJFBD(this.clienteTela.getTableName(), this.clienteTela.dadosSQLValues());

            } catch (IllegalArgumentException | ParseException err) {        
                JOptionPane.showMessageDialog(this, err.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(this, "Cliente Cadastrado!");

            TelaMenu telaMenu = new TelaMenu();
            telaMenu.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        
        operacao = "Alteração";
        if(operacaoAtivaGlobal.equals(operacao)){
            try {
                // this.clienteTela.setIdCli(Integer.parseInt(this.idCliente.getText()));
                this.clienteTela.setNome(this.nomeCliente.getText());
                this.clienteTela.setCpf(this.cpfCliente.getText());
                this.clienteTela.setCnpj(this.cnpjCliente.getText());
                this.clienteTela.setEndereco(this.enderecoCliente.getText());
                this.clienteTela.setNumero(this.numeroCliente.getText());
                this.clienteTela.setComplemento(this.complementoCliente.getText());
                this.clienteTela.setBairro(this.bairroCliente.getText());
                this.clienteTela.setCidade(this.cidadeCliente.getText());
                this.clienteTela.setUf(this.ufCliente.getSelectedItem().toString());
                this.clienteTela.setCep(this.cepCliente.getText());
                this.clienteTela.setTelefone(this.telefoneCliente.getText());
                SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
                Date dataNascClienteFormatada = dateFormater.parse(this.dataNascCliente.getText());
                this.clienteTela.setDataNascimento(dataNascClienteFormatada);
                this.clienteTela.setStatus(this.statusCliente.isSelected());

                connectDAO connDAO = new connectDAO();
                connDAO.connectDB();
                connDAO.alteraRegistroJFBD(this.clienteTela.getTableName(), this.clienteTela.alteraDadosSQLValues(), "ID_CLI='"+this.clienteTela.getIdCli()+"'");

            } catch (IllegalArgumentException | ParseException err) {        
                JOptionPane.showMessageDialog(this, err.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(this, "Cliente Alterado!");

            TelaMenu telaMenu = new TelaMenu();
            telaMenu.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        
        operacao = "Alterar";
        if (operacaoAtivaGlobal.equals(operacao)){
            connectDAO connDAO = new connectDAO();
            
            List<String> dadosSQL = connDAO.consultaRegistroJFBD(
                    this.clienteTela.getTableName(), 
                    this.clienteTela.consultaSQLValues(), 
                    "ID_CLI='"+idCliente.getText()+"'"
            );
            
            this.clienteTela.importaSQLValues(dadosSQL);
            
            
            this.nomeCliente.setText(clienteTela.getNome());
            this.cpfCliente.setText(clienteTela.getCpf());
            this.cnpjCliente.setText(clienteTela.getCnpj());
            this.enderecoCliente.setText(clienteTela.getEndereco());
            this.numeroCliente.setText(clienteTela.getNumero());
            this.complementoCliente.setText(clienteTela.getComplemento());
            this.bairroCliente.setText(clienteTela.getBairro());
            this.cidadeCliente.setText(clienteTela.getCidade());
            this.ufCliente.setSelectedItem(clienteTela.getUf());
            this.cepCliente.setText(clienteTela.getCep());
            this.telefoneCliente.setText(clienteTela.getTelefone());
            SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
            String dataNascClienteString = dateFormater.format(clienteTela.getDataNascimento());
            this.dataNascCliente.setText(dataNascClienteString);
            
            
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            statusCliente.setVisible(true);
            nomeCliente.setVisible(true);
            jLabel7.setVisible(false); // LABEL ID_CLI
            idCliente.setVisible(false); // FIELD ID_CLI
            enderecoCliente.setVisible(true);
            numeroCliente.setVisible(true);
            jLabel8.setVisible(true);
            complementoCliente.setVisible(true);
            bairroCliente.setVisible(true);
            jLabel9.setVisible(true);
            cepCliente.setVisible(true);
            cidadeCliente.setVisible(true);
            jLabel10.setVisible(true);
            cpfCliente.setVisible(true);
            jLabel12.setVisible(true);
            cnpjCliente.setVisible(true);
            jLabel13.setVisible(true);
            dataNascCliente.setVisible(true);
            jButton1.setVisible(true);
            ButtonCadastrar.setVisible(true);
            jButton3.setVisible(true);
            jLabel14.setVisible(true);
            telefoneCliente.setVisible(true);
            ufCliente.setVisible(true);
            jButton4.setVisible(true);
            
            ButtonCadastrar.setText("Alterar");
            operacaoAtivaGlobal = "Alteração";
        }
        
    }//GEN-LAST:event_cadastrarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        this.idCliente.setText("");
        this.nomeCliente.setText("");
        this.cpfCliente.setText("");
        this.cnpjCliente.setText("");
        this.enderecoCliente.setText("");
        this.numeroCliente.setText("");
        this.complementoCliente.setText("");
        this.bairroCliente.setText("");
        this.cidadeCliente.setText("");
        this.ufCliente.setSelectedIndex(0);
        this.cepCliente.setText("");
        this.dataNascCliente.setText("");
        this.telefoneCliente.setText("");
        this.statusCliente.setSelected(false);
    }//GEN-LAST:event_limparActionPerformed

    private void voltarTelaMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaMenu
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_voltarTelaMenu

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
            java.util.logging.Logger.getLogger(TelaCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JTextField bairroCliente;
    private javax.swing.JTextField cepCliente;
    private javax.swing.JTextField cidadeCliente;
    private javax.swing.JTextField cnpjCliente;
    private javax.swing.JTextField complementoCliente;
    private javax.swing.JTextField cpfCliente;
    private javax.swing.JTextField dataNascCliente;
    private javax.swing.JTextField enderecoCliente;
    private javax.swing.JTextField idCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JTextField numeroCliente;
    private javax.swing.JCheckBox statusCliente;
    private javax.swing.JTextField telefoneCliente;
    private javax.swing.JComboBox<String> ufCliente;
    // End of variables declaration//GEN-END:variables
}
