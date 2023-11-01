package model;

<<<<<<< HEAD
import java.util.Date;

public final class Vendedor extends Pessoa{

	private Date data_cadastro;
	private boolean habilitado;
	
	
	
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
=======
import java.sql.Date;

public class Vendedor extends Pessoa {


	private int id;
	private String nome;
	private String sobrenome;
	private String senha;
	private Date data_entrada;
	private boolean habalitado;
>>>>>>> 2e87b6bbd387d8ba09749d839e57e3174e815ec4
}
