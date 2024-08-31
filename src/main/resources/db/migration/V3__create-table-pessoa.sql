CREATE TABLE pessoa (
                         id BIGINT PRIMARY KEY,
                         nome varchar(200) NOT NULL,
                         cpf varchar(11) NOT NULL UNIQUE,
                         celular varchar(13) NOT NULL UNIQUE,
                         email varchar(100) NOT NULL UNIQUE,
                         id_endereco BIGINT (100) NOT NULL,
                         id_agencia BIGINT NOT NULL,
                         ativo boolean NOT NULL,
                         FOREIGN KEY (id_agencia) REFERENCES agencia(id),
                         FOREIGN KEY (id_endereco) REFERENCES endereco(id)
);