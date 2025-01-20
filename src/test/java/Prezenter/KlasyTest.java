package Prezenter;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        KreatorFormularzyTest.class,
        PowiadomienieTest.class,
        WeryfikacjaDokumentowTest.class,
        FasadaPrezenteraTest.class
})
@IncludeTags({"Formularz", "Powiadomienie", "Weryfikacja"})
@ExcludeTags({"Fasada"})
public class KlasyTest {
}
