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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1;
        double n2;
        double media;
        System.out.print("Primeira nota: ");
        n1 = teclado.nextDouble();
        System.out.print("Segunda nota: ");
        n2 = teclado.nextDouble();
        media = n1 + n2 / 2;
        System.out.println("A media do aluno e de " + media);
    }
    
}
