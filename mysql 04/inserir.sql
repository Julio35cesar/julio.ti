create database inserir;

use inserir;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_usuario VARCHAR(100)
);

CREATE TABLE posts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    conteudo TEXT,
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

INSERT INTO usuarios (nome_usuario) VALUES 
('Alice '),
('Bruno ');

INSERT INTO posts (titulo, conteudo, usuario_id) VALUES 
('Novo Post', 'Conteúdo do post', 999);
