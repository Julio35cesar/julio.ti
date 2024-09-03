CREATE DATABASE livraria CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use livraria;

CREATE TABLE livros (
    titulo VARCHAR(255),
    autor VARCHAR(100),
    ano_publicacao YEAR
);

ALTER TABLE livros
ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY FIRST;

ALTER TABLE livros
ADD COLUMN estoque INT DEFAULT 0 AFTER ano_publicacao;

INSERT INTO livros (titulo, autor, ano_publicacao, estoque)
VALUES 
    ('Livro A', 'Autor A', 2021, 10),
    ('Livro B', 'Autor B', 2020, 5),
    ('Livro C', 'Autor C', 2022, 15);
    
    DROP TABLE IF EXISTS livros;
    