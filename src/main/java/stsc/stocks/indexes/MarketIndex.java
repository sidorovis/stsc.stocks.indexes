package stsc.stocks.indexes;

/**
 * Interface for MarketIndex. WIll be implemented by all necessary market
 * indexes from financial business analysis topic.<br/>
 * For example {@link CountryMarketIndex}.<br/>
 */
public interface MarketIndex<E> extends Comparable<E> {

	public String getFilesystemName();

}
