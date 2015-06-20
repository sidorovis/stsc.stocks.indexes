package stsc.stocks.indexes;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MarketIndexTest {

	@Test
	public void testMarketIndex() {
		final List<String> stockNames = new ArrayList<>();
		for (CountryMarketIndex mi : CountryMarketIndex.values()) {
			stockNames.add(mi.name());
		}
		for (GlobalMarketIndex mi : GlobalMarketIndex.values()) {
			stockNames.add(mi.name());
		}
		for (RegionMarketIndex mi : RegionMarketIndex.values()) {
			stockNames.add(mi.name());
		}
		for (int i = 0; i < stockNames.size(); ++i) {
			for (int u = i + 1; u < stockNames.size(); ++u) {
				Assert.assertNotEquals(stockNames.get(i), stockNames.get(u));
			}
		}
	}

}
