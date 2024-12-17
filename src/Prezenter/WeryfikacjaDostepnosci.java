package Prezenter;

import Model.*;

public class WeryfikacjaDostepnosci extends PodstawowaObsluga {

	private boolean decyzja;
	private boolean dostepny;
	private Powiadomienie powiadomienieODostepnosci;

	public WeryfikacjaDostepnosci() {};

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		dostepny = pojazd.getStatus_dostepnosci();

		if(dostepny) {
			System.out.println("Sprzęt dostępny");
			if(nastepnik != null) {
				return nastepnik.Obsluz(pojazd);
			}
			decyzja = true;
		} else {
			System.out.println("Sprzęt niedostępny, wysyłanie powiadomienia");
			decyzja = false;
		}
		return decyzja;
	}
}