package Prezenter;

public class StrategiaPowiadamianiaSMS implements StrategiaTworzeniaPowiadomien {

	private int nr_telefonu;

	@Override
	public void WyslijPowiadomienie(String wiadomosc) {
		System.out.println("Powiadomienie SMS: " + wiadomosc);
	}

}