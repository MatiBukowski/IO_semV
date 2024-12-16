package Widok;

import Model.*;

public interface WyswietlanieInformacji {

	/**
	 * 
	 * @param idPanelu
	 * @param pojazdy
	 */
	void WyswietlOferty(int idPanelu, List<Pojazd> pojazdy);

	/**
	 * 
	 * @param idPanelu
	 */
	void WyswietlPowiadomienie(int idPanelu);

	/**
	 * 
	 * @param idPanelu
	 * @param formularz
	 */
	void WyswietlFormularz(int idPanelu, Formularz formularz);

}