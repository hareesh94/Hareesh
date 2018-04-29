
public class validateRecord {
	
	Double eurosExchangeRate = Main.exchangeMap.get("EUR");
	Double candianExchangeRate = Main.exchangeMap.get("CAD");
	
	private boolean validate(Record record){
		Double priceInUsd = record.getUnit_price_usd();
		if(record.getTitle().length()<30) return false;
		if(record.getLikes()<10) return false;
		if(record.getTotal_purchases()<200) return false;
		if(priceInUsd*eurosExchangeRate>20 || priceInUsd*candianExchangeRate>25) return false;
		return true;
	}
}
