
CREATE TABLE produto (
                id_produto INT AUTO_INCREMENT NOT NULL,
                nome VARCHAR(50) NOT NULL,
                PRIMARY KEY (id_produto)
);

ALTER TABLE produto COMMENT 'Arqmazena os produtos do projeto.';


CREATE TABLE estado (
                id_estado INT AUTO_INCREMENT NOT NULL,
                estado VARCHAR(50) NOT NULL,
                uf VARCHAR(2) NOT NULL,
                PRIMARY KEY (id_estado)
);


CREATE TABLE cidade (
                id_cidade INT AUTO_INCREMENT NOT NULL,
                cidade VARCHAR(50) NOT NULL,
                id_estado INT NOT NULL,
                PRIMARY KEY (id_cidade)
);


CREATE TABLE cliente (
                id_cliente INT AUTO_INCREMENT NOT NULL,
                nome VARCHAR(50) NOT NULL,
                telefone VARCHAR(10),
                endereco VARCHAR(100),
                id_cidade INT NOT NULL,
                PRIMARY KEY (id_cliente)
);


ALTER TABLE cidade ADD CONSTRAINT estado_cidade_fk
FOREIGN KEY (id_estado)
REFERENCES estado (id_estado)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE cliente ADD CONSTRAINT cidade_cliente_fk
FOREIGN KEY (id_cidade)
REFERENCES cidade (id_cidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;