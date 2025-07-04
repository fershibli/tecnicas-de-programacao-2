/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package DAO;
 
 
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;
 
/**
*
 * @author Alunos
*/
public class connectDAO {
    
    Connection conn;
    
    public Connection connectDB(){
        System.out.println( "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;"
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            conn = DriverManager.getConnection(caminho, usuario, senha);
            System.out.println( "Conectado com sucesso!");
        } catch (SQLException erro) {
            System.out.println( "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            System.out.println( "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            System.out.println( "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return conn;
        // conn.close();
    }
    
    /*
    * Rotina para inserir um registro novo no banco de dados
    */
    public void insereRegistroJFBD(BaseDAO obj) {
        String tabela = obj.getTableName();
        String strDados = obj.dadosSQLValues();
        conn = connectDB();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO dbo."+tabela+" VALUES ("+strDados+")";
            System.out.println( "String de insert: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                System.out.println( "Inclusão executada com sucesso!");
            } catch (SQLException erro) {
                System.out.println( "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                System.out.println( "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                System.out.println( "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public void alteraRegistroJFBD(BaseDAO obj) {
        String tabela = obj.getTableName();
        String strDados = obj.alteraDadosSQLValues();
        String condicao = obj.termoSQLWhereById();
        conn = connectDB();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            String sql = "UPDATE dbo."+tabela+" SET "+strDados+" WHERE "+condicao;
            System.out.println( "String de update: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                System.out.println( "Alteração executada com sucesso!");
            } catch (SQLException erro) {
                System.out.println( "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                System.out.println( "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                System.out.println( "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public void excluiRegistroJFBD(BaseDAO obj) {
        String tabela = obj.getTableName();
        String condicao = obj.termoSQLWhereById();
        conn = connectDB();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            String sql = "DELETE FROM dbo."+tabela+" WHERE "+condicao;
            System.out.println( "String de delete: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                System.out.println( "Exclusão executada com sucesso!");
            } catch (SQLException erro) {
                System.out.println( "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                System.out.println( "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                System.out.println( "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public List<String> consultaRegistroJFBD(BaseDAO obj) {
        String tabela = obj.getTableName();
        String campos = obj.consultaSQLValues();
        String condicao = obj.termoSQLWhereById();
        conn = connectDB();
        Statement stmt;
        ResultSet dados;
        List<String> lista = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            
            String sql;
            sql = "SELECT "+campos+" FROM dbo."+tabela+" WHERE "+condicao;
            System.out.println( "String de select: "+sql);
            
            try {
                dados = stmt.executeQuery(sql);
                
                if (!dados.next()) {
                    System.out.println( "Registro não encontrado!");
                }

                int columnCount = dados.getMetaData().getColumnCount();
                for (int index = 1; index <= columnCount; index++) {
                    lista.add(dados.getString(index));
                }
            } catch (SQLException erro) {
                System.out.println( "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                System.out.println( "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                System.out.println( "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
        return lista;
    }
    
    public ResultSet consultaTodoRegistroJFBD(BaseDAO obj) {
        String tabela = obj.getTableName();
        String campos = obj.consultaSQLValues();
        conn = connectDB();
        Statement stmt;
        ResultSet dados;
        try {
            stmt = conn.createStatement();
            
            String sql = "SELECT "+campos+" FROM dbo."+tabela;
            System.out.println(sql);
            System.out.println( "String de select: "+sql);
            
            try {
                dados = stmt.executeQuery(sql);
                return dados;
                
            } catch (SQLException erro) {
                System.out.println( "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                System.out.println( "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                System.out.println( "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
        return null;
    }
}

