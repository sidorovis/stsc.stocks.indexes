package stsc.stocks.indexes;

import static stsc.stocks.MarketIndexGroup.GLOBAL;
import stsc.stocks.MarketIndexGroup;

/**
 * Global Market index descriptions.
 */
public enum GlobalMarketIndex {

	MSCI(GLOBAL, "Morgan Stanley Capital Inc."), //
	IOO(GLOBAL, "iShares Global 100 ETF (the Fund), formerly iShares S&P Global 100 Index Fund, is an exchange-traded fund (ETF)."), //
	//
	;
	private final MarketIndexGroup marketIndexGroup;
	private final String description;

	private GlobalMarketIndex(final MarketIndexGroup marketIndexGroup, final String description) {
		this.marketIndexGroup = marketIndexGroup;
		this.description = description;
	}

	public MarketIndexGroup getMarketIndexGroup() {
		return marketIndexGroup;
	}

	public String getDescription() {
		return description;
	}

}
