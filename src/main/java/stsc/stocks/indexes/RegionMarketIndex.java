package stsc.stocks.indexes;

import static stsc.stocks.meta.MarketIndexGroup.REGIONAL;
import static stsc.stocks.meta.Region.ASIA;
import static stsc.stocks.meta.Region.EUROPE;
import static stsc.stocks.meta.Region.NORTH_AMERICA;
import static stsc.stocks.meta.Region.SOUTH_AMERICA;

import java.util.ArrayList;
import java.util.Comparator;

import stsc.stocks.meta.MarketIndexGroup;
import stsc.stocks.meta.Region;

/**
 * Market index description for {@link Region}.
 */
public final class RegionMarketIndex implements MarketIndex<RegionMarketIndex> {

	private static class ThisComparator implements Comparator<RegionMarketIndex> {

		@Override
		public int compare(RegionMarketIndex o1, RegionMarketIndex o2) {
			return o1.getFilesystemName().compareTo(o2.getFilesystemName());
		}

	}

	private static ArrayList<RegionMarketIndex> indexes;
	private static ThisComparator thisComparator = new ThisComparator();

	static {
		indexes = new ArrayList<>();
		indexes.add(new RegionMarketIndex("AIA", ASIA, "https://en.wikipedia.org/wiki/S%26P_Asia_50"));
		indexes.add(new RegionMarketIndex("_094SSEC", ASIA, "Shanghai Composite"));
		indexes.add(new RegionMarketIndex("_094BSESN", ASIA, "BSE 30"));
		indexes.add(new RegionMarketIndex("_094JKSE", ASIA, "Jakarta Composite"));
		indexes.add(new RegionMarketIndex("_094KLSE", ASIA, "KLSE Composite"));
		indexes.add(new RegionMarketIndex("_094NZ50", ASIA, "NZX 50 INDEX GROSS"));
		indexes.add(new RegionMarketIndex("_094KS11", ASIA, "Seoul Composite"));
		indexes.add(new RegionMarketIndex("_094MERV", NORTH_AMERICA, "MerVal"));
		indexes.add(new RegionMarketIndex("_094ATX", EUROPE, "Vienna"));
		indexes.add(new RegionMarketIndex("_094BFX", EUROPE, "EURONEXT BEL-20. Brussels"));
		indexes.add(new RegionMarketIndex("_094OSEAX", EUROPE, "OSLO EXCH ALL SHARE. Oslo"));
		indexes.add(new RegionMarketIndex("_094MIBTEL", EUROPE, "Milan"));
		indexes.add(new RegionMarketIndex("_094OMXSPI", EUROPE, "Stockholm General"));
		indexes.add(new RegionMarketIndex("_094SSMI", EUROPE, "Swiss Market"));
		indexes.add(new RegionMarketIndex("FPXAAPR", EUROPE, "PX IND"));
		indexes.add(new RegionMarketIndex("MICEXINDEXCFMEINDEX", EUROPE, "MICEXINDEXCF.ME MICEX Index", "MICEXINDEXCF.ME"));
		indexes.add(new RegionMarketIndex("GDATINDEX", EUROPE, "GD.AT Athex Composite Share Price Index", "GD.AT"));
		indexes.add(new RegionMarketIndex("ILF", SOUTH_AMERICA, "iShares Latin America 40"));

		indexes.sort(thisComparator);
	}

	public static ArrayList<RegionMarketIndex> getValues() {
		return indexes;
	}

	private final MarketIndexGroup marketIndexGroup;
	private final String filesystemName;
	private final Region region;
	private final String description;
	private final String downloadLink;

	private RegionMarketIndex(final String filesystemName, final Region region, final String description) {
		this(filesystemName, region, description, filesystemName);
	}

	private RegionMarketIndex(final String filesystemName, final Region region, final String description, final String downloadLink) {
		this.filesystemName = filesystemName.toLowerCase();
		this.marketIndexGroup = REGIONAL;
		this.region = region;
		this.description = description;
		this.downloadLink = this.filesystemName;
	}

	public static RegionMarketIndex createForSearch(final String fileSystemName) {
		return new RegionMarketIndex(fileSystemName, null, null);
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

	@Override
	public int compareTo(RegionMarketIndex o) {
		return thisComparator.compare(this, o);
	}

	@Override
	public String getFilesystemName() {
		return filesystemName;
	}

	@Override
	public MarketIndexGroup getMarketIndexGroup() {
		return marketIndexGroup;
	}

}
