CREATE DATABASE ecommerce CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use ecommerce;

CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    preco DECIMAL(10, 2)
);

ALTER TABLE produtos
ADD COLUMN descricao TEXT AFTER nome;

INSERT INTO produtos (nome, descricao, preco)
VALUES ('Camiseta', 'Camiseta de algodão, tamanho M', 29.90);

ALTER TABLE produtos
DROP COLUMN descricao;

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100)
);

ALTER TABLE clientes
ADD COLUMN email VARCHAR(100) FIRST,
ADD COLUMN telefone VARCHAR(20) AFTER nome;

ALTER TABLE clientes
MODIFY COLUMN telefone VARCHAR(20) CHECK (telefone REGEXP '^[0-9]+$');

INSERT INTO clientes (nome, email, telefone)
VALUES 
    ('Maria Oliveira', 'maria.oliveira@email.com', '123456789'),
    ('José Santos', 'jose.santos@email.com', '987654321');
    
    RENAME TABLE clientes TO usuarios;


