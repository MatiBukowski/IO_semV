package Prezenter;

import Model.Pojazd;

public class WeryfikacjaTrzezwosci extends PodstawowaObsluga {

	private boolean decyzjaTrz;
	private boolean kierowcaTrzezwy;
	private Powiadomienie powiadomienieOTrzezwosci;

	public void AnalizaPomiaru() {

	}

	@Override
	public boolean Obsluz(Pojazd pojazd) {
		if(kierowcaTrzezwy) {
			System.out.println("Kierowca jest trzeźwy");
			decyzjaTrz = true;
		} else {
			System.out.println("Kierowca jest nietrzeźwy, wysyłanie powiadomienia");
			decyzjaTrz = false;
		}
		return decyzjaTrz;
	}

	public void ZweryfikujTrzezwosc() {
		AnalizaPomiaru();
	}

}