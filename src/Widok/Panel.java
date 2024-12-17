package Widok;

import Prezenter.*;
import Model.*;

public class Panel {

	private int idPanelu;

	public Panel(int idPanelu) {
		this.idPanelu = idPanelu;
	}

	public int getIdPanelu() {
		return idPanelu;
	}

	public void WyswietlOferty() {
		System.out.println("Wyświetlanie panelu ofert");
	}

	public void WyswietlPowiadomienie() {
		System.out.println("Wyświetlanie powiadomienia");
	}

	public void WyswietlFormularz(Formularz formularz) {
		System.out.println("Wyświetlanie formularza");
	}

	/**
	 *
	 * @param formularz
	 */
	private Formularz WypelnijFormularz(Formularz formularz) {
		// TODO - implement Panel.WypelnijFormularz
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param formularz
	 */
	public void DodajOferte(Formularz formularz) {
		// TODO - implement Panel.DodajOferte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_sprzetu
	 */
	public void UsunOferte(int id_sprzetu) {
		// TODO - implement Panel.UsunOferte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param formularz
	 */
	public void AktualizujOferte(Formularz formularz) {
		// TODO - implement Panel.AktualizujOferte
		throw new UnsupportedOperationException();
	}

	public Pojazd WybierzOferte() {
		// TODO - implement Panel.WybierzOferte
		throw new UnsupportedOperationException();
	}

}