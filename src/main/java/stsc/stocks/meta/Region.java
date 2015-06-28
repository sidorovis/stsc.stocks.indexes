package stsc.stocks.meta;

/**
 * For example ASIA, EUROPE, AMERICA, AUSTRALIA...
 */
public enum Region {

	AFRICA("Magic continent"), //
	ASIA("Tadadada-ta-datatam."), //
	AUSTRALIA("Kangaroo home."), //
	EUROPE("Germany is there."), //
	NORTH_AMERICA("New Continent"), //
	SOUTH_AMERICA("Tequila!"), //
	;

	private final String description;

	private Region(String description) {
		this.description = description;

	}

	public String getDescription() {
		return description;
	}
}
