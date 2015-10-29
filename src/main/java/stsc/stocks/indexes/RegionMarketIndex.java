package stsc.stocks.indexes;

import static stsc.stocks.meta.MarketIndexGroup.REGIONAL;
import static stsc.stocks.meta.Region.ASIA;
import static stsc.stocks.meta.Region.EUROPE;
import static stsc.stocks.meta.Region.NORTH_AMERICA;
import static stsc.stocks.meta.Region.SOUTH_AMERICA;

import java.util.ArrayList;
import java.util.Comparator;

import stsc.common.stocks.united.format.UnitedFormatFilename;
import stsc.common.stocks.united.format.UnitedFormatHelper;
import stsc.stocks.meta.MarketIndexGroup;
import stsc.stocks.meta.Region;

/**
 * Market index description for {@link Region}.
 */
public final class RegionMarketIndex implements MarketIndex<RegionMarketIndex> {

	private static class ThisComparator implements Comparator<RegionMarketIndex> {

		@Override
		public int compare(RegionMarketIndex o1, RegionMarketIndex o2) {
			return o1.getFilesystemName().getFilename().compareTo(o2.getFilesystemName().getFilename());
		}

	}

	private static ArrayList<RegionMarketIndex> indexes;
	private static ThisComparator thisComparator = new ThisComparator();

	static {
		indexes = new ArrayList<>();
		indexes.add(new RegionMarketIndex("AIA", ASIA, "https://en.wikipedia.org/wiki/S%26P_Asia_50"));
		indexes.add(new RegionMarketIndex("^SSEC", ASIA, "Shanghai Composite"));
		indexes.add(new RegionMarketIndex("^BSESN", ASIA, "BSE 30"));
		indexes.add(new RegionMarketIndex("^JKSE", ASIA, "Jakarta Composite"));
		indexes.add(new RegionMarketIndex("^KLSE", ASIA, "KLSE Composite"));
		indexes.add(new RegionMarketIndex("^NZ50", ASIA, "NZX 50 INDEX GROSS"));
		indexes.add(new RegionMarketIndex("^KS11", ASIA, "Seoul Composite"));
		indexes.add(new RegionMarketIndex("^MERV", NORTH_AMERICA, "MerVal"));
		indexes.add(new RegionMarketIndex("^ATX", EUROPE, "Vienna"));
		indexes.add(new RegionMarketIndex("^BFX", EUROPE, "EURONEXT BEL-20. Brussels"));
		indexes.add(new RegionMarketIndex("^OSEAX", EUROPE, "OSLO EXCH ALL SHARE. Oslo"));
		indexes.add(new RegionMarketIndex("^MIBTEL", EUROPE, "Milan"));
		indexes.add(new RegionMarketIndex("^OMXSPI", EUROPE, "Stockholm General"));
		indexes.add(new RegionMarketIndex("^SSMI", EUROPE, "Swiss Market"));
		indexes.add(new RegionMarketIndex("FPXAAPR", EUROPE, "PX IND"));
		indexes.add(new RegionMarketIndex("MICEXINDEXCF.ME", EUROPE, "MICEXINDEXCF.ME MICEX Index"));
		indexes.add(new RegionMarketIndex("GD.AT", EUROPE, "GD.AT Athex Composite Share Price Index"));
		indexes.add(new RegionMarketIndex("ILF", SOUTH_AMERICA, "iShares Latin America 40"));

		indexes.sort(thisComparator);
	}

	public static ArrayList<RegionMarketIndex> getValues() {
		return indexes;
	}

	private final MarketIndexGroup marketIndexGroup;
	private final String instrumentName;
	private final UnitedFormatFilename fileName;
	private final Region region;
	private final String description;

	private RegionMarketIndex(final String instrumentName, final Region region, final String description) {
		this.marketIndexGroup = REGIONAL;
		this.instrumentName = instrumentName.toLowerCase();
		this.fileName = UnitedFormatHelper.toFilesystem(instrumentName.toLowerCase());
		this.region = region;
		this.description = description;
	}

	public static RegionMarketIndex createForSearch(final String instrumentName) {
		return new RegionMarketIndex(instrumentName, null, null);
	}

	@Override
	public String getInstrumentName() {
		return instrumentName;
	}

	@Override
	public UnitedFormatFilename getFilesystemName() {
		return fileName;
	}

	public Region getWorldSector() {
		return region;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public int compareTo(RegionMarketIndex o) {
		return thisComparator.compare(this, o);
	}

	@Override
	public MarketIndexGroup getMarketIndexGroup() {
		return marketIndexGroup;
	}

}
