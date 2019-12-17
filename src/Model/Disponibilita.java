/**
 * 
 */
package Model;

/**
 * @author ozne2
 *
 */
public class Disponibilita {
	
	
	//commento
	
	/**
	 * @param giorno
	 * @param ora
	 */
	public Disponibilita(String giorno, String ora) {
		super();
		this.giorno = giorno;
		this.ora = ora;
	}
	
	
	/**
	 * @return the giorno
	 */
	public String getGiorno() {
		return giorno;
	}
	/**
	 * @param giorno the giorno to set
	 */
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
	/**
	 * @return the ora
	 */
	public String getOra() {
		return ora;
	}
	/**
	 * @param ora the ora to set
	 */
	public void setOra(String ora) {
		this.ora = ora;
	}

	//variabili
	private String giorno;
	private String ora;

}
