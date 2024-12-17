package Prezenter;

import Widok.*;
import Model.*;

public class WeryfikacjaDokumentow extends PodstawowaObsluga implements IWeryfikacjaDokumentow {

	private FasadaWidoku fasadaWidoku;
	private boolean decyzja;
	private boolean dokumentyPoprawne;
	private Powiadomienie powiadomienieOWeryfikacji;

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		ZweryfikujDokumenty();

		if (dokumentyPoprawne) {
			System.out.println("Dokumenty poprawne");
			if (nastepnik != null) {
				return nastepnik.Obsluz(pojazd);
			}
			decyzja = true;
		} else {
			System.out.println("Dokumenty niepoprawne, wysyłanie powiadomienia");
			decyzja = false;
		}
		return decyzja;
	}


	public void WyslijFormularz(Formularz formularzDanychKlienta) {
		dokumentyPoprawne = WyslijDokumentyDoSprawdzenia(formularzDanychKlienta);
	}

	public void ZweryfikujDokumenty() {
		KreatorFormularzy kreatorFormularzyDanychKlienta = new KreatorFormularzyDanychKlienta();
		kreatorFormularzyDanychKlienta.StworzFormularz();

	}

	public void WyswietlFormularz(Formularz formularz) {

		this.fasadaWidoku.WyswietlFormularz(formularz);
	}

	public boolean WyslijDokumentyDoSprawdzenia(Formularz formularz) {

		System.out.println("Wysyłanie dokumentów na strony rządowe w celu sprawdzenia ich poprawności");

		return true;
	}

	public void SetFasadaWidoku(FasadaWidoku fasada) {
		this.fasadaWidoku = fasada;
	}

}