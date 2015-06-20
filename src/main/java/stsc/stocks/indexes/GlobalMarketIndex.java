package stsc.stocks.indexes;

import static stsc.stocks.meta.MarketIndexGroup.GLOBAL;
import stsc.stocks.meta.MarketIndexGroup;

/**
 * Global Market index descriptions.
 */
public enum GlobalMarketIndex {

	MSCI("Morgan Stanley Capital Inc."), //
	IOO("iShares Global 100 ETF (the Fund), formerly iShares S&P Global 100 Index Fund, is an exchange-traded fund (ETF)."), //
	_094FTSE("BBC Global 30, ^FTSE"), // _094 -> ^ (^FTSE)
	EFA("iShares MSCI EAFE"), //
	//
	;
	private final MarketIndexGroup marketIndexGroup;
	private final String description;

	private GlobalMarketIndex(final String description) {
		this.marketIndexGroup = GLOBAL;
		this.description = description;
	}

	public MarketIndexGroup getMarketIndexGroup() {
		return marketIndexGroup;
	}

	public String getDescription() {
		return description;
	}

}
