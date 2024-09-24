/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fershibli.tp1.aula6.sistemabancario;

/**
 *
 * @author Alunos
 */
public class Agencia {
    private String tableName = "agencias";
    private String numAgencia;
    private String nome;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String cnpj;
    private String gerente;

    public Agencia(String numAgencia, String nome, String endereco, String numero, String bairro, String cidade, String uf, String cep, String cnpj, String gerente) {
        if (!validaAgencia(numAgencia, nome, endereco, numero, bairro, cidade, uf, cep, cnpj, gerente)){
            throw new IllegalArgumentException("Agência inválida");
        }
        this.numAgencia = numAgencia;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.cnpj = cnpj;
        this.gerente = gerente;
    }

    private boolean validaNumAgencia(String numAgencia){
        if (numAgencia == null || numAgencia.isBlank()){
            return false;
        }
        String numAgenciaLimpo = numAgencia.trim().replaceAll("[^0-9]", "");
        return numAgenciaLimpo.length() == 4 || numAgenciaLimpo.length() == 5;
    }

    private boolean validaNome(String nome){
        return (
            nome != null &&
            nome.trim().replaceAll("\\s+", " ").length() > 4
        );
    }

    private boolean validaEndereco(String endereco){
        return (
            endereco != null && 
            endereco.trim().replaceAll("\\s+", "").length() > 5
        );
    }

    private boolean validaNumero(String numero){
        return (
            numero != null && 
            numero.trim().replaceAll("\\s+", "").length() > 0
        );
    }

    private boolean validaBairro(String bairro){
        return (
            bairro != null && 
            bairro.trim().replaceAll("\\s+", "").length() > 3
        );
    }

    private boolean validaCidade(String cidade){
        return (
            cidade  != null &&
            cidade.trim().replaceAll("\\s+", "").length() > 3
        );
    }

    private boolean validaUf(String uf){
        return (
            uf != null && 
            uf.trim().replaceAll("\\s+", "").length() == 2
        );
    }

    private boolean validaCep(String cep){
        return (
            cep != null &&
            cep.trim().replaceAll("[^0-9]", "").length() == 8
        );
    }

    private boolean validaCnpj(String cnpj){
        return (
            cnpj != null &&
            cnpj.trim().replaceAll("[^0-9]", "").length() == 14
        );
    }

    private boolean validaGerente(String gerente){
        return (
            gerente != null &&
            gerente.trim().replaceAll("\\s+", "").length() > 5
        );
    }

    public boolean validaAgencia(String numAgencia, String nome, String endereco, String numero, String bairro, String cidade, String uf, String cep, String cnpj, String gerente){
        return validaNumAgencia(numAgencia) && validaNome(nome) && validaEndereco(endereco) && validaNumero(numero) && validaBairro(bairro) && validaCidade(cidade) && validaUf(uf) && validaCep(cep) && validaCnpj(cnpj) && validaGerente(gerente);
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        if (!validaNumAgencia(numAgencia)){
            throw new IllegalArgumentException("Número de agência inválido");
        }
        this.numAgencia = numAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (!validaEndereco(endereco)) {
            throw new IllegalArgumentException("Endereço inválido");
        }
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (!validaNumero(numero)) {
            throw new IllegalArgumentException("Número inválido");
        }
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if (!validaBairro(bairro)) {
            throw new IllegalArgumentException("Bairro inválido");
        }
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (!validaCidade(cidade)) {
            throw new IllegalArgumentException("Cidade inválida");
        }
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (!validaUf(uf)) {
            throw new IllegalArgumentException("UF inválida");
        }
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (!validaCep(cep)) {
            throw new IllegalArgumentException("CEP inválido");
        }
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (!validaCnpj(cnpj)) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        this.cnpj = cnpj;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        if (!validaGerente(gerente)) {
            throw new IllegalArgumentException("Gerente inválido");
        }
        this.gerente = gerente;
    }
}