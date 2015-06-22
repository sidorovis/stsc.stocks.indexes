package stsc.stocks.repo;

import java.util.List;

import stsc.stocks.indexes.CountryMarketIndex;
import stsc.stocks.indexes.GlobalMarketIndex;
import stsc.stocks.indexes.RegionMarketIndex;

/**
 * {@link MetaIndicesRepository} is a repository for meta indices.
 */
public interface MetaIndicesRepository {

	public List<GlobalMarketIndex> getGlobalMarketIndices();

	public List<RegionMarketIndex> getRegionMarketIndices();

	public List<CountryMarketIndex> getCountryMarketIndices();

}
