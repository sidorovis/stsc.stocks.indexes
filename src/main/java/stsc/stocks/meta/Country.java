package stsc.stocks.meta;

/**
 * List of Countries.
 */
public enum Country {

	// see http://www.iso15022.org/MIC/homepageMIC.htm
	
	ALBANIA(Region.EUROPE), //
	ALGERIA(Region.AFRICA), //
	ARGENTINA(Region.SOUTH_AMERICA), //
	ARMENIA(Region.EUROPE), // probably also Asia
	AUSTRALIA(Region.AUSTRALIA), //
	AUSTRIA(Region.EUROPE), //
	AZERBAIJAN(Region.EUROPE), // probably also Asia
	BAHAMAS(Region.NORTH_AMERICA), //
	BAHRAIN(Region.ASIA), //
	BANGLADESH(Region.ASIA), //
	BARBADOS(Region.SOUTH_AMERICA), //
	BELARUS(Region.EUROPE), //
	BELGIUM(Region.EUROPE), //
	BERMUDA(Region.NORTH_AMERICA), //
	BOLIVIA(Region.SOUTH_AMERICA), //
	BOSNIA_AND_HERZEGOVINA(Region.EUROPE), //
	BOTSWANA(Region.AFRICA), //
	BRAZIL(Region.SOUTH_AMERICA), //
	BULGARIA(Region.EUROPE), //
	CAMBODIA(Region.ASIA), //
	CAMEROON(Region.AFRICA), //
	CANADA(Region.NORTH_AMERICA), //
	CAPE_VERDE(Region.AFRICA), //
	CAYMAN_ISLANDS(Region.NORTH_AMERICA), //
	CHILE(Region.SOUTH_AMERICA), //
	CHINA(Region.ASIA), //
	COLOMBIA(Region.SOUTH_AMERICA), //
	COSTA_RICA(Region.NORTH_AMERICA), //
	CROATIA(Region.EUROPE), //
	CURACAO(Region.SOUTH_AMERICA), //
	CYPRUS(Region.EUROPE), //
	CZECH_REPUBLIC(Region.EUROPE), //
	DENMARK(Region.EUROPE), //
	DOMINICAN_REPUBLIC(Region.SOUTH_AMERICA), //
	ECUADOR(Region.SOUTH_AMERICA), //
	EGYPT(Region.AFRICA), //
	EL_SALVADOR(Region.NORTH_AMERICA), //
	ESTONIA(Region.EUROPE), //
	FAROE_ISLANDS(Region.EUROPE), //
	FIJI(Region.AUSTRALIA), //
	FINLAND(Region.EUROPE), //
	FRANCE(Region.EUROPE), //
	GEORGIA(Region.EUROPE), //
	GERMANY(Region.EUROPE), //
	GHANA(Region.AFRICA), //
	GREECE(Region.EUROPE), //
	GUATEMALA(Region.SOUTH_AMERICA), //
	GUERNSEY_C_I(Region.EUROPE), //
	GUYANA(Region.SOUTH_AMERICA), //
	HONDURAS(Region.NORTH_AMERICA), //
	HONG_KONG(Region.ASIA), //
	HUNGARY(Region.EUROPE), //
	ICELAND(Region.EUROPE), //
	INDIA(Region.ASIA), //
	INDONESIA(Region.AUSTRALIA), //
	IRAN(Region.ASIA), //
	IRAQ(Region.ASIA), //
	IRELAND(Region.EUROPE), //
	ISRAEL(Region.EUROPE), //
	ITALY(Region.EUROPE), //
	IVORY_COAST(Region.AFRICA), //
	JAMAICA(Region.NORTH_AMERICA), //
	JAPAN(Region.ASIA), //
	JORDAN(Region.ASIA), //
	KAZAKHSTAN(Region.ASIA), //
	KENYA(Region.AFRICA), //
	REPUBLIC_OF_KOREA(Region.ASIA), //
	KUWAIT(Region.ASIA), //
	KYRGYZSTAN(Region.ASIA), //
	LAOS(Region.ASIA), //
	LATVIA(Region.EUROPE), //
	LEBANON(Region.ASIA), //
	LIBYAN_ARAB_JAMAHIRIYA(Region.AFRICA), //
	LITHUANIA(Region.EUROPE), //
	LUXEMBOURG(Region.EUROPE), //
	MACEDONIA(Region.EUROPE), //
	MADAGASCAR(Region.AFRICA), //
	MALAWI(Region.AFRICA), //
	MALAYSIA(Region.ASIA), //
	MALDIVES(Region.ASIA), //
	MALTA(Region.EUROPE), //
	MAURITIUS(Region.AFRICA), //
	MEXICO(Region.NORTH_AMERICA), //
	REPUBLIC_OF_MOLDOVA(Region.EUROPE), //
	MONGOLIA(Region.ASIA), //
	REPUBLIC_OF_MONTENEGRO(Region.EUROPE), //
	MOROCCO(Region.AFRICA), //
	MOZAMBIQUE(Region.AFRICA), //
	NAMIBIA(Region.AFRICA), //
	NEPAL(Region.ASIA), //
	NEW_ZEALAND(Region.AUSTRALIA), //
	NICARAGUA(Region.NORTH_AMERICA), //
	NIGERIA(Region.AFRICA), //
	NORWAY(Region.EUROPE), //
	OMAN(Region.ASIA), //
	PAKISTAN(Region.ASIA), //
	OCCUPIED_PALESTINIAN_TERRITORY(Region.EUROPE), //
	PANAMA(Region.NORTH_AMERICA), //
	PAPUA_NEW_GUINEA(Region.AUSTRALIA), //
	PARAGUAY(Region.SOUTH_AMERICA), //
	PERU(Region.SOUTH_AMERICA), //
	PHILIPPINES(Region.ASIA), //
	POLAND(Region.EUROPE), //
	PORTUGAL(Region.EUROPE), //
	QATAR(Region.ASIA), //
	REPUBLIC_OF_SEYCHELLES(Region.AFRICA), //
	ROMANIA(Region.EUROPE), //
	RUSSIA(Region.ASIA), //
	RWANDA(Region.AFRICA), //
	SAINT_KITTS_AND_NEVIS(Region.NORTH_AMERICA), //
	SAUDI_ARABIA(Region.ASIA), //
	REPUBLIC_OF_SERBIA(Region.EUROPE), //
	SINGAPORE(Region.ASIA), //
	SLOVAKIA(Region.EUROPE), //
	SLOVENIA(Region.EUROPE), //
	SOUTH_AFRICA(Region.AFRICA), //
	SPAIN(Region.EUROPE), //
	SRI_LANKA(Region.ASIA), //
	SUDAN(Region.AFRICA), //
	SWAZILAND(Region.AFRICA), //
	SWEDEN(Region.EUROPE), // )
	SWITZERLAND(Region.EUROPE), // )
	SYRIAN_ARAB_REPUBLIC(Region.ASIA), //
	TAIWAN(Region.ASIA), //
	TANZANIA(Region.AFRICA), //
	THAILAND(Region.ASIA), //
	NETHERLANDS(Region.EUROPE), // )
	TRINIDAD_AND_TOBAGO(Region.NORTH_AMERICA), //
	TUNISIA(Region.AFRICA), //
	TURKEY(Region.EUROPE), // )
	UGANDA(Region.AFRICA), //
	UKRAINE(Region.EUROPE), // )
	UNITED_ARAB_EMIRATES(Region.ASIA), //
	UNITED_KINGDOM(Region.EUROPE), //
	USA(Region.NORTH_AMERICA), //
	URUGUAY(Region.SOUTH_AMERICA), //
	UZBEKISTAN(Region.ASIA), //
	VANUATU(Region.AUSTRALIA), //
	VENEZUELA(Region.SOUTH_AMERICA), //
	VIET_NAM(Region.ASIA), //
	ZAMBIA(Region.AFRICA), //
	ZIMBABWE(Region.AFRICA), //
	;

	private final Region region;

	private Country(final Region region) {
		this.region = region;

	}

	public Region getRegion() {
		return region;
	}
}
