package Prezenter;

public class StrategiaPowiadamianaSystemowego implements StrategiaTworzeniaPowiadomien {

	@Override
	public void WyslijPowiadomienie(String wiadomosc) {
		System.out.println("Powiadomienie systemowe: " + wiadomosc);
	}

}