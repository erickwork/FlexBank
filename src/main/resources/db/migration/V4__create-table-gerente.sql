CREATE TABLE gerente (
                        id BIGINT PRIMARY KEY,
                        dataContratacao DATE NOT NULL,
                        FOREIGN KEY (id) REFERENCES pessoa(id)
);