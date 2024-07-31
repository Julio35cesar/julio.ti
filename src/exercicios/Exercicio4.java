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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        int soma;
        System.out.print("Digite um numero inteiro: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        n2 = teclado.nextInt();
        soma = n1 + n2;
        System.out.println("A soma desses numeros e: " + soma);
    }
    
}
