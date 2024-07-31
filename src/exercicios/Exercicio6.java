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
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int ant;
        int suc;
        System.out.print("Digite um numero inteiro: ");
        n = teclado.nextInt();
        ant = n - 1;
        suc = n +1;
        System.out.println("O Antecessor de " + n + " e " + ant + " e o sucessor e " + suc);
    }
    
}
