CREATE DATABASE TURNORDESTE;
USE TURNORDESTE;

CREATE TABLE Cliente (
idCliente INT AUTO_INCREMENT PRIMARY KEY,
tipoCliente VARCHAR (2),
nomeCliente VARCHAR (255) NOT NULL,
cpfcnpjCliente VARCHAR(16) NOT NULL,
emailCliente VARCHAR (30),
enderecoCliente TEXT NOT NULL,
telefoneCliente VARCHAR (20),
formaPgto VARCHAR (20)
);
CREATE TABLE Destinos (
idDestinos INT AUTO_INCREMENT PRIMARY KEY,
fornecedorDestinos VARCHAR (255) NOT NULL,
vagasDestinos DATETIME,
transporteDestinos VARCHAR(50),
valorDestinos INT (50) NOT NULL,
enderecoDestinos TEXT NOT NULL,
nomeDestinos VARCHAR (255) NOT NULL,
idCliente INT NOT NUlL,
FOREIGN KEY (idCliente) REFERENCES Cliente ( idCliente)
);
CREATE TABLE Reservas (
idDestinos INT NOT NUlL,
FOREIGN KEY (idDestinos) REFERENCES Destinos ( idDestinos),
idFornecedor INT NOT NUlL,
FOREIGN KEY (idFornecedor) REFERENCES Fornecedor ( idFornecedor)
);
CREATE TABLE Fornecedor (
idFornecedor INT AUTO_INCREMENT PRIMARY KEY,
nomeFornecedor VARCHAR (255) NOT NULL,
tipoServiço VARCHAR(100),
endereçoFornecedor VARCHAR (255) NOT NULL,
valorFornecedor INT (50) NOT NULL,
comissaoFornecedor INT (50) NOT NULL
);
SELECT * FROM Cliente;


 
