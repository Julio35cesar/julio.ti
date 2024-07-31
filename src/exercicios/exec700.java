/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author TI
 */
public class exec700 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 2, 5, 6, 7, 8, 6, 9};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int cont = 0;
                //cont++;
                if (j == j + cont++) {
                    //int temp = A[j];
                    //A[j] = A[j + cont++];
                    //A[j + cont] = temp; 
                }
            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(A[j]);
        }
    }
}
