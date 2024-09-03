CREATE DATABASE escola CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use escola;

CREATE TABLE alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    turma VARCHAR(10),
    email VARCHAR(100)
);

INSERT INTO alunos (nome, data_nascimento, turma, email)
VALUES ('João Silva', '2005-03-15', '8A', 'joao.silva@email.com');

CREATE TABLE professores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    disciplina VARCHAR(100),
    salario DECIMAL(10, 2)
);

INSERT INTO professores (nome, disciplina, salario)
VALUES 
    ('Ana Costa', 'Matemática', 3500.00),
    ('Pedro Oliveira', 'História', 3200.00);
    
    
    
    