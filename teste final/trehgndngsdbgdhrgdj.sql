create database celular;

use celular;

create table celulares (
id int auto_increment primary key,
marca varchar(100),
modelo varchar(100),
sistemas_operacional varchar(100),
proprietario_id int,
foreign key proprietario_id references celulares(id), -- ver essa linha depois 
primary key (id) 
)default charset = utf8mb4;


