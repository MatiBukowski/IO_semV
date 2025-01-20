package Prezenter;

import Model.Pojazd;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

import java.util.IllegalFormatCodePointException;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Formularz")
class KreatorFormularzyTest implements TestExecutionExceptionHandler {

    static Pojazd pojazd;
    @BeforeAll
    static void setUp() {
        pojazd = new Pojazd();
        pojazd.setTyp("supersamochód");
        pojazd.setMarka("Ferrari");
        pojazd.setModel("812");
        pojazd.setSilnik("V12");
        pojazd.setMoc(700);
        pojazd.setMoment_obrotowy(800);
    }

    @Test
    @ExtendWith(KreatorFormularzyTest.class)
    void stworzFormularz() {
        FormularzAktualizowania formularzAktualizowania = new FormularzAktualizowania(pojazd);

        assertSame(formularzAktualizowania.getTyp(), pojazd.getTyp(), "Niepoprawny typ");
        assertSame(formularzAktualizowania.getMarka(), pojazd.getMarka(), "Niepoprawna marka");
        assertSame(formularzAktualizowania.getModel(), pojazd.getModel(), "Niepoprawny model");
        assertSame(formularzAktualizowania.getSilnik(), pojazd.getSilnik(), "Niepoprawny silnik");
        assertEquals(formularzAktualizowania.getMoc(), pojazd.getMoc(), "Niepoprawna moc");
        assertEquals(formularzAktualizowania.getMoment_obrotowy(), pojazd.getMoment_obrotowy(), "Niepoprawny moment");
    }

    @Test
    @ExtendWith(KreatorFormularzyTest.class)
    void testExeption(){
        throw new IllegalFormatCodePointException(0x110000);
    }

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        if (throwable instanceof IllegalFormatCodePointException) {
            System.out.println("Złapano wyjątek IllegalFormatCodePointException: " + throwable.getMessage());
        } else {
            throw throwable;
        }
    }
}