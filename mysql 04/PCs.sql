create database PCs;

use PCs;

CREATE TABLE computadores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_usuario VARCHAR(100),
    processador VARCHAR(50),
    memoria_ram INT
);

INSERT INTO computadores (nome_usuario, processador, memoria_ram) VALUES 
('Alice Costa', 'Intel Core i5', 16),
('Bruno Almeida', 'Intel Core i7', 8),
('Carla Mendes', 'Intel Core i5', 8),
('Diego Pereira', 'Intel Core i5', 12),
('Eva Souza', 'AMD Ryzen 5', 16);

select * from computadores
WHERE processador = 'Intel Core i5' AND memoria_ram > 8;


