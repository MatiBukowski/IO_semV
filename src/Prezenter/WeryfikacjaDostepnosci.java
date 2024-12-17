package Prezenter;

import Model.*;

public class WeryfikacjaDostepnosci extends PodstawowaObsluga {

	private boolean decyzjaDos;
	private Powiadomienie powiadomienieODostepnosci;

	public WeryfikacjaDostepnosci() {};

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		if(pojazd.getStatus_dostepnosci()) {
			System.out.println("Sprzęt dostępny");
			if(nastepnik != null) {
				return nastepnik.Obsluz(pojazd);
			}
			decyzjaDos = true;
		} else {
			System.out.println("Sprzęt niedostępny, wysyłanie powiadomienia");
			decyzjaDos = false;
		}
		return decyzjaDos;
	}

	public boolean ZweryfikujDostepnosc(Pojazd pojazd) {
		decyzja = ZwrocDecyzje();

		if(!decyzja) {
			Powiadomienie powiadomienieODostepnosci = new Powiadomienie();
			powiadomienieODostepnosci.PowiadomSYS();
			Zakoncz();
		}

		return decyzja;
	}

}