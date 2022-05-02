CREATE TABLE aluno(
    id SERIAl,
    matricula varchar(100) NOT NULL,
    nome varchar(100) NOT NULL,
    cpf varchar(100) UNIQUE,
    endereco varchar(100),

    PRIMARY KEY(id)
);

CREATE TABLE turma(
    id SERIAl,
    idAlunos int ,
    ano_da_turma DATE,

    PRIMARY KEY(id),
    FOREIGN KEY (idAlunos) REFERENCES aluno(idAluno)

);

CREATE TABLE aula(
    id SERIAL,
    titulo varchar(100),
    descricao varchar(255),
    url varchar(255),
    PRIMARY KEY(id)

);

CREATE TABLE modulo(
    id SERIAL,
    idAula int

    PRIMARY KEY(id),
    FOREIGN KEY(idAula) REFERENCES aula(idAula)


);


CREATE TABLE curso(
    id SERIAL,
    nome varchar(100),
    idTurmas int,
    idModulos int,

    PRIMARY KEY(id),
    FOREIGN KEY(idTurmas) REFERENCES turma(idTurma),
    FOREIGN KEY(idModulos) REFERENCES modulo(idModulos)

);