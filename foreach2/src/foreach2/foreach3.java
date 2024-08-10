/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach2;

/**
 *
 * @author Aluno
 */
public class foreach3 {
public static void main(String[] args) {
    int[]array = {5,8,2,10,3,299};
    int maior = 0; 
    
    for(int numero : array){
        if(numero > maior){
            maior = numero;
        }
    }
    System.out.println("O maior numero no array e: " + maior);
    
}    
}
