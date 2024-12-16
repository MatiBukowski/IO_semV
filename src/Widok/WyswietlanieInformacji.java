package Widok;

import Model.*;
import Prezenter.Formularz;

import java.util.List;

public interface WyswietlanieInformacji {

	void WyswietlOferty(Panel panel, List<Pojazd> pojazdy);

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