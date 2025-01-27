package Prezenter;

import fit.ColumnFixture;

public class PowiadomienieFixture extends ColumnFixture{
    boolean decyzja;

    private Powiadomienie powiadomienie = new Powiadomienie(new KontekstPowiadomienia());


    public String PowiadomODostepnosci(){
        powiadomienie.PowiadomODostepnosci(decyzja);
        return powiadomienie.getWiadomosc();
    }

    public String PowiadomOPoprawnosciDok(){
        powiadomienie.PowiadomOPoprawnosciDok(decyzja);
        return powiadomienie.getWiadomosc();
    }

    public String PowiadomOTrzezwosci(){
        powiadomienie.PowiadomOTrzezwosci(decyzja);
        return powiadomienie.getWiadomosc();
    }
}
