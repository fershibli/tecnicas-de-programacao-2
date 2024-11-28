/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class Usuario {
    private String tableName = "USUARIOS";
    private String login;
    private String senha;
    private int idCli;
    private String numAgencia;
    private String numConta;

    public Usuario() {
    }

    public Usuario(String login, String senha, int idCli) {
        this.login = login;
        this.senha = senha;
        this.idCli = idCli;
    }

    private boolean validaLogin(String login) {
        return login != null && login.trim().length() > 3 && login.length() <= 20;
    }

    private boolean validaSenha(String senha) {
        return senha != null && senha.trim().length() > 5 && senha.length() <= 20;
    }

    private boolean validaIdCli(int idCli) {
        return idCli > 0;
    }
    
    private boolean validaNumAgencia(String numAgencia) {
        return numAgencia != null && numAgencia.trim().length() > 0 && numAgencia.length() <= 5;
    }

    private boolean validaNumConta(String numConta) {
        return numConta != null && numConta.trim().length() > 0 && numConta.length() <= 10;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (!validaLogin(login)) {
            throw new IllegalArgumentException("Login inválido. Deve ter mais de 3 caracteres");
        }
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (!validaSenha(senha)) {
            throw new IllegalArgumentException("Senha inválida. Deve ter mais de 5 caracteres");
        }
        this.senha = senha;
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
    
    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        if (!validaNumAgencia(numAgencia)) {
            throw new IllegalArgumentException("Número da agência inválido");
        }
        this.numAgencia = numAgencia;
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

    public String getTableName() {
        return tableName;
    }

    public String dadosSQLValues() {
        return "'"
            + this.getIdCli() + "'"
            + this.getSenha() + "', '"
            + this.getNumAgencia() + "', '"
            + this.getNumConta() + "'";
    }
}