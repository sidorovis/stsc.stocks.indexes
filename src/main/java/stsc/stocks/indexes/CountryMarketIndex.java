package stsc.stocks.indexes;

import static stsc.stocks.Country.AUSTRALIA;
import static stsc.stocks.Country.GREAT_BRITAIN;
import static stsc.stocks.Country.JAPAN;
import static stsc.stocks.Country.USA;
import static stsc.stocks.MarketIndexGroup.NATIONAL;
import stsc.stocks.Country;
import stsc.stocks.MarketIndexGroup;

/**
 * Market index description for {@link Country}.
 */
public enum CountryMarketIndex {

	GSPCX(NATIONAL, USA, "The investment seeks long-term growth of capital."), //
	SPX(NATIONAL, USA, "S&P 500 INDEX(INDEXCBOE:SPX)"), //
	INX(NATIONAL, USA, "S&P 500 INDEX(INDEXSP:.INX)"), //
	N225(NATIONAL, JAPAN, "Nikkei 225."), //
	OSCUF(NATIONAL, JAPAN, "OTCMKTS:OSCUF. Osaka Securities Exchange Co Ltd"), //
	UKX(NATIONAL, GREAT_BRITAIN, "FTSE 100, https://en.wikipedia.org/wiki/FTSE_100_Index"), //
	CBOE(NATIONAL, USA,
			"The CBOE Volatility Index® (VIX®) is a key measure of market expectations of near-term volatility conveyed by S&P 500 stock index option prices."), //
	VIX(NATIONAL, USA, "VOLATILITY S&P 500 (^VIX)."), //
	ASX(NATIONAL, AUSTRALIA, "https://en.wikipedia.org/wiki/Australian_Securities_Exchange")
	//
	;

	private final MarketIndexGroup marketIndexGroup;
	private final Country country;
	private final String description;

	private CountryMarketIndex(final MarketIndexGroup marketIndexGroup, final Country country, final String description) {
		this.marketIndexGroup = marketIndexGroup;
		this.country = country;
		this.description = description;
	}

	public MarketIndexGroup getMarketIndexGroup() {
		return marketIndexGroup;
	}

	public Country getCountry() {
		return country;
	}

	public String getDescription() {
		return description;
	}

}
