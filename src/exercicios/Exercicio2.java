/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Bem-vindo a empresa " + nome + ", e um prazer lhe conhecer!");
    }
    
}
