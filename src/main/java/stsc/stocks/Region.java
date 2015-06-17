package stsc.stocks;

/**
 * For example ASIA, EUROPE, AMERICA, AUSTRALIA...
 */
public enum Region {

	ASIA("Tadadada-ta-datatam."), //
	EUROPE("Germany is there."), //
	LATIN_AMERICA("Tequila!"), //
	AUSTRALIA("Kangaroo home."), //
	;

	private final String description;

	private Region(String description) {
		this.description = description;

	}

	public String getDescription() {
		return description;
	}
}
