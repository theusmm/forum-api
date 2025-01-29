CREATE TABLE topico(
    id bigint NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(50) NOT NULL,
    mensagem VARCHAR(300) NOT NULL,
    data_criacao datetime NOT NULL,
    status varchar(20) NOT NULL,
    curso_id bigint NOT NULL,
    autor_id bigint NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(curso_id) REFERENCES curso(id),
    FOREIGN KEY(autor_id) REFERENCES usuario(id)
);