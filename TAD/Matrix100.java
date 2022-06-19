/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.TAD;

/**
 *
 * @author 03569198200
 */
public class Matrix100 {

    int m[][] = new int[10][10];

    void setValue(int line, int colun, int data) {
        if (line < 0 || line >= 10 || colun < 0 || colun >= 10) {
            showError();
        } else {
            m[line][colun] = data;

        }

    }

    void showError() {
        System.out.println("Indice de Linha/Coluna informado não existe");

    }

    int getValue(int line,int colun) {
        return m[line][colun];
    }
}
