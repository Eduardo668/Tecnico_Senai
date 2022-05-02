DROP TABLE IF EXISTS funcionario;
DROP TABLE IF EXISTS dependente;
DROP TABLE IF EXISTS departamento
DROP TABLE IF EXISTS projeto;
DROP TABLE IF EXISTS funcionario_projeto

CREATE TABLE funcionario(
	id SERIAL,
	idDepartamento int,
	nome varchar (255) NOT NULL,
	cpf varchar(20) UNIQUE,
	endereco varchar(255),
	telefone varchar(30),
	salario float,
	
	PRIMARY KEY(id)
);

CREATE TABLE dependente(
	id SERIAL,
	idFuncionario int,
	nome varchar(255) NOT NULL,
	telefone varchar(30)
	
	PRIMARY KEY(id),
	FOREIGN KEY(idFuncionario) REFERENCES funcionario(id)

);

CREATE TABLE departamento(
	id SERIAL,
	idFuncionario int,
	nome varchar(255) NOT NULL,
	localizacao varchar(255)
	
	PRIMARY KEY (id),
	FOREIGN KEY (idFuncionario) REFERENCES funcionario(id)
); 

CREATE TABLE projeto(
    id serial,
	iddepartamento int,
    nome varchar(150) NOT NULL,
    orcamento float,
   
    PRIMARY KEY (id),
    FOREIGN KEY (iddepartamento)REFERENCES departamento (id)
);

ALTER TABLE funcionario
ADD iddepartamento int,
ADD FOREIGN KEY (iddepartamento) REFERENCES departamento(id);

CREATE TABLE funcionario_projeto(
    idfuncionario int,
    idprojeto int,
    PRIMARY KEY (idfuncionario, idprojeto),
    FOREIGN KEY (idfuncionario) REFERENCES funcionario(id),
    FOREIGN KEY (idprojeto) REFERENCES projeto(id)
);