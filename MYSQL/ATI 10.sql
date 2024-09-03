CREATE DATABASE bibliotecaa CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use bibliotecaa;

create table livro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    autor VARCHAR(255),
    ano_publicacao YEAR,
    disponivel BOOLEAN
);
use livros;

INSERT INTO livros (titulo, autor, ano_publicacao, disponivel)
VALUES 
    ('O HSobbit', 'J.R.R. Tolkien', 1937, TRUE),
    ('1984', 'George Orwell', 1949, FALSE),
    ('Dom Quixote', 'Miguel de Cervantes', 1605, FALSE);