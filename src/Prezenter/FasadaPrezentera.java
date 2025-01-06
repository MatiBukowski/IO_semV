package Prezenter;

import Model.*;
import Widok.*;

import java.util.List;

public class FasadaPrezentera implements ZarzadzanieOferta {
	private FasadaWidoku fasadaWidoku;
	private FasadaZwracaniaPojazdu fasadaZwracaniaPojazdu;
	private PodstawowaObsluga podstawowaObsluga;
	private Formularz formularz;
	private List<Pojazd> pojazdy;
	private Panel panel;
	private int operacja;

	public FasadaPrezentera(FasadaWidoku fasadaWidoku, FasadaZwracaniaPojazdu fasadaZwracaniaPojazdu) {
		this.fasadaWidoku = fasadaWidoku;
		this.fasadaZwracaniaPojazdu = fasadaZwracaniaPojazdu;
	}

	public void WyswietlFormularz(Formularz formularz) {
		fasadaWidoku.WyswietlFormularz(formularz);
	}

	public void WyswietlOperacje(Panel panel){
		fasadaWidoku.WyswietlOperacje(panel);
	}

	/**
	 * 
	 * @param formularz
	 */
	public void DodajOferte(Formularz formularz) {
		fasadaZwracaniaPojazdu.DodajPojazd(formularz);
	}

	/**
	 * 
	 * @param id_sprzetu
	 */
	public void UsunOferte(int id_sprzetu) {
		fasadaZwracaniaPojazdu.UsunPojazd(id_sprzetu);
	}

	/**
	 * 
	 * @param formularz
	 */
	public void AktualizujOferte(Formularz formularz) {
		fasadaZwracaniaPojazdu.AktualizujPojazd(formularz);
	}

	public void WyswietlOferty(Panel panel, List<Pojazd> pojazdy) {
		fasadaWidoku.WyswietlOferty(panel, pojazdy);
	}

	public void WyswietlPowiadomienie(Panel panel) {
		// TODO - implement FasadaPrezentera.WyswietlPowiadomienie
		fasadaWidoku.WyswietlPowiadomienie(panel);
	}

	private List<Pojazd> GetAllPojazd() {
		return pojazdy;
	}

	public Pojazd WybierzOferte() {
		return null;
	}

	@Override
	public void WybierzOperacje(int operacja) {
		if(operacja==0){
			KreatorFormularzyDodawania kreator = new KreatorFormularzyDodawania();
			formularz = kreator.StworzFormularz();
			WyswietlFormularz(formularz);
			DodajOferte(formularz);
		}else if(operacja==1){
			KreatorFormularzyAktualizowania kreator = new KreatorFormularzyAktualizowania();
			Pojazd pojazd = WybierzOferte();
			formularz = kreator.StworzFormularz(pojazd);
			WyswietlFormularz(formularz);
			AktualizujOferte(formularz);
		}else if(operacja==2){
			Pojazd pojazd = WybierzOferte();
			UsunOferte(pojazd.getId_sprzetu());
		}
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

	public void ZarzadzajOferta() {
			WyswietlOferty(panel, pojazdy);
			WyswietlOperacje(panel);
	}

}