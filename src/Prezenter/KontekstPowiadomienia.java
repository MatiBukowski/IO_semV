package Prezenter;

public class KontekstPowiadomienia {

	public void KontekstPowiadomieniaSYS() {
		StrategiaTworzeniaPowiadomien strategia = new StrategiaPowiadamianaSystemowego();
		strategia.StworzPowiadomienie();
	}

	public void KontekstPowiadomieniaSMS() {
		StrategiaTworzeniaPowiadomien strategia = new StrategiaPowiadamianiaSMS();
		strategia.StworzPowiadomienie();
	}

}