package Widok;

import Prezenter.*;
import Model.*;

public interface ZarzadzanieOferta {

	/**
	 * 
	 * @param formularz
	 */
	void DodajOferte(Formularz formularz);

	/**
	 * 
	 * @param id_sprzetu
	 */
	void UsunOferte(int id_sprzetu);

	/**
	 * 
	 * @param formularz
	 */
	void AktualizujOferte(Formularz formularz);

	/**
	 *
	 */
	Pojazd WybierzOferte();

	/**
	 *
	 * @param operacja
	 */
	void WybierzOperacje(int operacja);

}