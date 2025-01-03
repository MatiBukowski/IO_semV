package Prezenter;

import Model.Pojazd;

public class WeryfikacjaTrzezwosci extends PodstawowaObsluga {

	private boolean decyzja;
	private boolean kierowcaTrzezwy;
	private Powiadomienie powiadomienieOTrzezwosci;

	public boolean AnalizaPomiaru() {
		System.out.println("Dane z alkomatu zamontowanego w samochodzie");

		return true;
	}

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		ZweryfikujTrzezwosc();

		if(kierowcaTrzezwy) {
			System.out.println("Kierowca jest trzeźwy");
			OdblokujSprzet();
			decyzja = true;
		} else {
			System.out.println("Kierowca jest nietrzeźwy, wysyłanie powiadomienia");
			decyzja = false;
		}
		return decyzja;
	}

	public void ZweryfikujTrzezwosc() {
		kierowcaTrzezwy = AnalizaPomiaru();
	}

	public void OdblokujSprzet() {
		System.out.println("Odblokowanie sprzętu");
	}
	public void ZablokujSprzet() {
		System.out.println("Zablokowanie sprzętu");
	}

}