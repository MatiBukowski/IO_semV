package Prezenter;

import Model.*;
import Widok.*;

import java.util.List;

public class FasadaPrezentera implements ZarzadzanieOferta {
	private FasadaWidoku fasadaWidoku;
	private PodstawowaObsluga podstawowaObsluga;
	private Formularz formularz;
	private List<Pojazd> pojazdy;
	private Panel panel;

	public FasadaPrezentera(FasadaWidoku fasadaWidoku) {
		this.fasadaWidoku = fasadaWidoku;
	}

	public void WyswietlFormularz(Formularz formularz) {
		fasadaWidoku.WyswietlFormularz(formularz);
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

	public void WyswietlOferty(Panel panel, List<Pojazd> pojazdy) {
		fasadaWidoku.WyswietlOferty(panel, pojazdy);

		KreatorFormularzy kreatorFormularzy = new KreatorFormularzyDodawania();
		formularz = kreatorFormularzy.StworzFormularz();
	}

	public void WyswietlPowiadomienie(Panel panel) {
		// TODO - implement FasadaPrezentera.WyswietlPowiadomienie
		fasadaWidoku.WyswietlPowiadomienie(panel);
	}

	private List<Pojazd> GetAllPojazd() {
		return pojazdy;
	}


	public void WybierzOferte(Pojazd pojazd) {
		KreatorFormularzy kreatorFormularzy = new KreatorFormularzyAktualizowania();
		formularz = kreatorFormularzy.StworzFormularz(pojazd);
	}

	public void ZarezerwujOferte(Pojazd pojazd) {
		WeryfikacjaDostepnosci weryfikacjaDostepnosci = new WeryfikacjaDostepnosci();
		WeryfikacjaDokumentow weryfikacjaDokumentow = new WeryfikacjaDokumentow();
		weryfikacjaDokumentow.SetFasadaWidoku(fasadaWidoku);
//		WeryfikacjaTrzezwosci weryfikacjaTrzezwosci = new WeryfikacjaTrzezwosci();

		weryfikacjaDostepnosci.SetNastepnik(weryfikacjaDokumentow);
//		weryfikacjaDokumentow.SetNastepnik(weryfikacjaTrzezwosci);

		boolean decyzja = weryfikacjaDostepnosci.Obsluz(pojazd);

		if(decyzja) {
			System.out.println("Rezerwacja zakończona niepowodzeniem");
		}
	}

}