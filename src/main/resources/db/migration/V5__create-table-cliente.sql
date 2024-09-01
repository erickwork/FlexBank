CREATE TABLE cliente (
                        id BIGINT PRIMARY KEY NOT NULL,
                        score int NOT NULL,
                        id_gerente BIGINT NOT NULL,
                        data_criacao DATE NOT NULL,
                        FOREIGN KEY (id) REFERENCES pessoa(id),
                        FOREIGN KEY (id_gerente) REFERENCES gerente(id)
);