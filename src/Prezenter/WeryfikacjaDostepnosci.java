package Prezenter;

import Model.*;
import Widok.FasadaWidoku;

public class WeryfikacjaDostepnosci extends PodstawowaObsluga {

	private boolean decyzja;
	private boolean dostepny;
	private Powiadomienie powiadomienieODostepnosci;

	public WeryfikacjaDostepnosci() {};

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		WeryfikacjaTrzezwosci weryfikacjaTrzezwosci = new WeryfikacjaTrzezwosci();

		dostepny = pojazd.getStatus_dostepnosci();

		if(dostepny) {
			System.out.println("Sprzęt dostępny");
			if(nastepnik != null) {
				nastepnik.SetNastepnik(weryfikacjaTrzezwosci);
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