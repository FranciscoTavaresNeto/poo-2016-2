--banco de endereço
CREATE DATABASE cepfinder;
CREATE TABLE enderecos(
	cep VARCHAR(8) PRIMARY KEY,
	logradouro VARCHAR(100),
	bairro VARCHAR(100),
	localidade VARCHAR(100),
	UF VARCHAR(2)
);

INSERT INTO enderecos VALUES (
'96200020',
'Duque de Caxias',
'Centro',
'Rio Grande',
'Rs'
);


