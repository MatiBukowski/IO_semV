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
		powiadomienieOWeryfikacji = new Powiadomienie(kontekstPowiadomienia);
		ZweryfikujDokumenty();
		powiadomienieOWeryfikacji.PowiadomOPoprawnosciDok(dokumentyPoprawne);

		if (dokumentyPoprawne) {
			System.out.println("Dokumenty poprawne");
			if (nastepnik != null) {
				nastepnik.SetNastepnik(null);
				return nastepnik.Obsluz(pojazd);
			}
			decyzja = true;
		} else {
			System.out.println("Dokumenty niepoprawne");
			decyzja = false;
		}

		return decyzja;
	}


	public void WyslijFormularz(Formularz formularzDanychKlienta) {
		dokumentyPoprawne = WyslijDokumentyDoSprawdzenia(formularzDanychKlienta);
	}

	public void ZweryfikujDokumenty() {
		KreatorFormularzy kreatorFormularzyDanychKlienta = new KreatorFormularzyDanychKlienta();
		Formularz formularz = kreatorFormularzyDanychKlienta.StworzFormularz();

		WyswietlFormularz(formularz);
	}

	public void WyswietlFormularz(Formularz formularz) {

		this.fasadaWidoku.WyswietlFormularz(formularz);
	}

	public boolean WyslijDokumentyDoSprawdzenia(Formularz formularz) {

		System.out.println("Wysyłanie dokumentów na strony rządowe w celu sprawdzenia ich poprawności");

		return true;
	}

	public void ZamknijSprzet() {
		System.out.println("Zamknięcie sprzętu");
	}

	public void SetFasadaWidoku(FasadaWidoku fasada) {
		this.fasadaWidoku = fasada;
	}

}