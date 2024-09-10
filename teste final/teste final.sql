create database empresa;

use empresa;

create table funcionarios (
id int auto_increment primary key,
nome varchar(100),
cargo varchar(100),
salario decimal(10, 2),
departamento_id varchar(100)
);

create table deparmentos (
id int auto_increment primary key,
nome varchar(100)
);

insert into deparmentos (nome) values
('TI'),
('Vendas'),
('Marketing');

insert into funcionarios (nome, salario, departamento_id, cargos )  values
('Julio', 5900.00, 'TI', 'Analista de sistema'),
('Julia', 5100.00, 'Vendas', 'estoque'),
('Pedro', 3000.00, 'Marketing', 'rede sociais'),
('Joeliton', 4999.00, 'TI', 'rede' ),
('Rodrigo', 6000.00, 'TI', 'banco de dados' ),
('Luiz', 2000.00, 'vendas', 'javali'),
('Juliana', 5900.00, 'TI', 'java'),
('Juliano', 5100.00, 'Vendas', 'cemercios'),
('Pedra', 3000.00, 'Marketing'),
('Joel', 4999.00, 'TI'),
('mateus', 6000.00, 'TI'),
('carlos', 2000.00, 'vendas');

  select * from funcionarios
   where departamento_id like '%Marketing%' or  departamento_id like 'TI';
   
    select * from funcionarios
   where salario between 5000 and 6010;
   
     select * from funcionarios;
   
select avg(salario) from funcionarios;
   
   
   