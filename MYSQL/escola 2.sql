USE escola;

UPDATE alunos
SET turma = '9A'
WHERE id = 3;

DELETE FROM alunos
WHERE turma = '8B';

DELETE FROM alunos;

UPDATE alunos
SET email = 'joaosilva@novoemail.com'
WHERE nome = 'João Silva';

DELETE FROM alunos
WHERE id = 5;

UPDATE alunos
SET data_nascimento = DATE_SUB(data_nascimento, INTERVAL 1 YEAR);

DELETE FROM alunos
WHERE email IS NULL OR email = '';

CREATE TABLE professores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    disciplina VARCHAR(100),
    salario DECIMAL(10, 2)
);

INSERT INTO professores (nome, disciplina, salario)
VALUES 
    ('Ana Costa', 'Matemática', 3500.00),
    ('Pedro Oliveira', 'História', 3200.00),
    ('Maria Silva', 'Física', 4000.00),
    ('Carlos Pereira', 'Biologia', 3800.00);
    
    -- Assumindo que os dois primeiros professores têm IDs 1 e 2
UPDATE professores
SET salario = salario * 1.10
WHERE id IN (1, 2);

DELETE FROM professores
WHERE id BETWEEN 1 AND 3;

DELETE FROM professores
WHERE id BETWEEN 1 AND 3;

-- Selecionando a tabela correta (exemplo se a tabela é 'funcionarios')
USE escola;

UPDATE funcionarios
SET cargo = 'Gerente'
WHERE salario > 5000
LIMIT 2;

SELECT *
FROM professores
WHERE id BETWEEN 1 AND 3;

SELECT id, nome, cargo, salario
FROM funcionarios
WHERE salario > 5000;
