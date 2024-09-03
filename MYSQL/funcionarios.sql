CREATE DATABASE empresa CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use empresa;

CREATE TABLE funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    cargo VARCHAR(100),
    salario DECIMAL(10, 2),
    data_admissao DATE
);

INSERT INTO funcionarios (nome, cargo, salario, data_admissao)
VALUES ('Carlos Pereira', 'Desenvolvedor', 5000.00, '2024-09-01');