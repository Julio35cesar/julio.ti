create database carros;

use carros;

create table carro (
id int auto_increment primary key,
nome_carro varchar(100),
modelo varchar(100)
);

INSERT INTO carro (nome_carro, modelo) VALUES 
('Honda Civic Si ', 'Civic'),
('Toyota Corolla ', 'Corolla'),
('Honda Accord', 'Accord'),
('Toyota Yaris', 'Yaris'),
('Honda Civic LX', 'Civic');

select * from carro
where modelo like '%Civic%' or modelo like '%Corolla%';