/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach2;

/**
 *
 * @author Aluno
 */
public class inter3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Trocar os valores para zero
        for (int i = 0;i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;

            }
        }
        System.out.print("Array apos trocar os valores impares por zero: ");
        for (int num : array) {
            System.out.print("" + num);
        }
    }
}
