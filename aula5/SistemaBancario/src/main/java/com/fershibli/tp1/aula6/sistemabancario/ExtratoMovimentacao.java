/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fershibli.tp1.aula6.sistemabancario;
import java.util.Date;

/**
 *
 * @author Alunos
 */
public class ExtratoMovimentacao {
    private String tableName = "extrato_movimentacao";
    private String numConta;
    private String numAgencia;
    private String documento;
    private Date dataMovimento;
    private String creditoDebito;
    private int id_his;
    private String complHist;
    private int valor;
    private int saldo;

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
    
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(String creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

    public int getId_his() {
        return id_his;
    }

    public void setId_his(int id_his) {
        this.id_his = id_his;
    }

    public String getComplHist() {
        return complHist;
    }

    public void setComplHist(String complHist) {
        this.complHist = complHist;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
