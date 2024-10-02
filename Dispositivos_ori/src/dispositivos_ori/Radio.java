/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos_ori;

/**
 *
 * @author julio
 */
public class Radio implements DispositivoEletronico {
    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Rádio ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Rádio desligado.");
    }

    @Override
    public String obterStatus() {
        return ligado ? "Rádio está ligado." : "Rádio está desligado.";
    }
}
