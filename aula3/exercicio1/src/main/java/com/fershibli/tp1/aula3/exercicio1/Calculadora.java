/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fershibli.tp1.aula3.exercicio1;

/**
 *
 * @author FerShibli
 */
public class Calculadora {

    public Calculadora(int numero1, int numero2, String operacao) {
        int resultado;
        switch (operacao) {
            case "+":
                resultado = this.Somar(numero1, numero2);
                this.PrintResultado(operacao, resultado, numero1, numero2);
                break;
            case "-":
                resultado = this.Subtrair(numero1, numero2);
                this.PrintResultado(operacao, resultado, numero1, numero2);
                break;
            case "*":
                resultado = this.Multiplicar(numero1, numero2);
                this.PrintResultado(operacao, resultado, numero1, numero2);
                break;
            case "/":
                resultado = this.Dividir(numero1, numero2);
                this.PrintResultado(operacao, resultado, numero1, numero2);
                break;
            default:
                System.out.println("Operacao invalida");
        }
    }
    
    private String GetNomeOperacao(String operacao){
        switch (operacao) {
            case "+":
                return "soma";
            case "-":
                return "divisao";
            case "*":
                return "multiplicacao";
            case "/":
                return "divisao";
            default:
                return "operacao invalida";
        }
    }
    
    private void PrintResultado(String operacao, int resultado, int... numeros) {
        String nomeOperacao = this.GetNomeOperacao(operacao);
        System.out.printf("A %s de ", nomeOperacao);
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.printf(" %s ", operacao);
            }
        }
        System.out.printf(" = %d", resultado);
    }
    
    private int Somar(int... numeros) {
        int resultado = 0;
        for (int numero : numeros){
            resultado += numero;
        }
        return resultado;
    }
    
    private int Subtrair(int numeroInicial, int... numeros) {
        int resultado = numeroInicial;
        for (int numero: numeros){
            resultado -= numero;
        }
        return resultado;
    }
    
    private int Multiplicar(int... numeros) {
        int resultado = 1;
        for (int numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }
    
    private int Dividir(int numeroInicial, int... numeros) {
        int resultado = numeroInicial;
        for (int numero: numeros){
            resultado /= numero;
        }
        return resultado;
    }
    
}
