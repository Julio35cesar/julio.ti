/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixxatividades;

/**
 *
 * @author julio
 */
public class ativ4 {
    public static void main(String[] args) {
        // Definindo uma matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculando a soma das diagonais
        int[] somas = calcularSomasDiagonais(matriz);

        // Exibindo as somas das diagonais
        System.out.println("Soma da diagonal principal: " + somas[0]);
        System.out.println("Soma da diagonal secundária: " + somas[1]);
    }

    // Método para calcular as somas das diagonais
    public static int[] calcularSomasDiagonais(int[][] matriz) {
        int tamanho = matriz.length; // Assume que a matriz é 3x3
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < tamanho; i++) {
            somaPrincipal += matriz[i][i]; // Soma dos elementos da diagonal principal
            somaSecundaria += matriz[i][tamanho - 1 - i]; // Soma dos elementos da diagonal secundária
        }

        // Retorna as somas em um array
        return new int[] { somaPrincipal, somaSecundaria };
    }
}


