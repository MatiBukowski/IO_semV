package Widok;

import Model.*;
import Prezenter.Formularz;

import java.util.List;

public interface WyswietlanieInformacji {

	void WyswietlOferty(Panel panel, List<Pojazd> pojazdy);

	void WyswietlPowiadomienie(Panel panel);

	void WyswietlFormularz(Formularz formularz);

}