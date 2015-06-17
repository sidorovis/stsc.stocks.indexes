package stsc.stocks;

/**
 * Market index group. (For example 'Global', 'National').<br/>
 * see https://en.wikipedia.org/wiki/List_of_stock_market_indices
 */
public enum MarketIndexGroup {

	GLOBAL("Stock Market Index without regard for where they are traded."), //
	REGIONAL("Stock Market Index that has specifix/region/city related data mapping."), //
	NATIONAL("Stock Market Index that has specific/country related data mapping."), //
	;

	private final String description;

	private MarketIndexGroup(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
