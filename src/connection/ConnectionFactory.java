package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	private static final String url = "jdbc:mysql://localhost:3306/db_produto";
	private static final String user = "root";
	private static final String password = "";
	
	private static Connection conn;


	public static Connection getConnection() {
	
		try {
			
			if(conn == null) {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("CONEXÃO COM O BANCO DE DADOS REALIZADA\n");
			return conn;
			
			}else {
				
				return conn;
			}
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			
			System.out.println("FALHA NA CONEXÃO COM O BANCO DE DADOS\n");
			return null;
		}
		
	}
}
