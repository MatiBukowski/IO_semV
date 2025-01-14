package Prezenter;

public class Powiadomienie {

	private KontekstPowiadomienia kontekstPowiadomienia;

	public String getWiadomosc() {
		return wiadomosc;
	}

	private String wiadomosc;

	public Powiadomienie(KontekstPowiadomienia kontekstPowiadomienia) {
		this.kontekstPowiadomienia = kontekstPowiadomienia;
	}

	public void PowiadomODostepnosci(boolean decyzja) {
		if(decyzja)
			wiadomosc = "Wybrany pojazd jest dostępny";
		else wiadomosc = "Wybrany pojazd jest niedostępny";

		kontekstPowiadomienia.SetStrategiaPowiadomienia(new StrategiaPowiadamianaSystemowego());
		kontekstPowiadomienia.StworzPowiadomienie(wiadomosc);
	}
	public void PowiadomOPoprawnosciDok(boolean decyzja) {
		if(decyzja)
			wiadomosc = "Weryfikacja dokumentów zakończona sukcesem";
		else wiadomosc = "Weryfikacja dokumentów zakończona niepowodzeniem - niepoprawne dokumenty";

		kontekstPowiadomienia.SetStrategiaPowiadomienia(new StrategiaPowiadamianaSystemowego());
		kontekstPowiadomienia.StworzPowiadomienie(wiadomosc);
	}
	public void PowiadomOTrzezwosci(boolean decyzja) {
		if(decyzja)
			wiadomosc = "Klient jest trzeźwy - sprzęt odblokowany";
		else wiadomosc = "Klient jest nietrzeźwy - sprzęt zablokowany";

		kontekstPowiadomienia.SetStrategiaPowiadomienia(new StrategiaPowiadamianiaSMS());
		kontekstPowiadomienia.StworzPowiadomienie(wiadomosc);
	}
}