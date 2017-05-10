
public class Rennstall {

	private String teamname;
	private String sponsor;
	
	private Teammitglied[] mengeTeammitglieder = new Teammitglied[5];
	private Rennwagen[] mengeRennwagen = new Rennwagen[3];


	public Rennstall(String teamname, String sponsor) {
		this.teamname = teamname;
		this.sponsor = sponsor;
	}

}
