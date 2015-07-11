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

	FPXAAPR(EUROPE, "PX IND (FPXAA.PR) -Prague", "FPXAA.PR"), //
	MICEXINDEXCFMEINDEX(EUROPE, "MICEXINDEXCF.ME MICEX Index", "MICEXINDEXCF.ME"), //
	GDATINDEX(EUROPE, "GD.AT Athex Composite Share Price Index", "GD.AT"), //

	ILF(SOUTH_AMERICA, "iShares Latin America 40 (ILF)"), //
	;

	private final MarketIndexGroup marketIndexGroup;
	private final Region region;
	private final String description;
	private final String downloadLink;

	private RegionMarketIndex(final Region region, final String description) {
		this.marketIndexGroup = REGIONAL;
		this.region = region;
		this.description = description;
		this.downloadLink = name();
	}

	private RegionMarketIndex(final Region region, final String description, final String downloadLink) {
		this.marketIndexGroup = REGIONAL;
		this.region = region;
		this.description = description;
		this.downloadLink = downloadLink;
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

	public String getDownloadLink() {
		return downloadLink;
	}

}
