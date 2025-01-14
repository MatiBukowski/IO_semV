package Model;

import Prezenter.*;

import java.util.List;

public class FasadaZwracaniaPojazdu implements ZwroceniePojazdu {

	private List<Pojazd> pojazdy;
	private PojazdDAO pojazdDAO;

	public FasadaZwracaniaPojazdu() {
		this.pojazdDAO = new PojazdDAO();
		this.pojazdy = pojazdDAO.WypiszWszystkie();
	}

	public Pojazd GetPojazd(int id_sprzetu) {
		// TODO - implement FasadaZwracaniaPojazdu.GetPojazd
		throw new UnsupportedOperationException();
	}

	public void UsunPojazd(int id_sprzetu) {
		Pojazd pojazd = pojazdDAO.ZnajdzPojazd(id_sprzetu);
		if(pojazd!=null){
			pojazdDAO.Usun(pojazd);
		}
	}

	public void DodajPojazd(Formularz formularz) {
		Pojazd pojazd = StworzPojazd(formularz);
		Pojazd pojazd2 = pojazdDAO.ZnajdzPojazd(pojazd.getId_sprzetu());
		if(pojazd2==null){
			pojazdDAO.Wstaw(pojazd);
		}
	}

	public void AktualizujPojazd(Formularz formularz) {
		Pojazd pojazd = StworzPojazd(formularz);
		Pojazd pojazd2 = pojazdDAO.ZnajdzPojazd(pojazd.getId_sprzetu());
		if(pojazd2!=null){
			pojazdDAO.Zaktualizuj(pojazd);
		}
	}

	public List<Pojazd> GetAllPojazd() {
		return pojazdy;
	}

	private Pojazd StworzPojazd(Formularz formularz) {
		Pojazd pojazd = new Pojazd();

		if (formularz instanceof FormularzDodawania) {
			FormularzDodawania dodawanie = (FormularzDodawania) formularz;
			pojazd.setRodzaj(dodawanie.getRodzaj());
			pojazd.setTyp(dodawanie.getTyp());
			pojazd.setSilnik(dodawanie.getSilnik());

			return pojazd;
		} else if (formularz instanceof FormularzAktualizowania) {
			FormularzAktualizowania aktualizowanie = (FormularzAktualizowania) formularz;
			pojazd.setTyp(aktualizowanie.getTyp());
			pojazd.setSilnik(aktualizowanie.getSilnik());

			return pojazd;
		}

		return null;
	}

}