/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos_ori;

/**
 *
 * @author julio
 */
public class Televisao implements DispositivoEletronico {
    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Televisão ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Televisão desligada.");
    }

    @Override
    public String obterStatus() {
        return ligado ? "Televisão está ligada." : "Televisão está desligada.";
    }
}
