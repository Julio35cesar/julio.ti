   create database empresa2;
   
   use empresa2;
   
   create table funcionarios (
   id int auto_increment primary key,
   nome varchar(100),
   cargo varchar(50),
   salario decimal(10, 2),
   data_contratacao date
   );
   
   INSERT INTO funcionarios (nome, salario) VALUES 
('Ana Silva', 3500.00),
('João Santos', 4500.00),
('Maria Oliveira', 2900.00),
('Pedro Souza', 5000.00),
('Carlos Lima', 5200.00);

   
   select * from funcionarios
   where salario between 3000 and 5000;
   