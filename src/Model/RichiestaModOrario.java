/**
 * 
 */
package Model;

/**
 * @author ozne2
 *
 */
public class RichiestaModOrario {
	
	
	
	
	
	/**
	 * @param oraInizio
	 * @param oraFine
	 * @param giorno
	 * @param giornoPrecedente
	 */
	public RichiestaModOrario(String oraInizio, String oraFine, String giorno, String giornoPrecedente) {
		super();
		this.oraInizio = oraInizio;
		this.oraFine = oraFine;
		this.giorno = giorno;
		this.giornoPrecedente = giornoPrecedente;
	}
	
	
	/**
	 * @return the oraInizio
	 */
	public String getOraInizio() {
		return oraInizio;
	}
	/**
	 * @param oraInizio the oraInizio to set
	 */
	public void setOraInizio(String oraInizio) {
		this.oraInizio = oraInizio;
	}
	/**
	 * @return the oraFine
	 */
	public String getOraFine() {
		return oraFine;
	}
	/**
	 * @param oraFine the oraFine to set
	 */
	public void setOraFine(String oraFine) {
		this.oraFine = oraFine;
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
	 * @return the giornoPrecedente
	 */
	public String getGiornoPrecedente() {
		return giornoPrecedente;
	}
	/**
	 * @param giornoPrecedente the giornoPrecedente to set
	 */
	public void setGiornoPrecedente(String giornoPrecedente) {
		this.giornoPrecedente = giornoPrecedente;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	private String oraInizio;
	private String oraFine;
	private String giorno;
	private String giornoPrecedente;

}
