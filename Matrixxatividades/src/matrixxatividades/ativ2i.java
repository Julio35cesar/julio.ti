/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixxatividades;

/**
 *
 * @author julio
 */
public class ativ2i {
    public static void main(String[] args) {
        // Definindo uma matriz 4x4 de exemplo
        int[][] matriz = {
            {10, 22, 35, 47},
            {5, 67, 89, 12},
            {32, 45, 28, 66},
            {18, 24, 75, 39}
        };

        // Encontrando o maior e o menor elemento
        int[] resultado = encontrarMaiorMenor(matriz);

        // Exibindo o maior e o menor elemento
        System.out.println("O maior elemento é: " + resultado[0]);
        System.out.println("O menor elemento é: " + resultado[1]);
    }

    // Método para encontrar o maior e o menor elemento da matriz
    public static int[] encontrarMaiorMenor(int[][] matriz) {
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return new int[] { maior, menor };
    }
}


