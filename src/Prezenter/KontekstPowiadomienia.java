package Prezenter;

public class KontekstPowiadomienia {

	private StrategiaTworzeniaPowiadomien strategiaTworzeniaPowiadomien;

	public void SetStrategiaPowiadomienia(StrategiaTworzeniaPowiadomien konkretnaStrategia) {
		this.strategiaTworzeniaPowiadomien = konkretnaStrategia;
	}

	public void  StworzPowiadomienie(String wiadomosc) {
		if (strategiaTworzeniaPowiadomien != null) {
			strategiaTworzeniaPowiadomien.WyslijPowiadomienie(wiadomosc);
		} else {
			System.out.println("Brak strategii powiadomienia");
		}
	}
}