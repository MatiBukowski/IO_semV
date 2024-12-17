package Prezenter;

import Widok.*;
import Model.*;

public class WeryfikacjaDokumentow extends PodstawowaObsluga implements IWeryfikacjaDokumentow {

	private boolean decyzjaDok;
	private boolean dokumentyPoprawne;
	private Powiadomienie powiadomienieOWeryfikacji;

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		if (dokumentyPoprawne) {
			System.out.println("Dokumenty poprawne");
			if (nastepnik != null) {
				return nastepnik.Obsluz(pojazd);
			}
			decyzjaDok = true;
		} else {
			System.out.println("Dokumenty niepoprawne, wysyłanie powiadomienia");
			decyzjaDok = false;
		}
		return decyzjaDok;
	}


	public void WyslijFormularz(Formularz formularzDanychKlienta) {
		ZweryfikujDokumenty();
	}

	public void ZweryfikujDokumenty() {

	}
}