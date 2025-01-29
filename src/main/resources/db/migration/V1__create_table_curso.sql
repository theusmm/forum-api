CREATE TABLE curso(
    id bigint NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO curso VALUES (1, 'Kotlin', 'Programacao');
INSERT INTO curso VALUES (2, 'HTML', 'Front-end');