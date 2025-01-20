package Prezenter;

import Model.Pojazd;

public class WeryfikacjaTrzezwosci extends PodstawowaObsluga {

	private boolean decyzja;
	private boolean kierowcaTrzezwy;
	private Powiadomienie powiadomienieOTrzezwosci;
	public WeryfikacjaTrzezwosci() {
		powiadomienieOTrzezwosci = new Powiadomienie(kontekstPowiadomienia);
	}

	public WeryfikacjaTrzezwosci(Powiadomienie powiadomienie) {
		this.powiadomienieOTrzezwosci = powiadomienie != null ? powiadomienie : new Powiadomienie(kontekstPowiadomienia);
	}

	public boolean AnalizaPomiaru() {
		System.out.println("Dane z alkomatu zamontowanego w samochodzie");

		return true;
	}

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		//powiadomienieOTrzezwosci = new Powiadomienie(kontekstPowiadomienia);
		ZweryfikujTrzezwosc();
		powiadomienieOTrzezwosci.PowiadomOTrzezwosci(kierowcaTrzezwy);

		if(kierowcaTrzezwy) {
			System.out.println("Kierowca jest trzeźwy");
			OdblokujSprzet();
			decyzja = true;
		} else {
			System.out.println("Kierowca jest nietrzeźwy");
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