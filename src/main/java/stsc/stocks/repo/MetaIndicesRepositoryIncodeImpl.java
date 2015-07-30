package stsc.stocks.repo;

import java.util.ArrayList;
import java.util.List;

import stsc.stocks.indexes.CountryMarketIndex;
import stsc.stocks.indexes.GlobalMarketIndex;
import stsc.stocks.indexes.RegionMarketIndex;

/**
 * {@link MetaIndicesRepositoryIncodeImpl} is a repository implementation into
 * code.
 */
public class MetaIndicesRepositoryIncodeImpl implements MetaIndicesRepository {

	public List<GlobalMarketIndex> getGlobalMarketIndices() {
		final ArrayList<GlobalMarketIndex> result = new ArrayList<GlobalMarketIndex>();
		for (GlobalMarketIndex i : GlobalMarketIndex.values()) {
			result.add(i);
		}
		return result;
	}

	public List<RegionMarketIndex> getRegionMarketIndices() {
		final ArrayList<RegionMarketIndex> result = new ArrayList<RegionMarketIndex>();
		for (RegionMarketIndex i : RegionMarketIndex.values()) {
			result.add(i);
		}
		return result;
	}

	public List<CountryMarketIndex> getCountryMarketIndices() {
		final ArrayList<CountryMarketIndex> result = new ArrayList<CountryMarketIndex>();
		for (CountryMarketIndex i : CountryMarketIndex.getValues()) {
			result.add(i);
		}
		return result;
	}

}
