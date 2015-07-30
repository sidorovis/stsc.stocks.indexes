package stsc.stocks.indexes;

import static stsc.stocks.meta.MarketIndexGroup.GLOBAL;

import java.util.ArrayList;
import java.util.Comparator;

import stsc.stocks.meta.MarketIndexGroup;

/**
 * Global Market index descriptions.
 */
public class GlobalMarketIndex implements MarketIndex<GlobalMarketIndex> {

	private static class ThisComparator implements Comparator<GlobalMarketIndex> {

		@Override
		public int compare(GlobalMarketIndex o1, GlobalMarketIndex o2) {
			return o1.getFilesystemName().compareTo(o2.getFilesystemName());
		}

	}

	private static ArrayList<GlobalMarketIndex> indexes;
	private static ThisComparator thisComparator = new ThisComparator();

	static {
		indexes = new ArrayList<>();
		indexes.add(new GlobalMarketIndex("MSCI", "Morgan Stanley Capital Inc."));
		indexes.add(new GlobalMarketIndex("IOO",
				"iShares Global 100 ETF (the Fnd), formerly iShares S&P Global 100 Index Fund, is an exchange-traded fund (ETF)."));
		indexes.add(new GlobalMarketIndex("_094FTSE", "BBC Global 30, ^FTSE")); // _094
																				// ->
																				// ^
																				// (^FTSE)
		indexes.add(new GlobalMarketIndex("EFA", "iShares MSCI EAFE"));
		indexes.sort(thisComparator);
	}

	public static ArrayList<GlobalMarketIndex> getValues() {
		return indexes;
	}

	private final MarketIndexGroup marketIndexGroup;
	private final String filesystemName;
	private final String description;

	private GlobalMarketIndex(final String filesystemName, final String description) {
		this.marketIndexGroup = GLOBAL;
		this.filesystemName = filesystemName.toLowerCase();
		this.description = description;
	}

	public MarketIndexGroup getMarketIndexGroup() {
		return marketIndexGroup;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public int compareTo(GlobalMarketIndex o) {
		return thisComparator.compare(this, o);
	}

	@Override
	public String getFilesystemName() {
		return filesystemName;
	}

}
