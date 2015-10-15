package stsc.stocks.indexes;

import static stsc.stocks.meta.MarketIndexGroup.GLOBAL;

import java.util.ArrayList;
import java.util.Comparator;

import stsc.common.stocks.UnitedFormatFilename;
import stsc.common.stocks.UnitedFormatHelper;
import stsc.stocks.meta.MarketIndexGroup;

/**
 * Global Market index descriptions.
 */
public final class GlobalMarketIndex implements MarketIndex<GlobalMarketIndex> {

	private static class ThisComparator implements Comparator<GlobalMarketIndex> {

		@Override
		public int compare(GlobalMarketIndex o1, GlobalMarketIndex o2) {
			return o1.getFilesystemName().getFilename().compareTo(o2.getFilesystemName().getFilename());
		}

	}

	private static ArrayList<GlobalMarketIndex> indexes;
	private static ThisComparator thisComparator = new ThisComparator();

	static {
		indexes = new ArrayList<>();
		indexes.add(new GlobalMarketIndex("MSCI", "Morgan Stanley Capital Inc."));
		indexes.add(new GlobalMarketIndex("IOO", "iShares Global 100 ETF (the Fnd), formerly iShares S&P Global 100 Index Fund, is an exchange-traded fund (ETF)."));
		indexes.add(new GlobalMarketIndex("^FTSE", "BBC Global 30, ^FTSE"));
		indexes.add(new GlobalMarketIndex("SPY", "SPDR S&P 500 ETF Trust (SPY)"));
		indexes.add(new GlobalMarketIndex("EFA", "iShares MSCI EAFE"));
		indexes.sort(thisComparator);
	}

	public static ArrayList<GlobalMarketIndex> getValues() {
		return indexes;
	}

	private final MarketIndexGroup marketIndexGroup;
	private final String instrumentName;
	private final UnitedFormatFilename fileName;
	private final String description;

	private GlobalMarketIndex(final String instrumentName, final String description) {
		this.marketIndexGroup = GLOBAL;
		this.instrumentName = instrumentName.toLowerCase();
		this.fileName = UnitedFormatHelper.toFilesystem(instrumentName.toLowerCase());
		this.description = description;
	}

	public static GlobalMarketIndex createForSearch(final String instrumentName) {
		return new GlobalMarketIndex(instrumentName, null);
	}

	public String getDescription() {
		return description;
	}

	@Override
	public int compareTo(GlobalMarketIndex o) {
		return thisComparator.compare(this, o);
	}

	@Override
	public String getInstrumentName() {
		return instrumentName;
	}

	@Override
	public UnitedFormatFilename getFilesystemName() {
		return fileName;
	}

	@Override
	public MarketIndexGroup getMarketIndexGroup() {
		return this.marketIndexGroup;
	}

}
