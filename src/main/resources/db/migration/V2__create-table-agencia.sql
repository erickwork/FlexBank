CREATE TABLE agencia (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        numero_agencia varchar(10) NOT NULL,
                        id_endereco BIGINT NOT NULL,
                        FOREIGN KEY (id_endereco) REFERENCES endereco(id)
);