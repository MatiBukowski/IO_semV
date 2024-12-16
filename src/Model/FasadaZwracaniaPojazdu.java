package Model;

import Prezenter.*;

import java.util.List;

public class FasadaZwracaniaPojazdu implements ZwroceniePojazdu {

	private List<Pojazd> pojazdy;

	public Pojazd GetPojazd(int id_sprzetu) {
		// TODO - implement FasadaZwracaniaPojazdu.GetPojazd
		throw new UnsupportedOperationException();
	}

	public void UsunPojazd(int id_sprzetu) {
		PojazdDAO pojazdDAO = new PojazdDAO();
		Pojazd pojazd = pojazdDAO.ZnajdzPojazd(id_sprzetu);

		pojazdDAO.Usun(pojazd);
	}

	public void DodajPojazd(Formularz formularz) {
		StworzPojazd(formularz);
	}

	public void AktualizujPojazd(Formularz formularz) {
		StworzPojazd(formularz);
	}

	public List<Pojazd> GetAllPojazd() {
		return pojazdy;
	}

	private void StworzPojazd(Formularz formularz) {
		Pojazd pojazd = new Pojazd();
		PojazdDAO pojazdDAO = new PojazdDAO();

		if (formularz instanceof FormularzDodawania) {
			FormularzDodawania dodawanie = (FormularzDodawania) formularz;
			pojazd.setRodzaj(dodawanie.getRodzaj());
			pojazd.setTyp(dodawanie.getTyp());
			pojazd.setSilnik(dodawanie.getSilnik());

			pojazdDAO.Wstaw(pojazd);
		} else if (formularz instanceof FormularzAktualizowania) {
			FormularzAktualizowania aktualizowanie = (FormularzAktualizowania) formularz;
			pojazd.setRodzaj(aktualizowanie.getRodzaj());
			pojazd.setTyp(aktualizowanie.getTyp());
			pojazd.setSilnik(aktualizowanie.getSilnik());

			pojazdDAO.Zaktualizuj(pojazd);
		}
	}

}