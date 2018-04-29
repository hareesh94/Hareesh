import java.util.List;

public class Record {
	private int id;
	private  String title;
	public String getTitle() {
		return title;
	}

	private int likes;
	public int getLikes() {
		return likes;
	}

	private int total_purchases;
	public int getTotal_purchases() {
		return total_purchases;
	}

	private Double unit_price_usd;
	
	public Double getUnit_price_usd() {
		return unit_price_usd;
	}

	public Record(List<String> line){
		this.id = Integer.parseInt(line.get(0));
		this.title = line.get(1);
		this.likes = Integer.parseInt(line.get(2));
		this.total_purchases = Integer.parseInt(line.get(3));
		this.unit_price_usd = Double.parseDouble(line.get(4));
	}

}
