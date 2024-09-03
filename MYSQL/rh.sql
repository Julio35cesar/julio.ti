CREATE DATABASE rh CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use rh;

CREATE TABLE funcionarios (
    nome VARCHAR(100),
    cargo VARCHAR(100),
    salario DECIMAL(10, 2)
);

ALTER TABLE funcionarios
ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY FIRST;

INSERT INTO funcionarios (nome, cargo, salario)
VALUES ('Ana Lima', 'Analista de Sistemas', 4500.00);

ALTER TABLE funcionarios
CHANGE COLUMN salario remuneracao DECIMAL(10, 2);
