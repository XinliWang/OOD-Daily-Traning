package v01;

import java.util.Date;
import java.util.List;

public class Order {
	private String track_number;
	private String starting;
	private String destination;
	private Date time;
	private List<Item> items;
	private double price;
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}
