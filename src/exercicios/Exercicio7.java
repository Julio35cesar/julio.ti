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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n;
        double dob;
        double ter;
        System.out.print("Digite um numero: ");
        n = teclado.nextDouble();
        dob = n * 2;
        ter = n / 3;
        System.out.println("O dobro de " + n + " e " + dob + " e a terca parte e " + ter);
    }
    
}
