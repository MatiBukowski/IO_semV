package Prezenter;

import Model.*;

public abstract class PodstawowaObsluga {

	private WeryfikacjaDostepnosci wer_dos;
	private WeryfikacjaDokumentow wer_dok;
	private WeryfikacjaTrzezwosci wer_trz;
	protected PodstawowaObsluga nastepnik;

	/**
	 * 
	 * @param zadanie
	 */
	public void Obsluz(int zadanie) {
		// TODO - implement PodstawowaObsluga.Obsluz
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nastepnik
	 */
	public void SetNastepnik(PodstawowaObsluga nastepnik) {
		// TODO - implement PodstawowaObsluga.SetNastepnik
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pojazd
	 */
	public boolean ZweryfikujDostepnosc(Pojazd pojazd) {
		// TODO - implement PodstawowaObsluga.ZweryfikujDostepnosc
		throw new UnsupportedOperationException();
	}

	public void ZweryfikujDokumenty() {
		// TODO - implement PodstawowaObsluga.ZweryfikujDokumenty
		throw new UnsupportedOperationException();
	}

	public void ZweryfikujTrzezwosc() {
		// TODO - implement PodstawowaObsluga.ZweryfikujTrzezwosc
		throw new UnsupportedOperationException();
	}

}