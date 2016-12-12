CREATE DATABASE cobaia;

\c cobaia;

CREATE TABLE produtos (
	codigo         INTEGER       NOT NULL PRIMARY KEY,
	descricao      VARCHAR(50)   NOT NULL,
	valor          DECIMAL(9, 2),
	prazo_validade DATE,
	disponivel     BOOLEAN,
	tipo           INTEGER,
	ativo          BOOLEAN DEFAULT true
);

/*
INSERT INTO produtos VALUES (
 99999, 'Panela Inox', 34.12, NULL, TRUE, 2
);
*/

-- DELETE FROM produtos 
-- WHERE codigo = ?










