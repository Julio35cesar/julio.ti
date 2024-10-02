/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario_ori;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class TestePagavel {
    public static void main(String[] args) {
        // Criação de funcionários
        Pagavel funcionarioHorista = new FuncionarioHorista("João", 160, 20);
        Pagavel funcionarioAssalariado = new FuncionarioAssalariado("Ana", 3000);

        // Lista de funcionários para demonstrar o polimorfismo
        List<Pagavel> funcionarios = new ArrayList<>();
        funcionarios.add(funcionarioHorista);
        funcionarios.add(funcionarioAssalariado);

        // Exibindo o pagamento de cada funcionário
        System.out.println("Pagamentos dos funcionários:");
        for (Pagavel funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}