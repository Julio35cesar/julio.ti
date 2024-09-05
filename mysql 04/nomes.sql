create database nomes;

use nomes;

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
('Carlos'),
('Brenda'),
('Carla');

INSERT INTO posts (titulo, conteudo, usuario_id) VALUES 
('Post de Carlos', 'Conteúdo do post 1', 1),
('Outro Post de Carlos', 'Conteúdo do post 2', 1),
('Post de Brenda', 'Conteúdo do post 1', 2);

SELECT usuarios.nome_usuario, COUNT(posts.id) AS numero_de_posts
FROM usuarios
LEFT JOIN posts ON usuarios.id = posts.usuario_id
GROUP BY usuarios.id, usuarios.nome_usuario;

