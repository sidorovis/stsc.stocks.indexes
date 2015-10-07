package stsc.stocks.indexes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MarketIndexTest {

	@Test
	public void testMarketIndex() {
		final List<String> stockNames = new ArrayList<>();
		for (CountryMarketIndex mi : CountryMarketIndex.getValues()) {
			stockNames.add(mi.getInstrumentName());
		}
		for (GlobalMarketIndex mi : GlobalMarketIndex.getValues()) {
			stockNames.add(mi.getInstrumentName());
		}
		for (RegionMarketIndex mi : RegionMarketIndex.getValues()) {
			stockNames.add(mi.getInstrumentName());
		}
		for (int i = 0; i < stockNames.size(); ++i) {
			for (int u = i + 1; u < stockNames.size(); ++u) {
				Assert.assertNotEquals(stockNames.get(i), stockNames.get(u));
			}
		}
	}

	@Test
	public void testDowncaseInstrumentName() {
		Assert.assertTrue(0 < Collections.binarySearch(CountryMarketIndex.getValues(), CountryMarketIndex.createForSearch("aapl")));
		Assert.assertTrue(0 < Collections.binarySearch(CountryMarketIndex.getValues(), CountryMarketIndex.createForSearch("^dji")));
	}
}
