package Widok;

import Model.*;
import Prezenter.*;

import java.util.ArrayList;
import java.util.List;

public class FasadaWidoku implements WyswietlanieInformacji {

//	private List<Panel> panele = new ArrayList<>();
	private Panel[] panele;

	public FasadaWidoku(Panel[] panele) {
		this.panele = panele;
	}

	public void WyswietlOferty(Panel panel, List<Pojazd> pojazdy) {
		panele[0].WyswietlOferty();
	}

	public void WyswietlPowiadomienie(Panel panel) {
		panele[1].WyswietlPowiadomienie();
	}

	public void WyswietlFormularz(Formularz formularz) {
		panele[2].WyswietlFormularz(formularz);
	}

	public void WyswietlOperacje(Panel panel) {
		panele[3].WyswietlOperacje();
	}

}