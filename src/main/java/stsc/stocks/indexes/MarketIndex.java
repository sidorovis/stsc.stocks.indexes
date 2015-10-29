package stsc.stocks.indexes;

import stsc.common.stocks.united.format.UnitedFormatFilename;
import stsc.stocks.meta.MarketIndexGroup;

/**
 * Interface for MarketIndex. WIll be implemented by all necessary market
 * indexes from financial business analysis topic.<br/>
 * For example {@link CountryMarketIndex}.<br/>
 */
public interface MarketIndex<E> extends Comparable<E> {

	public String getInstrumentName();

	public UnitedFormatFilename getFilesystemName();

	public MarketIndexGroup getMarketIndexGroup();
}
