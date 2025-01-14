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

        assertSame(formularzAktualizowania.getTyp(), pojazd.getTyp(), "Niepoprawny typ");
        assertSame(formularzAktualizowania.getMarka(), pojazd.getMarka(), "Niepoprawna marka");
        assertSame(formularzAktualizowania.getModel(), pojazd.getModel(), "Niepoprawny model");
        assertSame(formularzAktualizowania.getSilnik(), pojazd.getSilnik(), "Niepoprawny silnik");
        assertEquals(formularzAktualizowania.getMoc(), pojazd.getMoc(), "Niepoprawna moc");
        assertEquals(formularzAktualizowania.getMoment_obrotowy(), pojazd.getMoment_obrotowy(), "Niepoprawny moment");
    }
}