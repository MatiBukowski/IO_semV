package Prezenter;

import Model.*;
import Widok.FasadaWidoku;

public class WeryfikacjaDostepnosci extends PodstawowaObsluga {

	private boolean decyzja;
	private boolean dostepny;
	private Powiadomienie powiadomienieODostepnosci;

	public WeryfikacjaDostepnosci() {
		kontekstPowiadomienia = new KontekstPowiadomienia();
	};

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		WeryfikacjaTrzezwosci weryfikacjaTrzezwosci = new WeryfikacjaTrzezwosci();
		powiadomienieODostepnosci = new Powiadomienie(kontekstPowiadomienia);

		dostepny = pojazd.getStatus_dostepnosci();

		if(dostepny) {
			System.out.println("Sprzęt dostępny");
			powiadomienieODostepnosci.PowiadomODostepnosci(dostepny);

			if(nastepnik != null) {
				nastepnik.SetNastepnik(weryfikacjaTrzezwosci);
				return nastepnik.Obsluz(pojazd);
			}
			decyzja = true;
		} else {
			System.out.println("Sprzęt niedostępny");
			powiadomienieODostepnosci.PowiadomODostepnosci(dostepny);
			decyzja = false;
		}

		return decyzja;
	}
}