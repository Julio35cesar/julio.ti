/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario_ori;

/**
 *
 * @author julio
 */
public class FuncionarioAssalariado implements Pagavel {
    private String nome;
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public String toString() {
        return "Funcionário Assalariado: " + nome + ", Pagamento: " + calcularPagamento();
    }
}

