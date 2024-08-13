/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixxatividades;

/**
 *
 * @author julio
 */
public class atv2 {
   


    public static void main(String[] args) {
        // Definição de uma matriz 3x3 para teste
        int[][] matriz = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        // Verifica se a matriz é uma matriz identidade
        if (isMatrizIdentidade(matriz)) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz NÃO é uma matriz identidade.");
        }
    }

    // Método que verifica se a matriz é uma matriz identidade
    public static boolean isMatrizIdentidade(int[][] matriz) {
        // Verifica se a matriz tem tamanho 3x3
        if (matriz.length != 3) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (matriz[i].length != 3) {
                return false;
            }
        }

        // Verifica a condição da matriz identidade
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    // Elementos da diagonal principal devem ser 1
                    if (matriz[i][j] != 1) {
                        return false;
                    }
                } else {
                    // Elementos fora da diagonal principal devem ser 0
                    if (matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
