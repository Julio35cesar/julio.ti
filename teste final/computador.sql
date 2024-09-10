create database computador;

use computador;

CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE computadores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    processador VARCHAR(100) NOT NULL,
    memoria_ram INT NOT NULL, -- em GB
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

INSERT INTO usuarios (nome, email) VALUES ('Ana Costa', 'ana.costa@example.com');
INSERT INTO usuarios (nome, email) VALUES ('Bruno Almeida', 'bruno.almeida@example.com');
INSERT INTO usuarios (nome, email) VALUES ('Clara Martins', 'clara.martins@example.com');

INSERT INTO computadores (marca, modelo, processador, memoria_ram, usuario_id) VALUES ('Dell', 'Inspiron 15', 'Intel Core i5', 8, 1);
INSERT INTO computadores (marca, modelo, processador, memoria_ram, usuario_id) VALUES ('Dell', 'XPS 13', 'Intel Core i7', 16, 2);
INSERT INTO computadores (marca, modelo, processador, memoria_ram, usuario_id) VALUES ('Apple', 'MacBook Air', 'Apple M1', 8, 3);
INSERT INTO computadores (marca, modelo, processador, memoria_ram, usuario_id) VALUES ('Acer', 'Predator Helios 300', 'Intel Core i7', 16, 1);
INSERT INTO computadores (marca, modelo, processador, memoria_ram, usuario_id) VALUES ('Asus', 'ZenBook 14', 'AMD Ryzen 5', 2);

SELECT modelo, processador
FROM computadores;

SELECT u.nome, c.modelo
FROM usuarios u
JOIN computadores c ON u.id = c.usuario_id;

SELECT modelo, memoria_ram
FROM computadores
WHERE memoria_ram > 8;

SELECT DISTINCT u.nome
FROM usuarios u
JOIN computadores c ON u.id = c.usuario_id
WHERE c.marca = 'Dell';

SELECT marca, COUNT(*) AS quantidade
FROM computadores
GROUP BY marca;

SELECT marca
FROM computadores
GROUP BY marca
HAVING COUNT(*) < 3;

UPDATE computadores
SET processador = 'Intel Core i7'
WHERE id = 2;

DELETE FROM computadores
WHERE id = 6;







