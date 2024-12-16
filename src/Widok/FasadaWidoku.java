package Widok;

import Model.*;
import Prezenter.*;

import java.util.ArrayList;
import java.util.List;

public class FasadaWidoku implements WyswietlanieInformacji {

	private List<Panel> panele = new ArrayList<>();

	public Panel StworzPanelOfert() {
		Panel panel = new Panel();
		panele.add(panel);

		return panel;
	}

	public void WyswietlOferty(Panel panel, List<Pojazd> pojazdy) {

	}

	/**
	 * 
	 * @param idPanelu
	 */
	public void WyswietlPowiadomienie(int idPanelu) {
		// TODO - implement FasadaWidoku.WyswietlPowiadomienie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPanelu
	 * @param formularz
	 */
	public void WyswietlFormularz(int idPanelu, Formularz formularz) {

	}

}