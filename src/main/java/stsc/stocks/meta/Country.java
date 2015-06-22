package stsc.stocks.meta;

/**
 * List of Countries.
 */
public enum Country {
	AUSTRALIA(Region.AUSTRALIA), //
	EGYPT(Region.AFRICA), //
	GREAT_BRITAIN(Region.EUROPE), //
	IZRAIL(Region.EUROPE), //
	JAPAN(Region.ASIA), //
	USA(Region.AMERICA), //
	;

	private final Region region;

	private Country(final Region region) {
		this.region = region;

	}

	public Region getRegion() {
		return region;
	}
}
