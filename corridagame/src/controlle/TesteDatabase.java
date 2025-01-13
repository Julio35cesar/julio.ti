/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlle;

import corridagame.DatabaseManager;

/**
 *
 * @author julio
 */
public class TesteDatabase {
    public static void main(String[] args) {
        String apostas = DatabaseManager.getApostas();
        System.out.println(apostas);
    }
}
