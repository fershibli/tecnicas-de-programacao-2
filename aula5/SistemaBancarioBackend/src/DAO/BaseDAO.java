/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author Alunos
 */
public interface BaseDAO {
    // gets table name
    public String getTableName();
    // gets all data from object in SQL format
    public String dadosSQLValues();
    // gets all data from object in SQL format to be used in an update statement
    public String alteraDadosSQLValues();
    // gets where statement in SQL format by ID
    public String termoSQLWhereById();
    // gets select order by statement in SQL format
    public String consultaSQLValues();
    // sets all data from List<String> to object
    public void importaSQLValues(List<String> dados);
}
