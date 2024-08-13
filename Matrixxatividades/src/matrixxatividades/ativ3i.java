/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixxatividades;

/**
 *
 * @author julio
 */
public class ativ3i {
    public static void main(String[] args) {
        // Definindo duas matrizes 2x2
        int[][] matrizA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrizB = {
            {5, 6},
            {7, 8}
        };

        // Calculando o produto das matrizes
        int[][] produto = multiplicarMatrizes(matrizA, matrizB);

        // Exibindo o resultado
        System.out.println("Produto das Matrizes:");
        exibirMatriz(produto);
    }

    // Método para multiplicar duas matrizes 2x2
    public static int[][] multiplicarMatrizes(int[][] a, int[][] b) {
        int[][] resultado = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return resultado;
    }

    // Método para exibir uma matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
  

