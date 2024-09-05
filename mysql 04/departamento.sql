create database departament;

use departament;

CREATE TABLE departamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_departamento VARCHAR(100)
);

CREATE TABLE funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    departamento_id INT,
    FOREIGN KEY (departamento_id) REFERENCES departamentos(id)
);

INSERT INTO departamentos (nome_departamento) VALUES 
('Recursos Humanos'),
('Financeiro');

INSERT INTO funcionarios (nome, departamento_id) VALUES 
('mica', 999);


