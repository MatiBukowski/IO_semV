package Prezenter;

import Model.*;

public class WeryfikacjaDostepnosci extends PodstawowaObsluga {

	private boolean decyzja;
	private int IDsprzetu;
	private Powiadomienie powiadomienieODostepnosci;

	public WeryfikacjaDostepnosci() {};

	public void SprawdzID() {
		// TODO - implement WeryfikacjaDostepnosci.SprawdzID
		throw new UnsupportedOperationException();
	}

	public boolean ZwrocDecyzje() {
		// TODO - implement WeryfikacjaDostepnosci.ZwrocDecyzje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param zadanie
	 */
	public void Obsluz(int zadanie) {
		// TODO - implement WeryfikacjaDostepnosci.Obsluz
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nastepnik
	 */
	public void SetNastepnik(PodstawowaObsluga nastepnik) {
		// TODO - implement WeryfikacjaDostepnosci.SetNastepnik
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pojazd
	 */
	public boolean ZweryfikujDostepnosc(Pojazd pojazd) {
		decyzja = ZwrocDecyzje();

		if(!decyzja) {
			Powiadomienie powiadomienieODostepnosci = new Powiadomienie();
			powiadomienieODostepnosci.PowiadomSYS();
			Zakoncz();
		}

		return decyzja;
	}

	public void Zakoncz() {
		System.exit(0);
	}

}