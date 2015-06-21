package stsc.stocks.indexes;

import static stsc.stocks.meta.Country.AUSTRALIA;
import static stsc.stocks.meta.Country.EGYPT;
import static stsc.stocks.meta.Country.GREAT_BRITAIN;
import static stsc.stocks.meta.Country.IZRAIL;
import static stsc.stocks.meta.Country.JAPAN;
import static stsc.stocks.meta.Country.USA;
import static stsc.stocks.meta.MarketIndexGroup.NATIONAL;
import stsc.stocks.meta.Country;
import stsc.stocks.meta.MarketIndexGroup;

/**
 * Market index description for {@link Country}.
 */
public enum CountryMarketIndex {

	ASX(AUSTRALIA, "https://en.wikipedia.org/wiki/Australian_Securities_Exchange"), //

	_094CCSI(EGYPT, "EGX 70 PRICE INDEX"), //

	UKX(GREAT_BRITAIN, "FTSE 100, https://en.wikipedia.org/wiki/FTSE_100_Index"), //

	TA100(IZRAIL, "TEL AVIV TA-100 IND. Tel Aviv"), //

	N225(JAPAN, "Nikkei 225."), //
	OSCUF(JAPAN, "OTCMKTS:OSCUF. Osaka Securities Exchange Co Ltd"), //

	CBOE(USA,
			"The CBOE Volatility Index® (VIX®) is a key measure of market expectations of near-term volatility conveyed by S&P 500 stock index option prices."), //
	GSPCX(USA, "The investment seeks long-term growth of capital."), //
	SPX(USA, "S&P 500 INDEX(INDEXCBOE:SPX)"), //
	VIX(USA, "VOLATILITY S&P 500 (^VIX)."), //
	XAX(USA, "NYSE AMEX COMPOSITE INDEX"), //
	_094DJI(USA, "Dow Jones Industrial Average"), //
	_094GSPC(USA, "S&P 500"), //
	_094NYA(USA, "NYSE COMPOSITE"), //
	_094GSPTSE(USA, "S&P/TSX Composite index"), //

	//
	;

	private final MarketIndexGroup marketIndexGroup;
	private final Country country;
	private final String description;

	private CountryMarketIndex(final Country country, final String description) {
		this.marketIndexGroup = NATIONAL;
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
