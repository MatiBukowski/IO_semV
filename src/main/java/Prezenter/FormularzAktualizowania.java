package Prezenter;

import Model.*;

public class FormularzAktualizowania extends Formularz {

	private int id_sprzetu;
	private String typ;
	private String silnik;
	private String marka;
	private String model;
	private int moc;
	private int moment_obrotowy;

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
		silnik = pojazd.getSilnik();
		moc = pojazd.getMoc();
		moment_obrotowy = pojazd.getMoment_obrotowy();
		model = pojazd.getModel();
		marka = pojazd.getMarka();
		typ = pojazd.getTyp();
	}

	public String getTyp() {
		return typ;
	}

	public String getSilnik() {
		return silnik;
	}

	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
	}
	public int getMoc() {
		return moc;
	}
	public int getMoment_obrotowy() {
		return moment_obrotowy;
	}
}