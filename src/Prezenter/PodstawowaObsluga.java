package Prezenter;

import Model.*;

public abstract class PodstawowaObsluga {
	protected PodstawowaObsluga nastepnik;


	public abstract boolean Obsluz(Pojazd pojazd);

	public void SetNastepnik(PodstawowaObsluga nastepnik) {
		this.nastepnik = nastepnik;
	}
}