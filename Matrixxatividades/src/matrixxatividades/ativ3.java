/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixxatividades;

/**
 *
 * @author julio
 */
public class ativ3 {
    public static void main(String[] args) {
        // Definindo uma matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculando a matriz transposta
        int[][] transposta = calcularTransposta(matriz);

        // Exibindo a matriz original
        System.out.println("Matriz Original:");
        exibirMatriz(matriz);

        // Exibindo a matriz transposta
        System.out.println("Matriz Transposta:");
        exibirMatriz(transposta);
    }

    // Método para calcular a matriz transposta
    public static int[][] calcularTransposta(int[][] matriz) {
        int tamanho = matriz.length; // Assume que a matriz é quadrada (3x3)
        int[][] transposta = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    // Método para exibir uma matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


