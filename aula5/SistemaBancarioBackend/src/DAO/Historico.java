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
public class Historico implements BaseDAO {
    final String tableName = "HISTORICOS";
    private int id_his;
    private String historico;

    public Historico() {
        
    }

    public Historico(int id_his, String historico) {
        this.id_his = id_his;
        this.historico = historico;
    }

    private boolean validaId_his(int id_his) {
        return id_his > 0;
    }

    private boolean validaHistorico(String historico) {
        return historico != null && historico.trim().length() > 0 && historico.length() <= 30;
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

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        if (!validaHistorico(historico)) {
            throw new IllegalArgumentException("Histórico inválido");
        }
        this.historico = historico;
    }
    
    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public String dadosSQLValues() {
        return this.getId_his() + ", '"
            + this.getHistorico() + "'";
    }

    @Override
    public String alteraDadosSQLValues() {
        return "DES_HIS = '" + this.getHistorico()+"'";
    }
    
    @Override
    public String termoSQLWhereById() {
        return "ID_HIS = " + this.getId_his();
        
    }

    @Override
    public String consultaSQLValues() {
        return "ID_HIS, DES_HIS";
    }

    @Override
    public void importaSQLValues(List<String> dados) {
        if (dados.size() != 2) {
            throw new IllegalArgumentException("Dados inválidos para importação");
        }
        this.setId_his(Integer.parseInt(dados.get(0)));
        this.setHistorico(dados.get(1));
    }
}