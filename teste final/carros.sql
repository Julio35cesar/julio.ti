create database carros;

use carros;

CREATE TABLE Proprietários (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE Carros (
    id INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    ano INT NOT NULL,
    proprietário_id INT,
    FOREIGN KEY (proprietário_id) REFERENCES Proprietários(id)
);

INSERT INTO Proprietários (nome) VALUES ('Ana');
INSERT INTO Proprietários (nome) VALUES ('Bruno');
INSERT INTO Proprietários (nome) VALUES ('Carlos');


INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES ('Toyota', 'Corolla', 2012, 1);
INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES ('Toyota', 'Hilux', 2015, 1);
INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES ('Honda', 'Civic', 2018, 2);
INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES ('Ford', 'Fiesta', 2009, 3);
INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES ('Toyota', 'Yaris', 2020, 2);
INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES ('Chevrolet', 'Onix', 2019, 3);
INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES ('Toyota', 'Camry', 2008, 3);
INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES ('Toyota', 'RAV4', 2021, 1);
INSERT INTO Carros (marca, modelo, ano, proprietário_id) VALUES('Honda', 'HR-V', 2017, 2);

select * from carros;

SELECT Proprietários.nome AS Proprietário, Carros.marca, Carros.modelo
FROM Proprietários
JOIN Carros ON Proprietários.id = Carros.proprietário_id;

SELECT marca, modelo, ano
FROM Carros
WHERE ano < 2010;

SELECT DISTINCT Proprietários.nome
FROM Proprietários
JOIN Carros ON Proprietários.id = Carros.proprietário_id
WHERE Carros.marca = 'Toyota';

SELECT marca, COUNT(*) AS quantidade
FROM Carros
GROUP BY marca;

SELECT marca
FROM Carros
GROUP BY marca
HAVING COUNT(*) > 5;

UPDATE Carros
SET ano = 2015
WHERE id = 3;

DELETE FROM Carros
WHERE id = 7;

