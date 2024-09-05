create database loja_carros;

use loja_carros;

CREATE TABLE proprietarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_proprietario VARCHAR(100)
);

CREATE TABLE carros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(100),
    proprietario_id INT,
    FOREIGN KEY (proprietario_id) REFERENCES proprietarios(id)
);

INSERT INTO proprietarios (nome_proprietario) VALUES 
('Laura'),
('Bruno '),
('Carla ');

INSERT INTO carros (marca, proprietario_id) VALUES 
('Toyota', 1),
('Honda', 2);

SELECT proprietarios.nome_proprietario, carros.marca
FROM proprietarios
LEFT JOIN carros ON proprietarios.id = carros.proprietario_id;

