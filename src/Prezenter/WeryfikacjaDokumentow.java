package Prezenter;

import Widok.*;

public class WeryfikacjaDokumentow extends PodstawowaObsluga implements IWeryfikacjaDokumentow {

	private boolean decyzja;
	private Powiadomienie powiadomienieOWeryfikacji;

	public void WyslijDokumenty() {
		// TODO - implement WeryfikacjaDokumentow.WyslijDokumenty
		throw new UnsupportedOperationException();
	}

	public boolean ZwrocDecyzje() {
		// TODO - implement WeryfikacjaDokumentow.ZwrocDecyzje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param zadanie
	 */
	public void Obsluz(int zadanie) {
		// TODO - implement WeryfikacjaDokumentow.Obsluz
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nastepnik
	 */
	public void SetNastepnik(PodstawowaObsluga nastepnik) {
		// TODO - implement WeryfikacjaDokumentow.SetNastepnik
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param formularzDanychKlienta
	 */
	public void WyslijFormularz(Formularz formularzDanychKlienta) {
		ZweryfikujDokumenty();
	}

	public void ZweryfikujDokumenty() {
		WyslijDokumenty();
		decyzja = ZwrocDecyzje();

		if(!decyzja) {
			Powiadomienie powiadomienieOWeryfikacji = new Powiadomienie();
			powiadomienieOWeryfikacji.PowiadomSYS();
			Zakoncz();
		}
	}

	public void Zakoncz() {
		System.exit(0);
	}

	public boolean getDecyzja() {
		return decyzja;
	}

	public boolean isDecyzja() {
		return decyzja;
	}
}