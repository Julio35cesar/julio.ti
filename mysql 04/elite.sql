create database elite;

use elite;

CREATE TABLE proprietarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_proprietario VARCHAR(100)
);

CREATE TABLE celulares (
    id INT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(100),
    proprietario_id INT,
    FOREIGN KEY (proprietario_id) REFERENCES proprietarios(id)
);

INSERT INTO proprietarios (nome_proprietario) VALUES 
('zeca'),
('pedro');

INSERT INTO celulares (modelo, proprietario_id) VALUES 
('iPhone 13', 1),
('Samsung Galaxy S21', 2),
('Google Pixel 6', NULL);

SELECT celulares.modelo AS modelo_celular, proprietarios.nome_proprietario
FROM celulares
LEFT JOIN proprietarios ON celulares.proprietario_id = proprietarios.id;
