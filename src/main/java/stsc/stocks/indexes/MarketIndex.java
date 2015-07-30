package stsc.stocks.indexes;

import stsc.stocks.meta.MarketIndexGroup;

/**
 * Interface for MarketIndex. WIll be implemented by all necessary market
 * indexes from financial business analysis topic.<br/>
 * For example {@link CountryMarketIndex}.<br/>
 */
public interface MarketIndex<E> extends Comparable<E> {

	public String getFilesystemName();

	public MarketIndexGroup getMarketIndexGroup();
}
