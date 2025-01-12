/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package corridagame;

/**
 *
 * @author julio
 */
import java.sql.*;

public class DatabaseManager {

    private static final String URL = "jdbc:mysql://localhost:3307/corrida_gamess";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void salvarAposta(String nomeJogador, int carroEscolhido) {
        String sql = "INSERT INTO apostas (nome_jogador, aposta_carro) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeJogador);
            stmt.setInt(2, carroEscolhido);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void salvarResultado(int vencedor) {
        String sql = "INSERT INTO resultados (vencedor) VALUES (?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, vencedor);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getApostas() {
        String sql = "SELECT * FROM apostas";
        StringBuilder apostas = new StringBuilder();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String nomeJogador = rs.getString("nome_jogador");
                int apostaCarro = rs.getInt("aposta_carro");
                apostas.append("Jogador: ").append(nomeJogador)
                        .append(" - Apostou no Carro: ").append(apostaCarro)
                        .append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return apostas.toString();
    }
}
