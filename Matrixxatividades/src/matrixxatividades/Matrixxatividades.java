/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixxatividades;

/**
 *
 * @author julio
 */
public class Matrixxatividades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Definindo a matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Inicializando a variável soma
        int soma = 0;

        // Calculando a soma dos elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        // Exibindo o resultado
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}
    
    

