import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Map<String,Double> exchangeMap;
	
	public void readExhangeRates(String csvFile){
		Main.exchangeMap = new HashMap<>();
		 try {
			Scanner scanner = new Scanner(new File(csvFile));
			
			while (scanner.hasNext()) {
	            List<String> line = CSVParser.parseLine(scanner.nextLine());
	            Main.exchangeMap.put(line.get(0), Double.parseDouble(line.get(1)));
	        }
	        scanner.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
	public void readParameters(String csvFile){
		try {
			Scanner scanner = new Scanner(new File(csvFile));
			 while (scanner.hasNext()) {
		            List<String> line = CSVParser.parseLine(scanner.nextLine());
		            Record record = new Record(line);
		            
		        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	 public static void main(String[] args) throws Exception {
		 String exchangeRateFilePath = "C:/Users/nutal/workspace/Hareesh/exchange_rates.csv";
		 String videoFilePath = "C:/Users/nutal/workspace/Hareesh/video.csv";
		 Main m = new Main();
		 m.readExhangeRates(exchangeRateFilePath);
		 
		 
	 }
}
