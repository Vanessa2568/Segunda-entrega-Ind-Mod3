package com.agenciatur.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConexao {
	
	private static final String url = "jdbc:mysql://localhost:3306/turnordeste";	
	private static final String user = "root";	
	private static final String password = "root";
	
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drive encontrado!");
			
		} catch(ClassNotFoundException e) {
			System.out.println("Drive não encontrado! Mensagem:" + e.getMessage());
		}
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com sucesso!");
			
			return connection;
		} catch (SQLException e) {
			System.out.println("Não foi possivel conectar ao banco de dados! mensagem:" + e.getMessage());
			return null;
		}
		
		
	}
}


