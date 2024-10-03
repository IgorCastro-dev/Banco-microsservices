CREATE TABLE if not exists Customer (
                               customerid BIGINT AUTO_INCREMENT PRIMARY KEY,
                               account_number VARCHAR(255) NOT NULL UNIQUE,
                               cpf VARCHAR(11) NOT NULL UNIQUE,
                               full_name VARCHAR(100) NOT NULL,
                               enable BOOLEAN NOT NULL
                           );