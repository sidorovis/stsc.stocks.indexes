package stsc.stocks.indexes;

import static stsc.stocks.meta.Country.AUSTRALIA;
import static stsc.stocks.meta.Country.BRAZIL;
import static stsc.stocks.meta.Country.EGYPT;
import static stsc.stocks.meta.Country.FRANCE;
import static stsc.stocks.meta.Country.GERMANY;
import static stsc.stocks.meta.Country.HONG_KONG;
import static stsc.stocks.meta.Country.MEXICO;
import static stsc.stocks.meta.Country.SINGAPORE;
import static stsc.stocks.meta.Country.TAIWAN;
import static stsc.stocks.meta.Country.UNITED_KINGDOM;
import static stsc.stocks.meta.Country.ISRAEL;
import static stsc.stocks.meta.Country.JAPAN;
import static stsc.stocks.meta.Country.USA;
import static stsc.stocks.meta.MarketIndexGroup.NATIONAL;
import stsc.stocks.meta.Country;
import stsc.stocks.meta.MarketIndexGroup;

/**
 * Market index description for {@link Country}.
 */
public enum CountryMarketIndex {

	// global
	ASX(AUSTRALIA, "https://en.wikipedia.org/wiki/Australian_Securities_Exchange"), //

	_094CCSI(EGYPT, "EGX 70 PRICE INDEX"), //

	UKX(UNITED_KINGDOM, "FTSE 100, https://en.wikipedia.org/wiki/FTSE_100_Index"), //

	TA100(ISRAEL, "TEL AVIV TA-100 IND. Tel Aviv"), //

	OSCUF(JAPAN, "OTCMKTS:OSCUF. Osaka Securities Exchange Co Ltd"), //
	N225(JAPAN, "Nikkei 225."), //

	CBOE(USA,
			"The CBOE Volatility Index® (VIX®) is a key measure of market expectations of near-term volatility conveyed by S&P 500 stock index option prices."), //
	GSPCX(USA, "The investment seeks long-term growth of capital."), //
	VIX(USA, "VOLATILITY S&P 500 (^VIX)."), //
	SPX(USA, "S&P 500 INDEX(INDEXCBOE:SPX)"), //
	XAX(USA, "NYSE AMEX COMPOSITE INDEX"), //

	_094DJI(USA, "Dow Jones Industrial Average"), //
	_094GSPC(USA, "S&P 500"), //
	_094GSPTSE(USA, "S&P/TSX Composite index"), //
	_094NYA(USA, "NYSE COMPOSITE"), //
	_094IXIC(USA, "Nasdaq"), //
	_094BVSP(BRAZIL, "Bovespa"), //
	_094MXX(MEXICO, "IPC"), //
	_094FCHI(FRANCE, "CAC 41"), //
	_094GDAXI(GERMANY, "DAX"), //
	_094AORD(AUSTRALIA, "All Ordinaries"), //
	_094N225(JAPAN, "Nikkei 225."), //
	_094HSI(HONG_KONG, "Hang Seng"), //
	_094STI(SINGAPORE, "Straits Times"), //
	_094TWII(TAIWAN, "Taiwan Weighted"), //

	// Components / Not related indexes and etc.
	AAPL(USA, "Apple Inc."), //
	AXP(USA, "American Express Company"), //
	BA(USA, "The Boeing Company"), //
	CAT(USA, "Caterpillar Inc."), //
	CSCO(USA, "Cisco Systems, Inc."), //
	CVX(USA, "Chevron Corporation"), //
	DD(USA, "E. I. du Pont de Nemours and Company"), //
	DIS(USA, "The Walt Disney Company"), //
	GE(USA, "General Electric Company"), //
	GS(USA, "The Goldman Sachs Group, Inc."), //
	HD(USA, "The Home Depot, Inc."), //
	IBM(USA, "International Business Machines Corporation"), //
	INTC(USA, "Intel Corporation"), //
	JNJ(USA, "Johnson & Johnson"), //
	JPM(USA, "JPMorgan Chase & Co."), //
	KO(USA, "The Coca-Cola Company"), //
	MCD(USA, "McDonald's Corp."), //
	MMM(USA, "3M Company"), //
	MRK(USA, "Merck & Co. Inc."), //
	MSFT(USA, "Microsoft Corporation"), //
	NKE(USA, "NIKE, Inc."), //
	PFE(USA, "Pfizer Inc."), //
	PG(USA, "The Procter & Gamble Company"), //
	TRV(USA, "The Travelers Companies, Inc."), //
	UNH(USA, "UnitedHealth Group Incorporated"), //
	UTX(USA, "United Technologies Corporation"), //
	V(USA, "Visa Inc."), //
	VZ(USA, "Verizon Communications Inc."), //
	WMT(USA, "Wal-Mart Stores Inc."), //
	XOM(USA, "Exxon Mobil Corporation"), //
	// CBOE
	ADBE(USA, "ADOBE SYSTEMS INC"), //
	ADCT(USA, "ADC TELECOMMUNICATIONS INC"), //
	AMAT(USA, "APPLIED MATERIALS, INC."), //
	BRCM(USA, "BROADCOM CORP."), //
	CA(USA, "COMPUTER ASSOCIATES INTERNATIONAL"), //
	CSC(USA, "COMPUTER SCIENCES CORP"), //
	DELL(USA, "DELL INC."), //
	EMC(USA, "EMC CORP."), //
	HPQ(USA, "HEWLETT PACKARD CO"), //
	INFY(USA, "INFOSYS TECHNOLOGIES LTD"), //
	JAVA(USA, "SUN MICROSYSTEMS, INC."), //
	LLTC(USA, "LINEAR TECHNOLOGY CORP."), //
	MOT(USA, "MOTOROLA INC"), //
	MU(USA, "MICRON TECHNOLOGY INC"), //
	ORCL(USA, "ORACLE CORPORATION"), //
	PALM(USA, "PALM, INC"), //
	PMTC(USA, "PARAMETRIC TECHNOLOGY CORP"), //
	QCOM(USA, "QUALCOMM, INC."), //
	SNPS(USA, "SYNOPSYS INC"), //
	SYMC(USA, "SYMANTEC CORP."), //
	TLAB(USA, "TELLABS INC"), //
	TWX(USA, "TIME WARNER, INC."), //
	TXN(USA, "TEXAS INSTRUMENTS, INC."), //
	XLNX(USA, "XILINX INC"), //
	YHOO(USA, "YAHOO! INC."), //
	// NASDAQ 100 Components:
	FOXA(USA, "21ST CENTRY FOX A CM"), //
	FOX(USA, "21ST CENTRY FOX B CM"), //
	ATVI(USA, "ACTIVISION BLIZZARD"), //
	AKAM(USA, "AKAMAI TECHNOLOGIES"), //
	ALXN(USA, "ALEXION PHARM INC"), //
	ALTR(USA, "ALTERA CORP"), //
	AMZN(USA, "AMAZON.COM INC"), //
	AAL(USA, "AMERICAN AIRLINES GP"), //
	AMGN(USA, "AMGEN"), //
	ADI(USA, "ANALOG DEVICES CMN"), //
	ADSK(USA, "AUTODESK INC"), //
	ADP(USA, "AUTOMATIC DATA PROCS"), //
	AVGO(USA, "AVAGO TECHNOLOGIES L"), //
	BIDU(USA, "BAIDU, INC."), //
	BBBY(USA, "BED BATH & BEYOND"), //
	BIIB(USA, "BIOGEN INC CMN"), //
	CHRW(USA, "C.H. ROBINSON WW"), //
	CTRX(USA, "CATAMARAN CORPORATIO"), //
	CELG(USA, "CELGENE CORP"), //
	CERN(USA, "CERNER CORP"), //
	CHTR(USA, "CHARTER COMMUNICATIO"), //
	CHKP(USA, "CHECK POINT SOFTWARE"), //
	CTXS(USA, "CITRIX SYSTEMS INC"), //
	CTSH(USA, "COGNIZANT TECH SOL"), //
	CMCSK(USA, "COMCAST CL A SPCL"), //
	CMCSA(USA, "COMCAST CORP A"), //
	COST(USA, "COSTCO WHOLESALE"), //
	DTV(USA, "DIRECTV"), //
	DISCA(USA, "DISCOVERY COMM A"), //
	DISCK(USA, "DISCOVERY COMM INC"), //
	DISH(USA, "DISH NETWORK CORP"), //
	DLTR(USA, "DOLLAR TREE INC"), //
	EBAY(USA, "EBAY INC."), //
	EA(USA, "ELECTRONIC ARTS INC"), //
	EXPD(USA, "EXPEDITORS INTL"), //
	ESRX(USA, "EXPRESS SCRIPTS"), //
	FB(USA, "FACEBOOK INC"), //
	FAST(USA, "FASTENAL CO"), //
	FISV(USA, "FISERV, INC."), //
	GRMN(USA, "GARMIN LTD"), //
	GILD(USA, "GILEAD SCIENCES, INC"), //
	GOOGL(USA, "GOOGLE INC CL A CMN"), //
	GOOG(USA, "GOOGLE INC CL C CAP"), //
	HSIC(USA, "HENRY SCHEIN, INC."), //
	ILMN(USA, "ILLUMINA, INC."), //
	INTU(USA, "INTUIT INC"), //
	ISRG(USA, "INTUITIVE SURG, INC."), //
	KLAC(USA, "K L A-TENCOR CORP"), //
	GMCR(USA, "KEURIG GREEN MTN CMN"), //
	KRFT(USA, "KRAFT FOODS GROUP"), //
	LRCX(USA, "LAM RESEARCH CORP"), //
	LBTYA(USA, "LIBERTY GLOBAL ORD A"), //
	LBTYK(USA, "LIBERTY GLOBAL ORD C"), //
	QVCA(USA, "LIBERTY INTATV SRS A"), //
	LMCK(USA, "LIBERTY MEDIA C"), //
	LMCA(USA, "LIBERTY MEDIA SRS A"), //
	LVNTA(USA, "LIBERTY VNTRS SRS A"), //
	MAR(USA, "MARRIOT INT CL A"), //
	MAT(USA, "MATTEL INC"), //
	MDLZ(USA, "MONDELEZ INTL CMN A"), //
	MNST(USA, "MONSTER BEVERAGE CP"), //
	MYL(USA, "MYLAN NV ORD SHS"), //
	NTAP(USA, "NETAPP, INC."), //
	NFLX(USA, "NETFLIX, INC."), //
	NVDA(USA, "NVIDIA CORPORATION"), //
	NXPI(USA, "NXP SEMICONDUCTORS"), //
	ORLY(USA, "O'REILLY AUTOMOTIVE"), //
	PCAR(USA, "PACCAR INC."), //
	PAYX(USA, "PAYCHEX, INC."), //
	REGN(USA, "REGENERON PHARMACEUT"), //
	ROST(USA, "ROSS STORES, INC."), //
	SNDK(USA, "SANDISK CORPORATION"), //
	SBAC(USA, "SBA COMMUNICATIONS"), //
	STX(USA, "SEAGATE TECHNOLOGY"), //
	SIAL(USA, "SIGMA ALDRICH CORP"), //
	SIRI(USA, "SIRIUS XM HOLDINGS I"), //
	SPLS(USA, "STAPLES, INC."), //
	SBUX(USA, "STARBUCKS CORP"), //
	SRCL(USA, "STERICYCLE, INC."), //
	TSLA(USA, "TESLA MOTORS INC"), //
	PCLN(USA, "THE PRICELINE GP CM"), //
	TSCO(USA, "TRACTOR SUPPLY CO"), //
	TRIP(USA, "TRIPADVISOR, INC."), //
	VRSK(USA, "VERISK ANALYTICS INC"), //
	VRTX(USA, "VERTEX PHARMACEUTIC"), //
	VIAB(USA, "VIACOM INC CL B"), //
	VIP(USA, "VIMPELCOM LTD"), //
	VOD(USA, "VODAFONE GRP PLC ADS"), //
	WBA(USA, "WALGREENS BTS ALN CM"), //
	WDC(USA, "WESTERN DIGITAL CP"), //
	WFM(USA, "WHOLE FOODS MARKET"), //
	WYNN(USA, "WYNN RESORTS LIMITED"), //
	//
	;

	private final MarketIndexGroup marketIndexGroup;
	private final Country country;
	private final String description;

	private CountryMarketIndex(final Country country, final String description) {
		this.marketIndexGroup = NATIONAL;
		this.country = country;
		this.description = description;
	}

	public MarketIndexGroup getMarketIndexGroup() {
		return marketIndexGroup;
	}

	public Country getCountry() {
		return country;
	}

	public String getDescription() {
		return description;
	}

}
