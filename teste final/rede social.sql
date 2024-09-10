CREATE DATABASE redes_sociais;
USE redes_sociais;

CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE posts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    conteudo TEXT NOT NULL,
    data_publicacao DATE NOT NULL,
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE comentarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    conteudo TEXT NOT NULL,
    data_publicacao DATE NOT NULL,
    post_id INT,
    usuario_id INT,
    FOREIGN KEY (post_id) REFERENCES posts(id),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

INSERT INTO usuarios (nome, email) VALUES ('Ana Costa', 'ana.costa@example.com');
INSERT INTO usuarios (nome, email) VALUES ('Bruno Almeida', 'bruno.almeida@example.com');
INSERT INTO usuarios (nome, email) VALUES ('Clara Martins', 'clara.martins@example.com');

INSERT INTO posts (conteudo, data_publicacao, usuario_id) VALUES ('Meu primeiro post!', '2024-01-01', 1);
INSERT INTO posts (conteudo, data_publicacao, usuario_id) VALUES ('Estou aprendendo SQL!', '2024-02-01', 2);
INSERT INTO posts (conteudo, data_publicacao, usuario_id) VALUES ('O que é SQL?', '2024-03-01', 3);

INSERT INTO comentarios (conteudo, data_publicacao, post_id, usuario_id) VALUES ('Muito bom!', '2024-01-02', 1, 2);
INSERT INTO comentarios (conteudo, data_publicacao, post_id, usuario_id) VALUES ('Que legal!', '2024-02-05', 2, 3);
INSERT INTO comentarios (conteudo, data_publicacao, post_id, usuario_id) VALUES ('SQL é uma linguagem poderosa.', '2024-03-10', 3, 1);

SELECT nome, email
FROM usuarios;

UPDATE posts
SET conteudo = 'Novo conteúdo do post'
WHERE id = 1;

DELETE FROM comentarios
WHERE post_id = 1;




