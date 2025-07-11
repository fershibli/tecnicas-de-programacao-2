/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos
 */
public class ExtratoMovimentacao implements BaseDAO {
    final String tableName = "MOVIMENTACAO";
    private String numConta;
    private String numAgencia;
    private String documento;
    private Date dataMovimento;
    private String creditoDebito;
    private int id_his;
    private String complHist;
    private double valor;
    private double saldo;

    public ExtratoMovimentacao() {
    }
    

    public ExtratoMovimentacao(String numConta, String numAgencia, String documento, Date dataMovimento, String creditoDebito, int id_his, String complHist, int valor, int saldo) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.documento = documento;
        this.dataMovimento = dataMovimento;
        this.creditoDebito = creditoDebito;
        this.id_his = id_his;
        this.complHist = complHist;
        this.valor = valor;
        this.saldo = saldo;
    }
    
    private boolean validaNumConta(String numConta) {
        return numConta != null && numConta.trim().length() > 0 && numConta.length() <= 10;
    }

    private boolean validaNumAgencia(String numAgencia) {
        return numAgencia != null && numAgencia.trim().length() > 0 && numAgencia.length() <= 5;
    }

    private boolean validaDocumento(String documento) {
        return documento != null && documento.trim().length() > 0 && documento.length() <= 6;
    }

    private boolean validaDataMovimento(Date dataMovimento) {
        return dataMovimento != null;
    }

    private boolean validaCreditoDebito(String creditoDebito) {
        return creditoDebito != null && (creditoDebito.equalsIgnoreCase("C") || creditoDebito.equalsIgnoreCase("D"));
    }

    private boolean validaId_his(int id_his) {
        return id_his > 0;
    }

    private boolean validaComplHist(String complHist) {
        return complHist == null || complHist.length() <= 30;
    }

    private boolean validaValor(double valor) {
        return valor >= 0;
    }

    private boolean validaSaldo(double saldo) {
        return saldo >= 0;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        if (!validaNumConta(numConta)) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        this.numConta = numConta;
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        if (!validaNumAgencia(numAgencia)) {
            throw new IllegalArgumentException("Número da agência inválido");
        }
        this.numAgencia = numAgencia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (!validaDocumento(documento)) {
            throw new IllegalArgumentException("Documento inválido");
        }
        this.documento = documento;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        if (!validaDataMovimento(dataMovimento)) {
            throw new IllegalArgumentException("Data de movimento inválida");
        }
        this.dataMovimento = dataMovimento;
    }

    public String getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(String creditoDebito) {
        if (!validaCreditoDebito(creditoDebito)) {
            throw new IllegalArgumentException("Crédito/Débito inválido");
        }
        this.creditoDebito = creditoDebito;
    }

    public int getId_his() {
        return id_his;
    }

    public void setId_his(int id_his) {
        if (!validaId_his(id_his)) {
            throw new IllegalArgumentException("ID histórico inválido");
        }
        this.id_his = id_his;
    }

    public String getComplHist() {
        return complHist;
    }

    public void setComplHist(String complHist) {
        if (!validaComplHist(complHist)) {
            throw new IllegalArgumentException("Complemento histórico inválido");
        }
        this.complHist = complHist;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (!validaValor(valor)) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (!validaSaldo(saldo)) {
            throw new IllegalArgumentException("Saldo inválido");
        }
        this.saldo = saldo;
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public String dadosSQLValues() {
        
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataMovimentoFormatada = dateFormater.format(this.getDataMovimento());
        System.out.println(dataMovimentoFormatada);
        
        return this.getNumAgencia() + ", "
            + this.getNumConta() + ", '"
            + dataMovimentoFormatada + "', '"
            + this.getDocumento() + "', '"
            + this.getCreditoDebito() + "', "
            + this.getId_his() + ", '"
            + this.getComplHist() + "', "
            + this.getValor() + ", "
            + this.getSaldo() + "";
    }

    @Override
    public String alteraDadosSQLValues() {
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataMovimentoFormatada = dateFormater.format(this.getDataMovimento());
        
        return "NUM_AGE = " + this.getNumAgencia() + ", "
            + "NUM_CC = " + this.getNumConta() + ", "
            + "DATA_MOV = '" + dataMovimentoFormatada + "', "
            + "NUM_DOCTO = '" + this.getDocumento() + "', "
            + "DEBITO_CREDITO = '" + this.getCreditoDebito() + "', "
            + "ID_HIS = " + this.getId_his() + ", "
            + "COMPL_HIS = '" + this.getComplHist() + "', "
            + "VALOR = " + this.getValor() + ", "
            + "SALDO = " + this.getSaldo() + "";
    }

    @Override
    public String termoSQLWhereById() {
        return "NUM_DOCTO = '" + this.getDocumento() + "'";
    }

    @Override
    public String consultaSQLValues() {
        return "NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO";
    }

    @Override
    public void importaSQLValues(List<String> dados) {
        try {
            if (dados.size() != 9) {
                throw new IllegalArgumentException("Número de dados inválido. Esperado 9 dados.");
            }
            SimpleDateFormat dateFormaterFromDB = new SimpleDateFormat("yyyy-MM-dd");

            this.setNumAgencia(dados.get(0));
            this.setNumConta(dados.get(1));
            this.setDataMovimento(dateFormaterFromDB.parse(dados.get(2)));
            this.setDocumento(dados.get(3));
            this.setCreditoDebito(dados.get(4));
            this.setId_his(Integer.parseInt(dados.get(5)));
            this.setComplHist(dados.get(6));
            this.setValor(Double.parseDouble(dados.get(7)));
            this.setSaldo(Double.parseDouble(dados.get(8)));
        } catch (ParseException ex) {
            Logger.getLogger(ExtratoMovimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}