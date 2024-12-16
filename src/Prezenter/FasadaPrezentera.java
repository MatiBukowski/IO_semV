package Prezenter;

import Model.*;
import Widok.ZarzadzanieOferta;

import java.util.List;

public class FasadaPrezentera implements ZarzadzanieOferta {

	private Formularz formularz;
	private PodstawowaObsluga podstawowaObsluga;
	private List<Pojazd> pojazdy;
	private int idPanelu;

	/**
	 * 
	 * @param idPanelu
	 * @param formularz
	 */
	public void WyswietlFormularz(int idPanelu, Formularz formularz) {
		// TODO - implement FasadaPrezentera.WyswietlFormularz
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param formularz
	 */
	public void DodajOferte(Formularz formularz) {
		FasadaZwracaniaPojazdu fasadaZwracaniaPojazdu = new FasadaZwracaniaPojazdu();
		fasadaZwracaniaPojazdu.DodajPojazd(formularz);


		KreatorFormularzy kreatorFormularzy = new KreatorFormularzyDodawania();
		this.formularz = kreatorFormularzy.StworzFormularz();
	}

	/**
	 * 
	 * @param id_sprzetu
	 */
	public void UsunOferte(int id_sprzetu) {
		FasadaZwracaniaPojazdu fasadaZwracaniaPojazdu = new FasadaZwracaniaPojazdu();
		fasadaZwracaniaPojazdu.UsunPojazd(id_sprzetu);
	}

	/**
	 * 
	 * @param formularz
	 */
	public void AktualizujOferte(Formularz formularz) {
		FasadaZwracaniaPojazdu fasadaZwracaniaPojazdu = new FasadaZwracaniaPojazdu();
		fasadaZwracaniaPojazdu.AktualizujPojazd(formularz);
	}

	/**
	 * 
	 * @param idPanelu
	 */
	public void WyswietlOferty(int idPanelu) {
		KreatorFormularzy kreatorFormularzy = new KreatorFormularzyDodawania();
		formularz = kreatorFormularzy.StworzFormularz();
	}

	/**
	 * 
	 * @param idPanelu
	 */
	public void WyswietlPowiadomienie(int idPanelu) {
		// TODO - implement FasadaPrezentera.WyswietlPowiadomienie
		throw new UnsupportedOperationException();
	}

	private List<Pojazd> GetAllPojazd() {
		return pojazdy;
	}


	public void WybierzOferte(Pojazd pojazd) {
		KreatorFormularzy kreatorFormularzy = new KreatorFormularzyAktualizowania();
		formularz = kreatorFormularzy.StworzFormularz(pojazd);
	}

	public void ZarezerwujOferte(Pojazd pojazd) {
		PodstawowaObsluga weryfikacjaDostepnosci = new WeryfikacjaDostepnosci();

		podstawowaObsluga.SetNastepnik(weryfikacjaDostepnosci);
		weryfikacjaDostepnosci.Obsluz(1);
		boolean decyzja = weryfikacjaDostepnosci.ZweryfikujDostepnosc(pojazd);

		if(decyzja) {
			WeryfikacjaDokumentow weryfikacjaDokumentow = new WeryfikacjaDokumentow();
			podstawowaObsluga.SetNastepnik(weryfikacjaDokumentow);
			weryfikacjaDokumentow.Obsluz(1);
			boolean decyzja2 = weryfikacjaDokumentow.getDecyzja();

			KreatorFormularzy kreatorFormularzy = new KreatorFormularzyDanychKlienta();
			kreatorFormularzy.StworzFormularz();

			if(decyzja2) {
				PodstawowaObsluga weryfikacjaTrzezwosci = new WeryfikacjaTrzezwosci();
				podstawowaObsluga.SetNastepnik(weryfikacjaTrzezwosci);
				weryfikacjaTrzezwosci.Obsluz(1);
				weryfikacjaTrzezwosci.ZweryfikujTrzezwosc();
			}
		}


		weryfikacjaDostepnosci.SetNastepnik(weryfikacjaDostepnosci);
		weryfikacjaDostepnosci.Obsluz(1);
	}


	public static void main(String[] args) {
		// TODO - implement FasadaPrezentera.main
		throw new UnsupportedOperationException();
	}

}