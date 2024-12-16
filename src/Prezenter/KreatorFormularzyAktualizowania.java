package Prezenter;

import Model.*;

public class KreatorFormularzyAktualizowania extends KreatorFormularzy {

	/**
	 * 
	 * @param pojazd
	 */
	public Formularz StworzFormularz(Pojazd pojazd) {
		Formularz formularzAktualizowania = new FormularzAktualizowania(pojazd);

		return formularzAktualizowania;
	}

	public KreatorFormularzyAktualizowania() {

	}

}