package Prezenter;

import Model.Pojazd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KreatorFormularzyTest {

    Pojazd pojazd;
    @BeforeEach
    void setUp() {
        pojazd = new Pojazd();
        pojazd.setTyp("supersamochód");
        pojazd.setMarka("Ferrari");
        pojazd.setModel("812");
        pojazd.setSilnik("V12");
        pojazd.setMoc(700);
        pojazd.setMoment_obrotowy(800);

    }

    @Test
    void stworzFormularz() {
        FormularzAktualizowania formularzAktualizowania = new FormularzAktualizowania(pojazd);

        assertSame(formularzAktualizowania.getTyp(), pojazd.getTyp(), "Niepoprany typ");
        assertSame(formularzAktualizowania.getMarka(), pojazd.getMarka(), "Niepoprany typ");
        assertSame(formularzAktualizowania.getTyp(), pojazd.getModel(), "Niepoprany typ");
        assertSame(formularzAktualizowania.getSilnik(), pojazd.getSilnik(), "Niepoprany typ");
        assertSame(formularzAktualizowania.getMoc(), pojazd.getMoc(), "Niepoprany typ");
        assertSame(formularzAktualizowania.getTyp(), pojazd.getMoment_obrotowy(), "Niepoprany typ");
    }
}