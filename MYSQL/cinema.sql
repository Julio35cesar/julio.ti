CREATE DATABASE cinema CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use cinema;

CREATE TABLE filmes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    diretor VARCHAR(100),
    genero VARCHAR(50),
    duracao INT,
    classificacao_etaria VARCHAR(10)
);


INSERT INTO filmes (titulo, diretor, genero, duracao, classificacao_etaria)
VALUES 
    ('A Inception', 'Christopher Nolan', 'Ficção Científica', 148, 'PG-13'),
    ('O Senhor dos Anéis: A Sociedade do Anel', 'Peter Jackson', 'Fantasia', 178, 'PG-13');