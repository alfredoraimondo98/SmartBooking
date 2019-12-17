/**
 * 
 */
package Model;

/**
 * @author ozne2
 *
 */
public class Ricevimento {
	
	/**
	 * @param stato
	 * @param data
	 * @param dataPrenotazione
	 */
	public Ricevimento(String stato, String data, String dataPrenotazione) {
		super();
		this.stato = stato;
		this.data = data;
		this.dataPrenotazione = dataPrenotazione;
	}
	/**
	 * @return the stato
	 */
	public String getStato() {
		return stato;
	}
	/**
	 * @param stato the stato to set
	 */
	public void setStato(String stato) {
		this.stato = stato;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the dataPrenotazione
	 */
	public String getDataPrenotazione() {
		return dataPrenotazione;
	}
	/**
	 * @param dataPrenotazione the dataPrenotazione to set
	 */
	public void setDataPrenotazione(String dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	
	//variabili
	private String stato;
	private String data;
	private String dataPrenotazione;
	

}
