/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach2;

/**
 *
 * @author Aluno
 */
public class foreach4 {
public static void main(String[] args) {
    double[] notas = {1.5, 2.5, 3.5, 4.5, 5.5};
    double soma = 0;
    
    for(double nota : notas){
        soma += nota;
        
    }
    double media = soma/notas.length;
    System.out.println("A media das notas e: " + media);
    
}    
}
