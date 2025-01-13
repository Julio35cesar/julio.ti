/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package corridagame;

/**
 *
 * @author julio
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Classe responsável por gerenciar a conexão com o banco de dados e realizar operações
public class DatabaseManager {

    // Dados da conexão com o banco
    private static final String URL = "jdbc:mysql://localhost:3306/corrida_gamess";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; 

    // Método para obter uma conexão com o banco
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para salvar uma aposta no banco de dados
    public static void salvarAposta(String nomeJogador, int apostaCarro) {
        String sql = "INSERT INTO apostas (nome_jogador, aposta_carro) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeJogador);
            stmt.setInt(2, apostaCarro);
            stmt.executeUpdate();
            System.out.println("Aposta salva com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar a aposta.");
        }
    }

    // Método para salvar o resultado de uma corrida
    public static void salvarResultado(int vencedor) {
        String sql = "INSERT INTO resultados (vencedor) VALUES (?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, vencedor);
            stmt.executeUpdate();
            System.out.println("Resultado salvo com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar o resultado.");
        }
    }

    // Método para obter apostas do banco de dados
    public static String getApostas() {
        StringBuilder apostas = new StringBuilder("Apostas registradas:\n");
        String sql = "SELECT nome_jogador, aposta_carro, data_aposta FROM apostas ORDER BY data_aposta DESC";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nomeJogador = rs.getString("nome_jogador");
                int apostaCarro = rs.getInt("aposta_carro");
                String dataAposta = rs.getString("data_aposta");
                apostas.append(String.format("Jogador: %s | Carro: %d | Data: %s\n", nomeJogador, apostaCarro, dataAposta));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao buscar apostas.";
        }

        return apostas.toString();
    }
}
