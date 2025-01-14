package Prezenter;

import Model.*;

public class FormularzAktualizowania extends Formularz {

	private int id_sprzetu;
	private String typ;
	private String rodzaj;
	private String silnik;

	/**
	 * 
	 * @param id_sprzetu
	 */
	public Pojazd GetPojazd(int id_sprzetu) {
		// TODO - implement FormularzAktualizowania.GetPojazd
		throw new UnsupportedOperationException();
	}

	public FormularzAktualizowania(Pojazd pojazd) {
		id_sprzetu = pojazd.getId_sprzetu();
		rodzaj = pojazd.getRodzaj();
		silnik = pojazd.getSilnik();
	}

	public String getRodzaj() {
		return rodzaj;
	}

	public String getTyp() {
		return typ;
	}

	public String getSilnik() {
		return silnik;
	}
}