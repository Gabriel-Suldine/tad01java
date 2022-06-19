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
public class TestePessoa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "", telefone = "", Email = "";
        Pessoa p = new Pessoa();
        System.out.println("Digite seu nome: ");
        p.nome = entrada.nextLine();
        System.out.println("Digite seu Telefone: ");
        p.telefone = entrada.nextLine();
        System.out.println("Digite seu Email: ");
        p.email = entrada.nextLine();

        
        
        System.out.printf("Nome: %s\nTelefone: %s\nEmail: %s",p.nome,p.telefone,p.email);

    }

}
