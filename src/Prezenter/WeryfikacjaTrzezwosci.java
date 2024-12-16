package Prezenter;

public class WeryfikacjaTrzezwosci extends PodstawowaObsluga {

	private boolean decyzja;
	private Powiadomienie powiadomienieOTrzezwosci;

	public void AnalizaPomiaru() {
		decyzja = ZwrocDecyzje();

		if(!decyzja) {
			Powiadomienie powiadomienieOTrzezwosci = new Powiadomienie();
			powiadomienieOTrzezwosci.PowiadomSMS();
			Zakoncz();
		}
	}

	public boolean ZwrocDecyzje() {
		// TODO - implement WeryfikacjaTrzezwosci.ZwrocDecyzje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param zadanie
	 */
	public void Obsluz(int zadanie) {
		// TODO - implement WeryfikacjaTrzezwosci.Obsluz
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nastepnik
	 */
	public void SetNastepnik(PodstawowaObsluga nastepnik) {
		// TODO - implement WeryfikacjaTrzezwosci.SetNastepnik
		throw new UnsupportedOperationException();
	}

	public void ZweryfikujTrzezwosc() {
		AnalizaPomiaru();
	}

	public void Zakoncz() {
		System.exit(0);
	}

}