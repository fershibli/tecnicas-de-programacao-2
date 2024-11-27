/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class Cliente {
    private String tableName = "CLIENTES";
    private int idCli;
    private String nome;
    private String cpf;
    private String cnpj;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String email;
    private String telefone;
    private String sexo;
    private boolean status;
    private Date dataNascimento;

    public Cliente() {
    }

    public Cliente(int idCli, String nome, String cpf, String cnpj, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String cep, String email, String telefone, String sexo, boolean status) {
        this.idCli = idCli;
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.status = status;
    }

    private boolean validaIdCli(int idCli) {
        return idCli > 0;
    }

    private boolean validaNome(String nome) {
        return nome != null && nome.trim().length() > 2 && nome.length() <= 50;
    }

    private boolean validaCpf(String cpf) {
        return cpf != null && cpf.trim().replaceAll("[^0-9]", "").length() == 11;
    }

    private boolean validaCnpj(String cnpj) {
        return cnpj != null && cnpj.trim().replaceAll("[^0-9]", "").length() == 14;
    }

    private boolean validaEndereco(String endereco) {
        return endereco != null && endereco.trim().length() > 5 && endereco.length() <= 50;
    }

    private boolean validaNumero(String numero) {
        return numero == null || (numero.trim().length() > 0 && numero.length() <= 8);
    }

    private boolean validaComplemento(String complemento) {
        return complemento == null || (complemento.length() <= 20 && complemento.trim().length() > 0);
    }

    private boolean validaBairro(String bairro) {
        return bairro == null || (bairro.length() <= 20 && bairro.trim().length() > 2);
    }

    private boolean validaCidade(String cidade) {
        return cidade != null && cidade.trim().length() > 2 && cidade.length() <= 30;
    }

    private boolean validaUf(String uf) {
        return uf != null && uf.trim().length() == 2;
    }

    private boolean validaCep(String cep) {
        return cep != null && cep.trim().replaceAll("[^0-9]", "").length() == 8;
    }

    private boolean validaEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    private boolean validaTelefone(String telefone) {
        return telefone == null || telefone.length() <= 13;
    }

    private boolean validaSexo(String sexo) {
        return sexo != null && sexo.trim().length() > 0;
    }
    
    private boolean validaDataNascimento(Date dataNascimento) {
        return dataNascimento != null;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido. Deve ter mais de 2 caracteres.");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!validaCpf(cpf)) {
            throw new IllegalArgumentException("CPF inválido. Deve ter 11 dígitos.");
        }
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (!validaEndereco(endereco)) {
            throw new IllegalArgumentException("Endereço inválido. Deve ter mais de 5 caracteres.");
        }
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (!validaNumero(numero)) {
            throw new IllegalArgumentException("Número inválido. Deve ter mais de 1 caractere.");
        }
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if (!validaComplemento(complemento)) {
            throw new IllegalArgumentException("Complemento inválido. Deve ter mais de 1 caractere.");
        }
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if (!validaBairro(bairro)) {
            throw new IllegalArgumentException("Bairro inválido. Deve ter mais de 2 caracteres.");
        }
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (!validaCidade(cidade)) {
            throw new IllegalArgumentException("Cidade inválida. Deve ter mais de 2 caracteres.");
        }
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (!validaUf(uf)) {
            throw new IllegalArgumentException("UF inválida. Deve ter 2 caracteres.");
        }
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (!validaCep(cep)) {
            throw new IllegalArgumentException("CEP inválido. Deve ter 8 dígitos.");
        }
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!validaEmail(email)) {
            throw new IllegalArgumentException("Email inválido. Deve conter @ e .");
        }
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (!validaTelefone(telefone)) {
            throw new IllegalArgumentException("Telefone inválido. Deve ter 10 dígitos.");
        }
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (!validaCnpj(cnpj)) {
            throw new IllegalArgumentException("CNPJ inválido. Deve ter 14 dígitos.");
        }
        this.cnpj = cnpj;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!validaSexo(sexo)) {
            throw new IllegalArgumentException("Gênero inválido. Deve ter mais de 1 caractere.");
        }
        this.sexo = sexo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        if (!validaDataNascimento(dataNascimento)) {
            throw new IllegalArgumentException("Data de nascimento inválida.");
        }
        this.dataNascimento = dataNascimento;
    }

    public getTableName() {
        return tableName;
    }
    
    public String dadosSQLValues() {
        String dadosClientes;
        
        dadosClientes = "'"
            + this.getIdCli() + "', '"
            + this.getNome() + "', '"
            + this.getEndereco() + "', '"
            + this.getNumero() + "', '"
            + this.getComplemento() + "', '"
            + this.getBairro() + "', '"
            + this.getCidade() + "', '"
            + this.getUf() + "', '"
            + this.getCep() + "', '"
            + this.getTelefone() + "', '"
            + this.getCpf() + "', '"
            + this.getDataNascimento() + "', '"
            + this.getCnpj() + "'";
        
        return dadosClientes;
    }
}