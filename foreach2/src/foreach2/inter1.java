/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach2;
import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public class inter1 {
     public static void main(String[] args) {
         int[] array = {5, 12, 8, 20, 7};
         int count = 0;
         
         for(int num : array){
             if(num > 10){
                count++; 
             }
         }
         System.out.println("Quantidade de elemntos maiores que 10: " + count);
     }
}
