package Prezenter;

import Model.*;

public abstract class PodstawowaObsluga {
	protected PodstawowaObsluga nastepnik;
	protected KontekstPowiadomienia kontekstPowiadomienia;

	public abstract boolean Obsluz(Pojazd pojazd);

	public void SetNastepnik(PodstawowaObsluga nastepnik) {
		this.nastepnik = nastepnik;
	}
}