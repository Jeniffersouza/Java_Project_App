package model;

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
	
}
