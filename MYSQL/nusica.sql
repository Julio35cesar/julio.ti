CREATE DATABASE musica CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use musica;

CREATE TABLE albuns (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    artista VARCHAR(100),
    ano_lancamento YEAR,
    genero VARCHAR(50)
);

INSERT INTO albuns (nome, artista, ano_lancamento, genero)
VALUES 
    ('Thriller', 'Michael Jackson', 1982, 'Pop'),
    ('Back in Black', 'AC/DC', 1980, 'Rock');
    
    show tables;
    DESCRIBE albuns;
    SELECT * FROM albuns;
    