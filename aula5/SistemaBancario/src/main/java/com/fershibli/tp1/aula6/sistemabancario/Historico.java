/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fershibli.tp1.aula6.sistemabancario;

/**
 *
 * @author Alunos
 */
public class Historico {
    private String tableName = "historicos";
    private int id_his;
    private String historico;

    public Historico(int id_his, String historico) {
        this.id_his = id_his;
        this.historico = historico;
    }

    public int getId_his() {
        return id_his;
    }

    public void setId_his(int id_his) {
        this.id_his = id_his;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
}
