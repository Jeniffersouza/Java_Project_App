package Principal;

import connection.ConnectionFactory;

public class Main {

	public static void main(String[] args) {

		ConnectionFactory conn = new ConnectionFactory();
		conn.getConnection();
	}

}
