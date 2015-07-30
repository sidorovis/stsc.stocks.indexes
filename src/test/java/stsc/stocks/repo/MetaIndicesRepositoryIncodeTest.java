package stsc.stocks.repo;

import org.junit.Assert;
import org.junit.Test;

import stsc.stocks.indexes.CountryMarketIndex;
import stsc.stocks.indexes.GlobalMarketIndex;
import stsc.stocks.indexes.RegionMarketIndex;

public class MetaIndicesRepositoryIncodeTest {

	@Test
	public void metaIndicesRepositoryIncodeTest() {
		final MetaIndicesRepository repo = new MetaIndicesRepositoryIncodeImpl();
		Assert.assertNotNull(repo.getCountryMarketIndices());
		Assert.assertNotNull(repo.getGlobalMarketIndices());
		Assert.assertNotNull(repo.getRegionMarketIndices());

		Assert.assertEquals(CountryMarketIndex.getValues().size(), repo.getCountryMarketIndices().size());
		Assert.assertEquals(GlobalMarketIndex.values().length, repo.getGlobalMarketIndices().size());
		Assert.assertEquals(RegionMarketIndex.values().length, repo.getRegionMarketIndices().size());
	}

}
