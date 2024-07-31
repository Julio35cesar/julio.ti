/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author TI
 */
public class exec400 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 7, 5, 6, 3, 10, 8, 9};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > j + 1) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
