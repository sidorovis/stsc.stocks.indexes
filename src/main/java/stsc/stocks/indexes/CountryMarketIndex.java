package stsc.stocks.indexes;

import static stsc.stocks.meta.Country.AUSTRALIA;
import static stsc.stocks.meta.Country.BRAZIL;
import static stsc.stocks.meta.Country.CHINA;
import static stsc.stocks.meta.Country.EGYPT;
import static stsc.stocks.meta.Country.FRANCE;
import static stsc.stocks.meta.Country.GERMANY;
import static stsc.stocks.meta.Country.HONG_KONG;
import static stsc.stocks.meta.Country.ISRAEL;
import static stsc.stocks.meta.Country.JAPAN;
import static stsc.stocks.meta.Country.MEXICO;
import static stsc.stocks.meta.Country.SINGAPORE;
import static stsc.stocks.meta.Country.TAIWAN;
import static stsc.stocks.meta.Country.UNITED_KINGDOM;
import static stsc.stocks.meta.Country.USA;
import static stsc.stocks.meta.MarketIndexGroup.NATIONAL;

import java.util.ArrayList;
import java.util.Comparator;

import stsc.common.stocks.united.format.UnitedFormatFilename;
import stsc.common.stocks.united.format.UnitedFormatHelper;
import stsc.stocks.meta.Country;
import stsc.stocks.meta.MarketIndexGroup;

/**
 * Market index description for {@link Country}.
 */
public final class CountryMarketIndex implements MarketIndex<CountryMarketIndex> {

	private static class ThisComparator implements Comparator<CountryMarketIndex> {

		@Override
		public int compare(CountryMarketIndex o1, CountryMarketIndex o2) {
			return o1.getFilesystemName().getFilename().compareTo(o2.getFilesystemName().getFilename());
		}
	}

	private static ArrayList<CountryMarketIndex> indexes;
	private static ThisComparator thisComparator = new ThisComparator();

	static {
		indexes = new ArrayList<>();
		indexes.add(create("ASX", AUSTRALIA, "https://en.wikipedia.org/wiki/Australian_Securities_Exchange"));
		indexes.add(create("^CCSI", EGYPT, "EGX 70 PRICE INDEX"));
		indexes.add(create("UKX", UNITED_KINGDOM, "FTSE 100"));
		indexes.add(create("TA100", ISRAEL, "TEL AVIV TA-100 IND. Tel Aviv"));
		indexes.add(create("OSCUF", JAPAN, "OTCMKTS:OSCUF. Osaka Securities Exchange Co Ltd"));
		indexes.add(create("N225", JAPAN, "Nikkei 225."));
		indexes.add(create("CBOE", USA, "The CBOE Volatility Index"));
		indexes.add(create("GSPCX", USA, "The investment seeks long-term growth of capital."));
		indexes.add(create("VIX", USA, "VOLATILITY S&P 500"));
		indexes.add(create("SPX", USA, "S&P 500 INDEX"));
		indexes.add(create("XAX", USA, "NYSE AMEX COMPOSITE INDEX"));
		indexes.add(create("^DJI", USA, "Dow Jones Industrial Average"));
		indexes.add(create("^GSPC", USA, "S&P 500"));
		indexes.add(create("^GSPTSE", USA, "S&P/TSX Composite index"));
		indexes.add(create("^NYA", USA, "NYSE COMPOSITE"));
		indexes.add(create("^IXIC", USA, "Nasdaq"));
		indexes.add(create("^BVSP", BRAZIL, "Bovespa"));
		indexes.add(create("^MXX", MEXICO, "IPC"));
		indexes.add(create("^FCHI", FRANCE, "CAC 41"));
		indexes.add(create("^GDAXI", GERMANY, "DAX"));
		indexes.add(create("^AORD", AUSTRALIA, "All Ordinaries"));
		indexes.add(create("^N225", JAPAN, "Nikkei 225."));
		indexes.add(create("^HSI", HONG_KONG, "Hang Seng"));
		indexes.add(create("^STI", SINGAPORE, "Straits Times"));
		indexes.add(create("^TWII", TAIWAN, "Taiwan Weighted"));
		indexes.add(create("AAPL", USA, "Apple Inc."));
		indexes.add(create("AXP", USA, "American Express Company"));
		indexes.add(create("BA", USA, "The Boeing Company"));
		indexes.add(create("CAT", USA, "Caterpillar Inc."));
		indexes.add(create("CSCO", USA, "Cisco Systems"));
		indexes.add(create("CVX", USA, "Chevron Corporation"));
		indexes.add(create("DD", USA, "E. I. du Pont de Nemours and Company"));
		indexes.add(create("DIS", USA, "The Walt Disney Company"));
		indexes.add(create("GE", USA, "General Electric Company"));
		indexes.add(create("GS", USA, "The Goldman Sachs Group"));
		indexes.add(create("HD", USA, "The Home Depot"));
		indexes.add(create("IBM", USA, "International Business Machines Corporation"));
		indexes.add(create("INTC", USA, "Intel Corporation"));
		indexes.add(create("JNJ", USA, "Johnson & Johnson"));
		indexes.add(create("JPM", USA, "JPMorgan Chase & Co."));
		indexes.add(create("KO", USA, "The Coca-Cola Company"));
		indexes.add(create("MCD", USA, "McDonald's Corp."));
		indexes.add(create("MMM", USA, "3M Company"));
		indexes.add(create("MRK", USA, "Merck & Co. Inc."));
		indexes.add(create("MSFT", USA, "Microsoft Corporation"));
		indexes.add(create("NKE", USA, "NIKE"));
		indexes.add(create("PFE", USA, "Pfizer Inc."));
		indexes.add(create("PG", USA, "The Procter & Gamble Company"));
		indexes.add(create("TRV", USA, "The Travelers Companies"));
		indexes.add(create("UNH", USA, "UnitedHealth Group Incorporated"));
		indexes.add(create("UTX", USA, "United Technologies Corporation"));
		indexes.add(create("V", USA, "Visa Inc."));
		indexes.add(create("VZ", USA, "Verizon Communications Inc."));
		indexes.add(create("WMT", USA, "Wal-Mart Stores Inc."));
		indexes.add(create("XOM", USA, "Exxon Mobil Corporation"));
		indexes.add(create("ADBE", USA, "ADOBE SYSTEMS INC"));
		indexes.add(create("ADCT", USA, "ADC TELECOMMUNICATIONS INC"));
		indexes.add(create("AMAT", USA, "APPLIED MATERIALS"));
		indexes.add(create("BRCM", USA, "BROADCOM CORP."));
		indexes.add(create("CA", USA, "COMPUTER ASSOCIATES INTERNATIONAL"));
		indexes.add(create("CSC", USA, "COMPUTER SCIENCES CORP"));
		indexes.add(create("DELL", USA, "DELL INC."));
		indexes.add(create("EMC", USA, "EMC CORP."));
		indexes.add(create("HPQ", USA, "HEWLETT PACKARD CO"));
		indexes.add(create("INFY", USA, "INFOSYS TECHNOLOGIES LTD"));
		indexes.add(create("JAVA", USA, "SUN MICROSYSTEMS"));
		indexes.add(create("LLTC", USA, "LINEAR TECHNOLOGY CORP."));
		indexes.add(create("MOT", USA, "MOTOROLA INC"));
		indexes.add(create("MU", USA, "MICRON TECHNOLOGY INC"));
		indexes.add(create("ORCL", USA, "ORACLE CORPORATION"));
		indexes.add(create("PALM", USA, "PALM"));
		indexes.add(create("PMTC", USA, "PARAMETRIC TECHNOLOGY CORP"));
		indexes.add(create("QCOM", USA, "QUALCOMM"));
		indexes.add(create("SNPS", USA, "SYNOPSYS INC"));
		indexes.add(create("SYMC", USA, "SYMANTEC CORP."));
		indexes.add(create("TLAB", USA, "TELLABS INC"));
		indexes.add(create("TWX", USA, "TIME WARNER"));
		indexes.add(create("TXN", USA, "TEXAS INSTRUMENTS"));
		indexes.add(create("XLNX", USA, "XILINX INC"));
		indexes.add(create("YHOO", USA, "YAHOO! INC."));
		indexes.add(create("FOXA", USA, "21ST CENTRY FOX A CM"));
		indexes.add(create("FOX", USA, "21ST CENTRY FOX B CM"));
		indexes.add(create("ATVI", USA, "ACTIVISION BLIZZARD"));
		indexes.add(create("AKAM", USA, "AKAMAI TECHNOLOGIES"));
		indexes.add(create("ALXN", USA, "ALEXION PHARM INC"));
		indexes.add(create("ALTR", USA, "ALTERA CORP"));
		indexes.add(create("AMZN", USA, "AMAZON.COM INC"));
		indexes.add(create("AAL", USA, "AMERICAN AIRLINES GP"));
		indexes.add(create("AMGN", USA, "AMGEN"));
		indexes.add(create("ADI", USA, "ANALOG DEVICES CMN"));
		indexes.add(create("ADSK", USA, "AUTODESK INC"));
		indexes.add(create("ADP", USA, "AUTOMATIC DATA PROCS"));
		indexes.add(create("AVGO", USA, "AVAGO TECHNOLOGIES L"));
		indexes.add(create("BIDU", USA, "BAIDU"));
		indexes.add(create("BBBY", USA, "BED BATH & BEYOND"));
		indexes.add(create("BIIB", USA, "BIOGEN INC CMN"));
		indexes.add(create("CHRW", USA, "C.H. ROBINSON WW"));
		indexes.add(create("CTRX", USA, "CATAMARAN CORPORATIO"));
		indexes.add(create("CELG", USA, "CELGENE CORP"));
		indexes.add(create("CERN", USA, "CERNER CORP"));
		indexes.add(create("CHTR", USA, "CHARTER COMMUNICATIO"));
		indexes.add(create("CHKP", USA, "CHECK POINT SOFTWARE"));
		indexes.add(create("CTXS", USA, "CITRIX SYSTEMS INC"));
		indexes.add(create("CTSH", USA, "COGNIZANT TECH SOL"));
		indexes.add(create("CMCSK", USA, "COMCAST CL A SPCL"));
		indexes.add(create("CMCSA", USA, "COMCAST CORP A"));
		indexes.add(create("COST", USA, "COSTCO WHOLESALE"));
		indexes.add(create("DTV", USA, "DIRECTV"));
		indexes.add(create("DISCA", USA, "DISCOVERY COMM A"));
		indexes.add(create("DISCK", USA, "DISCOVERY COMM INC"));
		indexes.add(create("DISH", USA, "DISH NETWORK CORP"));
		indexes.add(create("DLTR", USA, "DOLLAR TREE INC"));
		indexes.add(create("EBAY", USA, "EBAY INC."));
		indexes.add(create("EA", USA, "ELECTRONIC ARTS INC"));
		indexes.add(create("EXPD", USA, "EXPEDITORS INTL"));
		indexes.add(create("ESRX", USA, "EXPRESS SCRIPTS"));
		indexes.add(create("FB", USA, "FACEBOOK INC"));
		indexes.add(create("FAST", USA, "FASTENAL CO"));
		indexes.add(create("FISV", USA, "FISERV"));
		indexes.add(create("GRMN", USA, "GARMIN LTD"));
		indexes.add(create("GILD", USA, "GILEAD SCIENCES"));
		indexes.add(create("GOOGL", USA, "GOOGLE INC CL A CMN"));
		indexes.add(create("GOOG", USA, "GOOGLE INC CL C CAP"));
		indexes.add(create("HSIC", USA, "HENRY SCHEIN"));
		indexes.add(create("ILMN", USA, "ILLUMINA"));
		indexes.add(create("INTU", USA, "INTUIT INC"));
		indexes.add(create("ISRG", USA, "INTUITIVE SURG"));
		indexes.add(create("KLAC", USA, "K L A-TENCOR CORP"));
		indexes.add(create("GMCR", USA, "KEURIG GREEN MTN CMN"));
		indexes.add(create("KRFT", USA, "KRAFT FOODS GROUP"));
		indexes.add(create("LRCX", USA, "LAM RESEARCH CORP"));
		indexes.add(create("LBTYA", USA, "LIBERTY GLOBAL ORD A"));
		indexes.add(create("LBTYK", USA, "LIBERTY GLOBAL ORD C"));
		indexes.add(create("QVCA", USA, "LIBERTY INTATV SRS A"));
		indexes.add(create("LMCK", USA, "LIBERTY MEDIA C"));
		indexes.add(create("LMCA", USA, "LIBERTY MEDIA SRS A"));
		indexes.add(create("LVNTA", USA, "LIBERTY VNTRS SRS A"));
		indexes.add(create("MAR", USA, "MARRIOT INT CL A"));
		indexes.add(create("MAT", USA, "MATTEL INC"));
		indexes.add(create("MDLZ", USA, "MONDELEZ INTL CMN A"));
		indexes.add(create("MNST", USA, "MONSTER BEVERAGE CP"));
		indexes.add(create("MYL", USA, "MYLAN NV ORD SHS"));
		indexes.add(create("NTAP", USA, "NETAPP"));
		indexes.add(create("NFLX", USA, "NETFLIX"));
		indexes.add(create("NVDA", USA, "NVIDIA CORPORATION"));
		indexes.add(create("NXPI", USA, "NXP SEMICONDUCTORS"));
		indexes.add(create("ORLY", USA, "O'REILLY AUTOMOTIVE"));
		indexes.add(create("PCAR", USA, "PACCAR INC."));
		indexes.add(create("PAYX", USA, "PAYCHEX"));
		indexes.add(create("REGN", USA, "REGENERON PHARMACEUT"));
		indexes.add(create("ROST", USA, "ROSS STORES"));
		indexes.add(create("SNDK", USA, "SANDISK CORPORATION"));
		indexes.add(create("SBAC", USA, "SBA COMMUNICATIONS"));
		indexes.add(create("STX", USA, "SEAGATE TECHNOLOGY"));
		indexes.add(create("SIAL", USA, "SIGMA ALDRICH CORP"));
		indexes.add(create("SIRI", USA, "SIRIUS XM HOLDINGS I"));
		indexes.add(create("SPLS", USA, "STAPLES"));
		indexes.add(create("SBUX", USA, "STARBUCKS CORP"));
		indexes.add(create("SRCL", USA, "STERICYCLE"));
		indexes.add(create("TSLA", USA, "TESLA MOTORS INC"));
		indexes.add(create("PCLN", USA, "THE PRICELINE GP CM"));
		indexes.add(create("TSCO", USA, "TRACTOR SUPPLY CO"));
		indexes.add(create("TRIP", USA, "TRIPADVISOR"));
		indexes.add(create("VRSK", USA, "VERISK ANALYTICS INC"));
		indexes.add(create("VRTX", USA, "VERTEX PHARMACEUTIC"));
		indexes.add(create("VIAB", USA, "VIACOM INC CL B"));
		indexes.add(create("VIP", USA, "VIMPELCOM LTD"));
		indexes.add(create("VOD", USA, "VODAFONE GRP PLC ADS"));
		indexes.add(create("WBA", USA, "WALGREENS BTS ALN CM"));
		indexes.add(create("WDC", USA, "WESTERN DIGITAL CP"));
		indexes.add(create("WFM", USA, "WHOLE FOODS MARKET"));
		indexes.add(create("WYNN", USA, "WYNN RESORTS LIMITED"));
		indexes.add(create("CSI300INDEX", CHINA, "CSI 300 Index"));
		indexes.sort(thisComparator);
	}

	private static CountryMarketIndex create(String name, final Country country, final String description) {
		return new CountryMarketIndex(name.toLowerCase(), country, description);
	}

	public static ArrayList<CountryMarketIndex> getValues() {
		return indexes;
	}

	private final MarketIndexGroup marketIndexGroup;
	private final String instrumentName;
	private final UnitedFormatFilename fileName;
	private final Country country;
	private final String description;

	private CountryMarketIndex(final String instrumentName, final Country country, final String description) {
		this.marketIndexGroup = NATIONAL;
		this.instrumentName = instrumentName;
		this.fileName = UnitedFormatHelper.toFilesystem(instrumentName);
		this.country = country;
		this.description = description;
	}

	public static CountryMarketIndex createForSearch(final String instrumentName) {
		return new CountryMarketIndex(instrumentName, null, null);
	}

	@Override
	public String getInstrumentName() {
		return instrumentName;
	}

	@Override
	public UnitedFormatFilename getFilesystemName() {
		return fileName;
	}

	public Country getCountry() {
		return country;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "CountryMarketIndex{" + fileName + ", " + country + "}";
	}

	@Override
	public int compareTo(final CountryMarketIndex o) {
		return thisComparator.compare(this, o);
	}

	@Override
	public MarketIndexGroup getMarketIndexGroup() {
		return this.marketIndexGroup;
	}

}
