

import connection.ConnectionFactory;
import dao.UsuarioDAO;
import model.Usuario;

public class Main {

	public static void main(String[] args) {

		ConnectionFactory conn = new ConnectionFactory();
		conn.getConnection();
<<<<<<< HEAD:src/Principal/Main.java
		
		cadastrar();
	}
	
private static void cadastrar() {
		
		Usuario u = new Usuario();
		u.setNome("maria Souza");
		u.setSobrenome("Souza");
		u.setSenha("Gils");
		u.setHabilitado(true);
		//u.setData_cadastro("13/10/2023");
		
		UsuarioDAO ud = new UsuarioDAO();
		ud.save(u);
		
=======
		//add comment para ver o github

>>>>>>> 2e87b6bbd387d8ba09749d839e57e3174e815ec4:src/Main.java
	}
}
