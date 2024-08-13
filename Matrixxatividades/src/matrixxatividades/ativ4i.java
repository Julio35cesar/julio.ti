/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixxatividades;

/**
 *
 * @author julio
 */
public class ativ4i {
    public static void main(String[] args) {
        // Definindo duas matrizes 3x3
        int[][] matrizA = {
            {5, 8, 7},
            {4, 6, 2},
            {9, 3, 1}
        };

        int[][] matrizB = {
            {2, 3, 1},
            {1, 2, 3},
            {4, 1, 5}
        };

        // Calculando a subtração das matrizes
        int[][] resultado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        // Exibindo o resultado
        System.out.println("Resultado da Subtração das Matrizes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}


