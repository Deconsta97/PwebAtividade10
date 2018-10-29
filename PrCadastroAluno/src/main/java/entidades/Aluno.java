package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Aluno {
	@Id
	private String ra;
	private String nome;
	private String sexo;
	private int telefone;
	
	public String getRA() {
		return ra;
	}
	public void setRA(String ra) {
		this.ra = ra;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
