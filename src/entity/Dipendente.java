package entity;

public class Dipendente {

	private int id;
	private String nome;
	private String cognome;
	private String cf;
	private String username;
	private String password;
	private int id_agenzia;

	public Dipendente(String nome, String cognome, String cf,
			String username, String password, int id_agenzia) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.username = username;
		this.password = password;
		this.id_agenzia = id_agenzia;
	}

	public Dipendente() {
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getId() {
		return id;
	}

	public String getCf() {
		return cf;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getId_agenzia() {
		return id_agenzia;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId_agenzia(int id_agenzia) {
		this.id_agenzia = id_agenzia;
	}

}
