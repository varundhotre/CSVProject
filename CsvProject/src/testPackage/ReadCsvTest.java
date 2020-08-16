package testPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ReadCsvTest {

	public static void main(String[] args) {

		List<CsvTest> csvList = getCsvList("D:\\CSV\\cm29JAN2020bhav.csv");	
		
		System.out.println("cm29JAN2020bhavDailyRange.csv file created successfully in D:\\CSV\\");
		
		List<CsvTest> csv30JanList = getCsv30JanList("D:\\CSV\\cm30JAN2020bhav.csv");
		System.out.println("cm30JAN2020bhavDailyRange.csv File Created successfully in D:\\CSV\\");
	
		List<CsvTest> csv31JanList = getCsv31JanList("D:\\CSV\\cm31JAN2020bhav.csv");
		System.out.println("cm31JAN2020bhavDailyRange.csv File Created successfully in D:\\CSV\\");
		
		/* for (CsvTest csv : csvList) { System.out.println(csv);} */		 
		
	}



//------------------------------------cm30JAN2020bhav Get Csv data line by line ---------------------------------------------//

private static CsvTest getOneDailyAverageTradingRangeCsv(String[] attributes) {
		// TODO Auto-generated method stub
	CsvTest csvTest1 = new CsvTest();	
	  String symbol = attributes[0]; String series = attributes[1]; String open =
	  attributes[2]; String high = attributes[3]; String low = attributes[4];
	  String close = attributes[5]; String last = attributes[6]; String preClose =
	  attributes[7]; String tottrdqty = attributes[8]; String tottrdval =
	  attributes[9]; String timeTamp = attributes[10]; String totalReads =
	  attributes[11]; String isin = attributes[12];String dailyRange = attributes[13];
	 		
		  csvTest1.setSymbol(symbol); csvTest1.setSeries(series);
		  csvTest1.setOpen(open); csvTest1.setHigh(high); csvTest1.setLow(low);
		  csvTest1.setClose(close); csvTest1.setLast(last);
		  csvTest1.setPreClose(preClose); csvTest1.setTottrdqty(tottrdqty);
		  csvTest1.setTottrdval(tottrdval); csvTest1.setTimeTamp(timeTamp);
		  csvTest1.setTotalReads(totalReads); csvTest1.setIsin(isin);
		  csvTest1.setDailyRange(dailyRange);
		  
	CsvTest csvTest = new CsvTest(symbol, series, open, high, low, close, last, preClose, tottrdqty, tottrdval,
			timeTamp, totalReads, isin,dailyRange);

	return csvTest;
	}
//------------------------------------cm29JAN2020bhav Csv Read And Write cm30JAN2020bhav File ---------------------------------------------//
	private static List<CsvTest> getCsvList(String file) {
		// TODO Auto-generated method stub
		float high;
		float low;
		float dailyRange;
		String DailyRangeString;
		int counter = 1;

		Path path = Paths.get(file);
		CsvTest csvTest1 = new CsvTest();
		List<CsvTest> csvList = new ArrayList<>();
		try {
			BufferedReader br = Files.newBufferedReader(path);
			File f = new File("D:\\CSV\\cm29JAN2020bhavDailyRange.csv");
			if(!f.exists()){
				  f.createNewFile();
				}else{
				  System.out.println("File already exists");
				}
			FileWriter writer = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(writer);
			String row = br.readLine();
			while (row != null) {
				String[] attributes = row.split(",");
				
				  csvTest1.setCsvTestList(attributes); csvTest1.setSymbol(attributes[0]);
				  csvTest1.setSeries(attributes[1]); csvTest1.setOpen(attributes[2]);
				  csvTest1.setHigh(attributes[3]); csvTest1.setLow(attributes[4]);
				  csvTest1.setClose(attributes[5]); csvTest1.setLast(attributes[6]);
				  csvTest1.setPreClose(attributes[7]); csvTest1.setTottrdqty(attributes[8]);
				  csvTest1.setTottrdval(attributes[9]); csvTest1.setTimeTamp(attributes[10]);
				  csvTest1.setTotalReads(attributes[11]); csvTest1.setIsin(attributes[12]);

				CsvTest csvTest = getOneCsv(attributes);
				 
				 
				if (counter > 1) {
					high = Float.parseFloat(csvTest1.getHigh());
					low = Float.parseFloat(csvTest1.getLow());
					dailyRange = (high - low);
					DailyRangeString =Float.toString(dailyRange);
					
					 bw.append(attributes[0]); bw.append(","); bw.append(attributes[1]);
					  bw.append(","); bw.append(attributes[2]); bw.append(",");
					  bw.append(attributes[3]); bw.append(","); bw.append(attributes[4]);
					  bw.append(","); bw.append(attributes[5]); bw.append(",");
					  bw.append(attributes[6]); bw.append(","); bw.append(attributes[7]);
					  bw.append(","); bw.append(attributes[8]); bw.append(",");
					  bw.append(attributes[9]); bw.append(","); bw.append(attributes[10]);
					  bw.append(","); bw.append(attributes[11]); bw.append(",");
					  bw.append(attributes[12]); bw.append(","); bw.append(DailyRangeString);
					  bw.append("\n");
				}
				else {
					 bw.append(attributes[0]); bw.append(","); bw.append(attributes[1]);
					  bw.append(","); bw.append(attributes[2]); bw.append(",");
					  bw.append(attributes[3]); bw.append(","); bw.append(attributes[4]);
					  bw.append(","); bw.append(attributes[5]); bw.append(",");
					  bw.append(attributes[6]); bw.append(","); bw.append(attributes[7]);
					  bw.append(","); bw.append(attributes[8]); bw.append(",");
					  bw.append(attributes[9]); bw.append(","); bw.append(attributes[10]);
					  bw.append(","); bw.append(attributes[11]); bw.append(",");
					  bw.append(attributes[12]); bw.append(","); bw.append("Daily Range");
					  bw.append("\n");
				}
				counter++;
				csvList.add(csvTest);
				row = br.readLine();
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return csvList;
	}
	//------------------------------------ Get Csv data line by line ---------------------------------------------//
	private static CsvTest getOneCsv(String[] attributes) {
		// TODO Auto-generated method stub

		CsvTest csvTest1 = new CsvTest();

		
		  String symbol = attributes[0]; String series = attributes[1]; String open =
		  attributes[2]; String high = attributes[3]; String low = attributes[4];
		  String close = attributes[5]; String last = attributes[6]; String preClose =
		  attributes[7]; String tottrdqty = attributes[8]; String tottrdval =
		  attributes[9]; String timeTamp = attributes[10]; String totalReads =
		  attributes[11]; String isin = attributes[12];
		 			
			  csvTest1.setSymbol(symbol); csvTest1.setSeries(series);
			  csvTest1.setOpen(open); csvTest1.setHigh(high); csvTest1.setLow(low);
			  csvTest1.setClose(close); csvTest1.setLast(last);
			  csvTest1.setPreClose(preClose); csvTest1.setTottrdqty(tottrdqty);
			  csvTest1.setTottrdval(tottrdval); csvTest1.setTimeTamp(timeTamp);
			  csvTest1.setTotalReads(totalReads); csvTest1.setIsin(isin);
			 

		CsvTest csvTest = new CsvTest(symbol, series, open, high, low, close, last, preClose, tottrdqty, tottrdval,
				timeTamp, totalReads, isin);

		return csvTest;
	}
	
//---------------------------------------------------For CSV file 30 Jan-------------------------------------------------------------//
	private static List<CsvTest> getCsv30JanList(String file) {
		// TODO Auto-generated method stub
		float high;
		float low;
		float dailyRange;
		String DailyRangeString;
		int counter = 1;

		Path path = Paths.get(file);
		CsvTest csvTest1 = new CsvTest();
		List<CsvTest> csvList = new ArrayList<>();
		try {
			BufferedReader br = Files.newBufferedReader(path);
			File f = new File("D:\\CSV\\cm30JAN2020bhavDailyRange.csv");
			if(!f.exists()){
				  f.createNewFile();
				}else{
				  System.out.println("File already exists");
				}
			FileWriter writer = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(writer);
			String row = br.readLine();
			while (row != null) {
				String[] attributes = row.split(",");
				
				  csvTest1.setCsvTestList(attributes); csvTest1.setSymbol(attributes[0]);
				  csvTest1.setSeries(attributes[1]); csvTest1.setOpen(attributes[2]);
				  csvTest1.setHigh(attributes[3]); csvTest1.setLow(attributes[4]);
				  csvTest1.setClose(attributes[5]); csvTest1.setLast(attributes[6]);
				  csvTest1.setPreClose(attributes[7]); csvTest1.setTottrdqty(attributes[8]);
				  csvTest1.setTottrdval(attributes[9]); csvTest1.setTimeTamp(attributes[10]);
				  csvTest1.setTotalReads(attributes[11]); csvTest1.setIsin(attributes[12]);

					CsvTest csvTest = getOneCsv(attributes);
				 
				 
				if (counter > 1) {
					high = Float.parseFloat(csvTest1.getHigh());
					low = Float.parseFloat(csvTest1.getLow());
					dailyRange = (high - low);
					DailyRangeString =Float.toString(dailyRange);
					
					 bw.append(attributes[0]); bw.append(","); bw.append(attributes[1]);
					  bw.append(","); bw.append(attributes[2]); bw.append(",");
					  bw.append(attributes[3]); bw.append(","); bw.append(attributes[4]);
					  bw.append(","); bw.append(attributes[5]); bw.append(",");
					  bw.append(attributes[6]); bw.append(","); bw.append(attributes[7]);
					  bw.append(","); bw.append(attributes[8]); bw.append(",");
					  bw.append(attributes[9]); bw.append(","); bw.append(attributes[10]);
					  bw.append(","); bw.append(attributes[11]); bw.append(",");
					  bw.append(attributes[12]); bw.append(","); bw.append(DailyRangeString);
					  bw.append("\n");
				}
				else {
					 bw.append(attributes[0]); bw.append(","); bw.append(attributes[1]);
					  bw.append(","); bw.append(attributes[2]); bw.append(",");
					  bw.append(attributes[3]); bw.append(","); bw.append(attributes[4]);
					  bw.append(","); bw.append(attributes[5]); bw.append(",");
					  bw.append(attributes[6]); bw.append(","); bw.append(attributes[7]);
					  bw.append(","); bw.append(attributes[8]); bw.append(",");
					  bw.append(attributes[9]); bw.append(","); bw.append(attributes[10]);
					  bw.append(","); bw.append(attributes[11]); bw.append(",");
					  bw.append(attributes[12]); bw.append(","); bw.append("Daily Range");
					  bw.append("\n");
				}
				counter++;
				csvList.add(csvTest);
				row = br.readLine();
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return csvList;
	}

	
	private static List<CsvTest> getCsv31JanList(String file) {
		// TODO Auto-generated method stub
		float high;
		float low;
		float dailyRange;
		String DailyRangeString;
		int counter = 1;

		Path path = Paths.get(file);
		CsvTest csvTest1 = new CsvTest();
		List<CsvTest> csvList = new ArrayList<>();
		try {
			BufferedReader br = Files.newBufferedReader(path);
			File f = new File("D:\\CSV\\cm31JAN2020bhavDailyRange.csv");
			if(!f.exists()){
				  f.createNewFile();
				}else{
				  System.out.println("File already exists");
				}
			FileWriter writer = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(writer);
			String row = br.readLine();
			while (row != null) {
				String[] attributes = row.split(",");
				
				  csvTest1.setCsvTestList(attributes); csvTest1.setSymbol(attributes[0]);
				  csvTest1.setSeries(attributes[1]); csvTest1.setOpen(attributes[2]);
				  csvTest1.setHigh(attributes[3]); csvTest1.setLow(attributes[4]);
				  csvTest1.setClose(attributes[5]); csvTest1.setLast(attributes[6]);
				  csvTest1.setPreClose(attributes[7]); csvTest1.setTottrdqty(attributes[8]);
				  csvTest1.setTottrdval(attributes[9]); csvTest1.setTimeTamp(attributes[10]);
				  csvTest1.setTotalReads(attributes[11]); csvTest1.setIsin(attributes[12]);

					CsvTest csvTest = getOneCsv(attributes);
				 
				 
				if (counter > 1) {
					high = Float.parseFloat(csvTest1.getHigh());
					low = Float.parseFloat(csvTest1.getLow());
					dailyRange = (high - low);
					DailyRangeString =Float.toString(dailyRange);
					
					 bw.append(attributes[0]); bw.append(","); bw.append(attributes[1]);
					  bw.append(","); bw.append(attributes[2]); bw.append(",");
					  bw.append(attributes[3]); bw.append(","); bw.append(attributes[4]);
					  bw.append(","); bw.append(attributes[5]); bw.append(",");
					  bw.append(attributes[6]); bw.append(","); bw.append(attributes[7]);
					  bw.append(","); bw.append(attributes[8]); bw.append(",");
					  bw.append(attributes[9]); bw.append(","); bw.append(attributes[10]);
					  bw.append(","); bw.append(attributes[11]); bw.append(",");
					  bw.append(attributes[12]); bw.append(","); bw.append(DailyRangeString);
					  bw.append("\n");
				}
				else {
					 bw.append(attributes[0]); bw.append(","); bw.append(attributes[1]);
					  bw.append(","); bw.append(attributes[2]); bw.append(",");
					  bw.append(attributes[3]); bw.append(","); bw.append(attributes[4]);
					  bw.append(","); bw.append(attributes[5]); bw.append(",");
					  bw.append(attributes[6]); bw.append(","); bw.append(attributes[7]);
					  bw.append(","); bw.append(attributes[8]); bw.append(",");
					  bw.append(attributes[9]); bw.append(","); bw.append(attributes[10]);
					  bw.append(","); bw.append(attributes[11]); bw.append(",");
					  bw.append(attributes[12]); bw.append(","); bw.append("Daily Range");
					  bw.append("\n");
				}
				counter++;
				csvList.add(csvTest);
				row = br.readLine();
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return csvList;
	}
	
}
