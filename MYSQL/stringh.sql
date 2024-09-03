CREATE DATABASE streaming CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE streaming;

CREATE TABLE series (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) UNIQUE,
    genero VARCHAR(100),
    num_temporadas INT
);

INSERT INTO series (titulo, genero, num_temporadas)
VALUES 
    ('Stranger Things', 'Ficção Científica', 4),
    ('Breaking Bad', 'Drama', 5);
