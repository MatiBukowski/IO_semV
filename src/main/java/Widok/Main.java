package Widok;

import Model.FasadaZwracaniaPojazdu;
import Prezenter.FasadaPrezentera;

public class Main {
    public static void main(String[] args) {
        Panel[] panele = new Panel[] {new Panel(0), new Panel(1), new Panel(2), new Panel(3)};

        FasadaWidoku fasadaWidoku = new FasadaWidoku(panele);
        FasadaZwracaniaPojazdu fasadaZwracaniaPojazdu = new FasadaZwracaniaPojazdu();

        FasadaPrezentera fasadaPrezentera = new FasadaPrezentera(fasadaWidoku, fasadaZwracaniaPojazdu);
    }
}