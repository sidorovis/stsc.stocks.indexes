package stsc.stocks.indexes;

import static stsc.stocks.MarketIndexGroup.REGIONAL;
import static stsc.stocks.Region.ASIA;
import stsc.stocks.MarketIndexGroup;
import stsc.stocks.Region;

/**
 * Market index description for {@link Region}.
 */
public enum RegionMarketIndex {

	AIA(REGIONAL, ASIA, "https://en.wikipedia.org/wiki/S%26P_Asia_50"), //
	ILF(REGIONAL, Region.LATIN_AMERICA, "iShares Latin America 40 (ILF)"), //
	;

	private final MarketIndexGroup marketIndexGroup;
	private final Region region;
	private final String description;

	private RegionMarketIndex(final MarketIndexGroup marketIndexGroup, final Region region, final String description) {
		this.marketIndexGroup = marketIndexGroup;
		this.region = region;
		this.description = description;
	}

	public MarketIndexGroup getMarketIndexGroup() {
		return marketIndexGroup;
	}

	public Region getWorldSector() {
		return region;
	}

	public String getDescription() {
		return description;
	}

}
