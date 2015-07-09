package stsc.stocks.indexes;

import static stsc.stocks.meta.MarketIndexGroup.REGIONAL;
import static stsc.stocks.meta.Region.NORTH_AMERICA;
import static stsc.stocks.meta.Region.ASIA;
import static stsc.stocks.meta.Region.EUROPE;
import static stsc.stocks.meta.Region.SOUTH_AMERICA;
import stsc.stocks.meta.MarketIndexGroup;
import stsc.stocks.meta.Region;

/**
 * Market index description for {@link Region}.
 */
public enum RegionMarketIndex {

	AIA(ASIA, "https://en.wikipedia.org/wiki/S%26P_Asia_50"), //
	_094SSEC(ASIA, "Shanghai Composite"), //
	_094BSESN(ASIA, "BSE 30"), //
	_094JKSE(ASIA, "Jakarta Composite"), //
	_094KLSE(ASIA, "KLSE Composite"), //
	_094NZ50(ASIA, "NZX 50 INDEX GROSS"), //
	_094KS11(ASIA, "Seoul Composite"), //

	_094MERV(NORTH_AMERICA, "MerVal"), //

	_094ATX(EUROPE, "Vienna"), //
	_094BFX(EUROPE, "EURONEXT BEL-20. Brussels"), //
	_094OSEAX(EUROPE, "OSLO EXCH ALL SHARE. Oslo"), //
	_094MIBTEL(EUROPE, "Milan"), //
	_094OMXSPI(EUROPE, "Stockholm General"), //
	_094SSMI(EUROPE, "Swiss Market"), //

	/*
	 * FPXAA.PR PX Index 975.50 //
	 * 
	 * MICEXINDEXCF.ME MICEX Index 1,663.03 //
	 * 
	 * GD.AT Athex Composite Share Price Index 687.33
	 */

	ILF(SOUTH_AMERICA, "iShares Latin America 40 (ILF)"), //
	;

	private final MarketIndexGroup marketIndexGroup;
	private final Region region;
	private final String description;

	private RegionMarketIndex(final Region region, final String description) {
		this.marketIndexGroup = REGIONAL;
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
