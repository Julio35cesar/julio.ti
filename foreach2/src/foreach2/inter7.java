/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach2;

/**
 *
 * @author Aluno
 */
public class inter7 {
  public static void main(String[] args) { 
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int count = 0;
    
    for(int num :array){
        if(num %2 == 0){
            count++;
        }
    }
      System.out.println("Quantidade de numeros pares: " + count);
      
      
  }
}
