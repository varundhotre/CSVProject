package testPackage;

public class CsvTest {
	
	private String symbol;
	private String series;
	private String open;
	private String high;
	private String low;
	private String close;
	private String last;
	private String preClose;
	private String tottrdqty;
	private String tottrdval;
	private String timeTamp;
	private String totalReads;
	private String isin;
	private String dailyRange;
	private String[] csvTestList;
	private String dailyRange29Jan;
	private String dailyRange30Jan;
	private String dailyRange31Jan;
	
	
	
	
	
	public String getDailyRange29Jan() {
		return dailyRange29Jan;
	}
	public void setDailyRange29Jan(String dailyRange29Jan) {
		this.dailyRange29Jan = dailyRange29Jan;
	}
	public String getDailyRange30Jan() {
		return dailyRange30Jan;
	}
	public void setDailyRange30Jan(String dailyRange30Jan) {
		this.dailyRange30Jan = dailyRange30Jan;
	}
	public String getDailyRange31Jan() {
		return dailyRange31Jan;
	}
	public void setDailyRange31Jan(String dailyRange31Jan) {
		this.dailyRange31Jan = dailyRange31Jan;
	}
	public String getDailyRange() {
		return dailyRange;
	}
	public void setDailyRange(String dailyRange) {
		this.dailyRange = dailyRange;
	}
	public String[] getCsvTestList() {
		return csvTestList;
	}
	public void setCsvTestList(String[] attributes) {
		this.csvTestList = attributes;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getPreClose() {
		return preClose;
	}
	public void setPreClose(String preClose) {
		this.preClose = preClose;
	}
	public String getTottrdqty() {
		return tottrdqty;
	}
	public void setTottrdqty(String tottrdqty) {
		this.tottrdqty = tottrdqty;
	}
	public String getTottrdval() {
		return tottrdval;
	}
	public void setTottrdval(String tottrdval) {
		this.tottrdval = tottrdval;
	}
	public String getTimeTamp() {
		return timeTamp;
	}
	public void setTimeTamp(String timeTamp) {
		this.timeTamp = timeTamp;
	}
	public String getTotalReads() {
		return totalReads;
	}
	public void setTotalReads(String totalReads) {
		this.totalReads = totalReads;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	@Override
	public String toString() {
		return "CsvTest [symbol=" + symbol + ", series=" + series + ", open=" + open + ", high=" + high + ", low=" + low
				+ ", close=" + close + ", last=" + last + ", preClose=" + preClose + ", tottrdqty=" + tottrdqty
				+ ", tottrdval=" + tottrdval + ", timeTamp=" + timeTamp + ", totalReads=" + totalReads + ", isin="
				+ isin + "]";
	}
	public CsvTest(String symbol, String series, String open, String high, String low, String close, String last,
			String preClose, String tottrdqty, String tottrdval, String timeTamp, String totalReads, String isin) {
		super();
		this.symbol = symbol;
		this.series = series;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.last = last;
		this.preClose = preClose;
		this.tottrdqty = tottrdqty;
		this.tottrdval = tottrdval;
		this.timeTamp = timeTamp;
		this.totalReads = totalReads;
		this.isin = isin;
	}
	
	public CsvTest(String symbol, String series, String open, String high, String low, String close, String last,
			String preClose, String tottrdqty, String tottrdval, String timeTamp, String totalReads, String isin,
			String dailyRange) {
		super();
		this.symbol = symbol;
		this.series = series;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.last = last;
		this.preClose = preClose;
		this.tottrdqty = tottrdqty;
		this.tottrdval = tottrdval;
		this.timeTamp = timeTamp;
		this.totalReads = totalReads;
		this.isin = isin;
		this.dailyRange = dailyRange;
	}
	public CsvTest() {
		// TODO Auto-generated constructor stub
	}
	
}
