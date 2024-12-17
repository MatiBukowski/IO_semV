package Widok;

import Prezenter.FasadaPrezentera;

public class Main {
    public static void main(String[] args) {
        Panel[] panele = new Panel[] {new Panel(0), new Panel(1), new Panel(2)};

        FasadaWidoku fasadaWidoku = new FasadaWidoku(panele);

        FasadaPrezentera fasadaPrezentera = new FasadaPrezentera(fasadaWidoku);
    }
}