/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.util.Date;

/**
 *
 * @author Alunos
 */
public class ExtratoMovimentacao {
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

    public String getTableName() {
        return tableName;
    }

    public String dadosSQLValues() {
        return "'"
            + this.getNumAgencia() + "', '"
            + this.getNumConta() + "', '"
            + this.getDataMovimento() + "', '"
            + this.getDocumento() + "', '"
            + this.getCreditoDebito() + "', "
            + this.getId_his() + ", '"
            + this.getComplHist() + "', "
            + this.getValor() + ", "
            + this.getSaldo() + "'";
    }
}