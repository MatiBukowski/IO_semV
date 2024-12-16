package Model;

public class Pojazd {

	private int id_sprzetu;
	private String rodzaj;
	private String typ;
	private boolean status_dostepnosci;

	public int getId_sprzetu() {
		return this.id_sprzetu;
	}

	/**
	 * 
	 * @param id_sprzetu
	 */
	public void setId_sprzetu(int id_sprzetu) {
		this.id_sprzetu = id_sprzetu;
	}

	public boolean getStatus_dostepnosci() {
		return this.status_dostepnosci;
	}

	/**
	 * 
	 * @param status_dostepnosci
	 */
	public void setStatus_dostepnosci(boolean status_dostepnosci) {
		this.status_dostepnosci = status_dostepnosci;
	}

	public Pojazd() {
		// TODO - implement Pojazd.Pojazd
		throw new UnsupportedOperationException();
	}

}