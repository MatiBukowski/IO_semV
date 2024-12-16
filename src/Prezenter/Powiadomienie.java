package Prezenter;

public class Powiadomienie {

	private KontekstPowiadomienia kontekstPowiadomienia;

	public void PowiadomSYS() {
		KontekstPowiadomienia kontekstPowiadomienia = new KontekstPowiadomienia();

		kontekstPowiadomienia.KontekstPowiadomieniaSYS();
	}

	public void PowiadomSMS() {
		KontekstPowiadomienia kontekstPowiadomienia = new KontekstPowiadomienia();

		kontekstPowiadomienia.KontekstPowiadomieniaSMS();
	}

	public Powiadomienie() {
		// TODO - implement Powiadomienie.Powiadomienie
		throw new UnsupportedOperationException();
	}

}