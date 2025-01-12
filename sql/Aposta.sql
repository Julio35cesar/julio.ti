CREATE DATABASE corrida_game;
USE corrida_game;

CREATE TABLE apostas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    jogador VARCHAR(100),
    aposta VARCHAR(100),
    vencedor VARCHAR(100),
    data TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

Use corrida_game;
SELECT * FROM apostas;
DESCRIBE apostas;


