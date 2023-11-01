package Principal;

import connection.ConnectionFactory;
import dao.UsuarioDAO;
import model.Usuario;

public class Main {

	public static void main(String[] args) {

		ConnectionFactory conn = new ConnectionFactory();
		conn.getConnection();
		
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
		
	}
}
