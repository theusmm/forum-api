CREATE TABLE usuario(
    id bigint NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO usuario VALUES (1, 'ana da silva', 'ana@email.com');