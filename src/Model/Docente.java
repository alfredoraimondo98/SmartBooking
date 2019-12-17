package Model;

import java.util.ArrayList;

public class Docente extends Utente {

	/**
	 * @param nome
	 * @param cognome
	 * @param matricola
	 * @param password
	 * @param email
	 */
	public Docente(String nome, String cognome, String matricola, String password, String email) {
		super(nome, cognome, matricola, password, email);
		orariDisponibili = new ArrayList<Disponibilita>();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	//var
	
	/**
	 * @return the orariDisponibili
	 */
	public ArrayList<Disponibilita> getOrariDisponibili() {
		return orariDisponibili;
	}




	/**
	 * @param orariDisponibili the orariDisponibili to set
	 */
	public void setOrariDisponibili(ArrayList<Disponibilita> orariDisponibili) {
		this.orariDisponibili = orariDisponibili;
	}




	private ArrayList<Disponibilita> orariDisponibili;
}
