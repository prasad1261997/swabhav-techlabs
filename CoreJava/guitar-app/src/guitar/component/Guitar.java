package guitar.component;

import guitar.component.test.GuitarSpec;

public class Guitar {
	private String serialNumber;
	private double price;
	
	GuitarSpec spec;

	public Guitar(String serialNumber, double price,GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec=spec;
	}

	public String getSerailNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}
	
	public GuitarSpec getSpec(){
		return spec;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
}
