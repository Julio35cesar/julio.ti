/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach2;

/**
 *
 * @author Aluno
 */
public class inter6 {
  public static void main(String[] args) {
      int[] array = {10, 5, 3, 12, 1};
      
      //Inicializa o menor numero com o primeiro elemento array
      int menorNumero = array[0];
      
      //Percorre o array para encontrar o menor numero
      for(int numero : array){
          if(numero < menorNumero){
              menorNumero = numero;
              
          }
      }
              System.out.println("O menor numero no array é:" + menorNumero);
 }   
}
