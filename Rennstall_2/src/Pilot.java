
public class Pilot extends Teammitglied {

	private int pilotenNummer;
	private int anzahlSiege;

	public Pilot(String name, String vorname, String nationalitaet, int pilotenNummer, int anzahlSiege) {
		super(name, vorname, nationalitaet);
		this.pilotenNummer = pilotenNummer;
		this.anzahlSiege = anzahlSiege;
	}

}
