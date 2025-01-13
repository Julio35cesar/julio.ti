CREATE DATABASE corrida_gamess;

USE corrida_gamess;

CREATE TABLE apostas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_jogador VARCHAR(100) NOT NULL,
    aposta_carro INT NOT NULL,
    data_aposta TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE resultados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    vencedor INT NOT NULL,
    data_corrida TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

SELECT * FROM apostas;


GRANT ALL PRIVILEGES ON corrida_gamess.* TO 'root'@'localhost';
FLUSH PRIVILEGES;
