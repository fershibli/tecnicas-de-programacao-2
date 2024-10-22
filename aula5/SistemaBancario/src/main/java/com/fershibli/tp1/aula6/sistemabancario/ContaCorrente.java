/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fershibli.tp1.aula6.sistemabancario;

/**
 *
 * @author Alunos
 */
public class ContaCorrente {
    private String tableName = "conta_corrente";
    private String numConta;
    private String numAgencia;
    private int idCli;
    private int saldo;

    public ContaCorrente() {
        
    }
    
    public ContaCorrente(String numConta, String numAgencia, int idCli, int saldo) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.idCli = idCli;
        this.saldo = saldo;
    }

    public void Sacar(int valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    public void Depositar(int valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public boolean Transferir(ContaCorrente contaDestino, int valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.Depositar(valor);
            return true;
        }
        return false;
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

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
