/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.TAD;

import java.util.Scanner;

/**
 *
 * @author 03569198200
 */
public class TesteFracao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fracao fracao = new Fracao();
        fracao.numerador = in.nextInt();
        fracao.divisor = in.nextInt();
        System.out.printf("Resuldtado %.2f \n", fracao.getResultado());

    }

}
