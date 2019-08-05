INSERT INTO USUARIO(nome, email, senha) VALUES('Maria', 'maria@email.com', '123456');
INSERT INTO USUARIO(nome, email, senha) VALUES('Clara', 'clara@email.com', '123456');

INSERT INTO LOCALIZACAO(regiao) VALUES ('ZONA SUL');
INSERT INTO LOCALIZACAO(regiao) VALUES ('ZONA LESTE');
INSERT INTO LOCALIZACAO(regiao) VALUES ('ZONA OESTE');
INSERT INTO LOCALIZACAO(regiao) VALUES ('ZONA NORTE');

INSERT INTO FROTA(nome, zona, usuario_id, quantidade_veiculos) VALUES ('FROTA SUL', 'SUL', 1, 2);
INSERT INTO FROTA(nome, zona, usuario_id, quantidade_veiculos) VALUES ('FROTA NORTE', 'NORTE', 1, 2);
INSERT INTO FROTA(nome, zona, usuario_id, quantidade_veiculos) VALUES ('FROTA OESTE', 'OESTE', 1, 2);
INSERT INTO FROTA(nome, zona, usuario_id, quantidade_veiculos) VALUES ('FROTA LESTE', 'LESTE', 1, 2);

INSERT INTO VEICULO(status, localizacao_id, temperatura, nivel_do_combustivel, frota_id, data_criacao) VALUES('Em Movimento', 1, 21.21, 35, 1, '2019-07-12');
INSERT INTO VEICULO(status, localizacao_id, temperatura, nivel_do_combustivel, frota_id, data_criacao) VALUES('Parado', 2, 31.21, 35, 2, '2019-07-12');
INSERT INTO VEICULO(status, localizacao_id, temperatura, nivel_do_combustivel, frota_id, data_criacao) VALUES('Garagem', 3, 27.21, 35, 3, '2019-07-12');
INSERT INTO VEICULO(status, localizacao_id, temperatura, nivel_do_combustivel, frota_id, data_criacao) VALUES('Quebrado', 4, 29.21, 35, 4, '2019-07-12');

INSERT INTO VEICULO(status, localizacao_id, temperatura, nivel_do_combustivel, frota_id, data_criacao) VALUES('Quebrado', 1, 21.21, 35, 1, '2019-07-12');
INSERT INTO VEICULO(status, localizacao_id, temperatura, nivel_do_combustivel, frota_id, data_criacao) VALUES('Garagem', 2, 31.21, 35, 2, '2019-07-12');
INSERT INTO VEICULO(status, localizacao_id, temperatura, nivel_do_combustivel, frota_id, data_criacao) VALUES('Parado', 3, 27.21, 35, 3, '2019-07-12');
INSERT INTO VEICULO(status, localizacao_id, temperatura, nivel_do_combustivel, frota_id, data_criacao) VALUES('Em Movimento', 4, 29.21, 35, 4, '2019-07-12');


