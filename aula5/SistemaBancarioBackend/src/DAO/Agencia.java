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
public class Agencia implements BaseDAO {
    final String tableName = "AGENCIAS";
    private String numAgencia;
    private String nome;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String cnpj;
    private String gerente;
    private String telefone;

    public Agencia() {
    }

    public Agencia(String numAgencia, String nome, String endereco, String numero, String bairro, String cidade, String uf, String cep, String cnpj, String gerente) {
        if (!validaAgencia(numAgencia, nome, endereco, numero, bairro, cidade, uf, cep, cnpj, gerente)){
            return;
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
        return numAgenciaLimpo.length() > 0 && Integer.parseInt(numAgenciaLimpo) > 0;
    }

    private boolean validaNome(String nome){
        return (
            nome != null &&
            nome.trim().replaceAll("\\s+", " ").length() > 4 &&
            nome.length() <= 30
        );
    }

    private boolean validaEndereco(String endereco){
        return (
            endereco != null && 
            endereco.trim().replaceAll("\\s+", "").length() > 5 &&
            endereco.length() <= 50
        );
    }

    private boolean validaNumero(String numero){
        return (
            numero == null ||
            numero.length() <= 8
        );
    }

    private boolean validaComplemento(String complemento) {
        return complemento == null || complemento.length() <= 20;
    }

    private boolean validaBairro(String bairro){
        return (
            bairro == null || bairro.length() <= 20
        );
    }

    private boolean validaCidade(String cidade){
        return (
            cidade  != null &&
            cidade.trim().replaceAll("\\s+", "").length() > 3 && 
            cidade.length() <= 30
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
    
    private boolean validaTelefone(String telefone) {
        return telefone == null || telefone.length() <= 13;
    }

    private boolean validaAgencia(String numAgencia, String nome, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String cep, String telefone) {
        return validaNumAgencia(numAgencia) && validaNome(nome) && validaEndereco(endereco) && validaNumero(numero) && validaComplemento(complemento) && validaBairro(bairro) && validaCidade(cidade) && validaUf(uf) && validaCep(cep) && validaTelefone(telefone);
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if (!validaComplemento(complemento)) {
            throw new IllegalArgumentException("Complemento inválido");
        }
        this.complemento = complemento;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (!validaTelefone(telefone)) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = telefone;
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public String dadosSQLValues() {
        return "'" 
            + this.getNumAgencia() + "', '"
            + this.getNome() + "', '"
            + this.getEndereco() + "', '"
            + this.getNumero() + "', '"
            + this.getComplemento() + "', '"
            + this.getBairro() + "', '"
            + this.getCidade() + "', '"
            + this.getUf() + "', '"
            + this.getCep() + "', '"
            + this.getTelefone() + "'";
    }

    @Override
    public String alteraDadosSQLValues() {
        return "NUM_AGE = '" + this.getNumAgencia() + "', "
            + "NOME_AGE = '" + this.getNome() + "', "
            + "ENDE_AGE = '" + this.getEndereco() + "', "
            + "NUME_AGE = '" + this.getNumero() + "', "
            + "COMPL_AGE = '" + this.getComplemento() + "', "
            + "BAIR_AGE = '" + this.getBairro() + "', "
            + "CIDA_AGE = '" + this.getCidade() + "', "
            + "UF_AGE = '" + this.getUf() + "', "
            + "CEP_AGE = '" + this.getCep() + "', "
            + "FONE_AGE = '" + this.getTelefone() + "'";
    }

    @Override
    public String termoSQLWhereById() {
        return "NUM_AGE = " + this.getNumAgencia();
    }

    @Override
    public String consultaSQLValues() {
        return "NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE";
    }

    @Override
    public void importaSQLValues(List<String> dados) {
        if (dados.size() != 11) {
            throw new IllegalArgumentException("Número de dados inválido");
        }
        this.setNumAgencia(dados.get(0));
        this.setNome(dados.get(1));
        this.setEndereco(dados.get(2));
        this.setNumero(dados.get(3));
        this.setComplemento(dados.get(4));
        this.setBairro(dados.get(5));
        this.setCidade(dados.get(6));
        this.setUf(dados.get(7));
        this.setCep(dados.get(8));
        this.setCnpj(dados.get(9));
        this.setGerente(dados.get(10));
    }
}