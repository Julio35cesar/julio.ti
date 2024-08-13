/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixxatividades;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class ativ5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo uma matriz 3x3 de exemplo
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Solicitando o número escalar ao usuário
        System.out.print("Digite o número escalar para multiplicar a matriz: ");
        double escalar = scanner.nextDouble();

        // Multiplicando a matriz pelo número escalar
        int[][] matrizEscalar = multiplicarPorEscalar(matriz, escalar);

        // Exibindo a matriz original
        System.out.println("Matriz Original:");
        exibirMatriz(matriz);

        // Exibindo a matriz após multiplicação pelo escalar
        System.out.println("Matriz após multiplicação por " + escalar + ":");
        exibirMatriz(matrizEscalar);

        // Fechar o scanner
        scanner.close();
    }

    // Método para multiplicar todos os elementos da matriz por um escalar
    public static int[][] multiplicarPorEscalar(int[][] matriz, double escalar) {
        int tamanho = matriz.length; // Assume que a matriz é 3x3
        int[][] resultado = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                resultado[i][j] = (int) (matriz[i][j] * escalar); // Multiplicação e conversão para int
            }
        }

        return resultado;
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
