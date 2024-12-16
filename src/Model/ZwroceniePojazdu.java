package Model;

import Prezenter.*;

public interface ZwroceniePojazdu {

	/**
	 * 
	 * @param id_sprzetu
	 */
	Pojazd GetPojazd(int id_sprzetu);

	/**
	 * 
	 * @param id_sprzetu
	 */
	void UsunPojazd(int id_sprzetu);

	/**
	 * 
	 * @param formularz
	 */
	void DodajPojazd(Formularz formularz);

	/**
	 * 
	 * @param formularz
	 */
	void AktualizujPojazd(Formularz formularz);

	List<Pojazd> GetAllPojazd();

}