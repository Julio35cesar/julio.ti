create database setores;

use setores;

create table departamentos(
id int auto_increment primary key,
nome_departamentos varchar(100)
);

create table funcionarios (
id int auto_increment primary key,
nome varchar(100),
departamento_id int,
foreign key (departamento_id) references departamentos(id)
);

INSERT INTO departamentos (nome_departamentos) VALUES 
('Recursos Humanos'),
('Financeiro'),
('TI'),
('Marketing');

INSERT INTO funcionarios (nome, departamento_id) VALUES 
('Julio cesar', 1),
('Pedroba', 2),
('Guarana', 3),
('Enzo', 3),
('Gustavo lima', 4);

SELECT funcionarios.nome AS nome_funcionario, departamentos.nome_departamentos
FROM funcionarios
JOIN departamentos ON funcionarios.departamento_id = departamentos.id;
