
public class Rennwagen {

	private boolean defekt;
	private String pilot;

	private static int anzahlRennwagen;
	public final int rennwagenNummer;

	public Rennwagen(boolean defekt, String pilot) {
		this.rennwagenNummer = anzahlRennwagen++;
		this.defekt = defekt;
		this.pilot = pilot;

	}

}
