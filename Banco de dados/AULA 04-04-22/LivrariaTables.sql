DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS livro;
DROP TABLE IF EXISTS funcionario;
DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS editora;

CREATE TABLE usuario(
	id Serial,
	idLivro int,
	cpf varchar(255) UNIQUE,
	nome varchar(255) NOT NULL,
	endereco varchar(255),
	telefone varchar(255),
	
	PRIMARY KEY(id)
);

CREATE TABLE livro(
	id SERIAL,
	idUsuario int,
	idEditora int,	
	idAutor int,
	titulo varchar(255) NOT NULL,
	genero varchar(255),
	edicao smallint,
	ano_publicacao Date,
	
	PRIMARY KEY(id),
	FOREIGN KEY (idUsuario) REFERENCES usuario(id)
);

CREATE TABLE funcionario(
	id SERIAL,
	idUsuario int,
	idLivro int,
	nome varchar(255) NOT NULL,
	endereco varchar(255),
	telefone varchar(255),
	salario Real,
	funcao varchar(255),
	
	PRIMARY KEY(id),
	FOREIGN KEY(idUsuario) REFERENCES usuario(id),
	FOREIGN KEY (idLivro) REFERENCES livro(id)
);

CREATE TABLE autor(
	id SERIAL,
	idLivro int,
	nome varchar(255) NOT NULL,
	nacionalidade varchar(255),
	
	PRIMARY KEY(id),
	FOREIGN KEY(idLivro) REFERENCES livro(id)
);

CREATE TABLE editora(
	id SERIAL,
	idLivro int,
	nome varchar(255) NOT NULL,
	endereco varchar(255),
	contato varchar(255),
	
	PRIMARY KEY(id),
	FOREIGN KEY(idLivro) REFERENCES livro(id)
);

ALTER TABLE livro
ADD FOREIGN KEY (idEditora) REFERENCES editora(id);

ALTER TABLE livro
ADD FOREIGN KEY (idAutor) REFERENCES autor(id);

ALTER TABLE usuario
ADD FOREIGN KEY (idLivro)REFERENCES livro(id);

