package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.mysql.jdbc.PreparedStatement;

import connection.ConnectionFactory;
import model.Usuario;

public class UsuarioDAO  implements DAO <Usuario> {

	@Override
	public Optional<Usuario> getbyID(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Usuario usuario) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO USUARIO (nome, sobrenome, senha, habilitado ) VALUES (?, ?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {
			
			ps = (PreparedStatement) ConnectionFactory.getConnection().prepareStatement(sql);
			
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getSobrenome());
			ps.setString(3, usuario.getSenha());
			ps.setBoolean(4, usuario.isHabilitado());
			//ps.setString(5, usuario.getData_cadastro());
			
			
			ps.execute();
			ps.close();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updatebyID(Usuario t, String[] params) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletebyID(Usuario t) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	

}
