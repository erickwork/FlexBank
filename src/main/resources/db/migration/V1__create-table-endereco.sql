CREATE TABLE endereco (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        cep varchar(8) NOT NULL,
                        logradouro varchar(200) NOT NULL,
                        numero varchar(10) NOT NULL,
                        bairro varchar(100) NOT NULL,
                        localidade varchar(50) NOT NULL
);