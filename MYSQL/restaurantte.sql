CREATE DATABASE restaurante CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE restaurante;

CREATE TABLE pratos (
    nome VARCHAR(100),
    descricao TEXT,
    preco DECIMAL(10, 2)
);

ALTER TABLE pratos
ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY FIRST;

DESCRIBE pratos;
