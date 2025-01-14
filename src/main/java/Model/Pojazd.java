package Model;

public class Pojazd {

	private int id_sprzetu;
	private String rodzaj;
	private String typ;
	private String silnik;
	private boolean status_dostepnosci;
	private String marka;
	private String model;
	private int moc;
	private int moment_obrotowy;

	public Pojazd() {}

	public int getId_sprzetu() {
		return this.id_sprzetu;
	}

	public String getRodzaj() {
		return rodzaj;
	}

	public String getTyp() {
		return typ;
	}

	public String getSilnik() {
		return silnik;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public void setSilnik(String silnik) {
		this.silnik = silnik;
	}

	public void setId_sprzetu(int id_sprzetu) {
		this.id_sprzetu = id_sprzetu;
	}

	public boolean getStatus_dostepnosci() {
		return this.status_dostepnosci;
	}

	public void setStatus_dostepnosci(boolean status_dostepnosci) {
		this.status_dostepnosci = status_dostepnosci;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}

	public int getMoment_obrotowy() {
		return moment_obrotowy;
	}

	public void setMoment_obrotowy(int moment_obrotowy) {
		this.moment_obrotowy = moment_obrotowy;
	}
}