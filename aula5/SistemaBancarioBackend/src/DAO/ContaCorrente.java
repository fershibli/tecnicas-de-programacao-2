/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author Alunos
 */
public class ContaCorrente implements BaseDAO {
    final String tableName = "CONTACORRENTE";
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

    
    private boolean validaSaldo(double saldo) {
        return saldo >= 0;
    }

    private boolean validaNumConta(String numConta) {
        return numConta != null && numConta.trim().length() > 0 && numConta.length() <= 10;
    }

    private boolean validaNumAgencia(String numAgencia) {
        return numAgencia != null && numAgencia.trim().length() > 0 && numAgencia.length() <= 5;
    }

    private boolean validaIdCli(int idCli) {
        return idCli > 0;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        if (!validaNumConta(numConta)) {
            throw new IllegalArgumentException("Número da conta inválido. Deve ter pelo menos 1 caractere.");
        }
        this.numConta = numConta;
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        if (!validaNumAgencia(numAgencia)) {
            throw new IllegalArgumentException("Número da agência inválido. Deve ter pelo menos 1 caractere.");
        }
        this.numAgencia = numAgencia;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        if (!validaIdCli(idCli)) {
            throw new IllegalArgumentException("ID do cliente inválido. Deve ser maior que 0.");
        }
        this.idCli = idCli;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
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
    public String dadosSQLValues(){
        return this.getNumAgencia() + ", "
            + this.getNumConta() + ", "
            + this.getIdCli() + ", "
            + this.getSaldo() + "";
    }

    @Override
    public String alteraDadosSQLValues() {
        return "numAgencia = " + this.getNumAgencia() + ", "
            + "numConta = " + this.getNumConta() + ", "
            + "idCli = " + this.getIdCli() + ", "
            + "saldo = " + this.getSaldo() + "";
    }

    @Override
    public String termoSQLWhereById() {
        return "numAgencia = " + this.getNumAgencia();
    }

    @Override
    public String consultaSQLValues() {
        return "numAgencia, numConta, idCli, saldo";
    }

    @Override
    public void importaSQLValues(List<String> dados) {
        if (dados.size() != 4) {
            throw new IllegalArgumentException("Número de dados inválido");
        }
        this.setNumAgencia(dados.get(0));
        this.setNumConta(dados.get(1));
        this.setIdCli(Integer.parseInt(dados.get(2)));
        this.setSaldo(Integer.parseInt(dados.get(3)));
    }
}