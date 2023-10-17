-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Cliente (
Id_Cliente VARCHAR(15) PRIMARY KEY,
FormaPgto VARCHAR(30),
NomeCliente VARCHAR(50),
TipoCliente VARCHAR(2),
CPF/CNPJCliente VARCHAR(20),
TelefoneCliente VARCHAR(15),
EmailCliente VARCHAR(20),
EndereçoCliente VARCHAR(100),
HistoricoCompras VARCHAR(10),
DetalhesClientes VARCHAR(10)
)

CREATE TABLE Destinos (
Id_Destinos VARCHAR(15) PRIMARY KEY,
EndereçoDestino VARCHAR(100),
NomeDestino VARCHAR(50),
ValorDestino VARCHAR(50),
FornecedorDestino VARCHAR(100),
DetathesDestinos VARCHAR(255),
VagasDestino VARCHAR(20),
TransporteDestino VARCHAR(100),
Id_Cliente VARCHAR(15),
FOREIGN KEY(Id_Cliente) REFERENCES Cliente (Id_Cliente)
)

CREATE TABLE Fornecedor (
Id_Fornecedor VARCHAR(15) PRIMARY KEY,
NomeFornecedor VARCHAR(100),
TipoServiço VARCHAR(100),
EndereçoFornecedor VARCHAR(255),
DetalhesFornecedor VARCHAR(100),
ValorFornecedor VARCHAR(50),
CPF/CNPJ VARCHAR(20),
TipoFornecedor VARCHAR(2),
Comissão VARCHAR(50)
)

CREATE TABLE Reserva (
Id_Fornecedor VARCHAR(15),
Id_Destinos VARCHAR(15),
FOREIGN KEY(Id_Fornecedor) REFERENCES Fornecedor (Id_Fornecedor),
FOREIGN KEY(Id_Destinos) REFERENCES Destinos (Id_Destinos)
)

