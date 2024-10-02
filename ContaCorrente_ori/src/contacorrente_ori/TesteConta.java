/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contacorrente_ori;

import contacorrente_ori.ContaCorrente_ori.ContaCorrente;

/**
 *
 * @author julio
 */
public class TesteConta {
    public static void main(String[] args) {
        // Criação de uma nova conta corrente para o titular "João"
        ContaCorrente contaJoao = new ContaCorrente("João");

        // Exibindo o saldo inicial
        System.out.println("Saldo inicial de " + contaJoao.getTitular() + ": R$ " + contaJoao.getSaldo());

        // Realizando um depósito
        contaJoao.depositar(500.00);
        System.out.println("Saldo após depósito: R$ " + contaJoao.getSaldo());

        // Realizando um saque
        contaJoao.sacar(200.00);
        System.out.println("Saldo após saque: R$ " + contaJoao.getSaldo());

        // Tentativa de saque com valor maior que o saldo
        contaJoao.sacar(400.00);
        System.out.println("Saldo após tentativa de saque excedente: R$ " + contaJoao.getSaldo());

        // Tentativa de depósito com valor inválido
        contaJoao.depositar(-50.00);
    }
}
