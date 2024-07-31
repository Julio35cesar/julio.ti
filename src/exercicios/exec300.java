/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class exec300 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 10: ");
        boolean elementoEncontrado = false;
        int B = teclado.nextInt();
        int cont = 0;
        int[] A = {1, 22, 34, 42, 5, 76, 73, 58, 89, 100};
        for (int i : A) {
            cont++;
            if (i == B) {
                elementoEncontrado = true;
                System.out.printf("Elemento encontrado!\n" + "Na posicao: " + cont + "\n");
                break;
            }
        }
        if (elementoEncontrado == false) {
            System.out.println("Elemento nao encontrado!");
        }
    }
}
