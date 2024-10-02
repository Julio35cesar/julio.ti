/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contacorrente_ori;

/**
 *
 * @author julio
 */
public class ContaCorrente_ori {

    /**
     * @param args the command line arguments
     */
    
  public class ContaCorrente implements Conta {
    private double saldo;
    private String titular;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

        String getTitular() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    }
    

