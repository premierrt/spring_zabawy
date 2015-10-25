package raport_spring;

public class Telefon implements Product {

	Product simka;

	String name;
	String type;
	
	
	public Product getSimka() {
		return simka;
	}

	public void setSimka(Product simka) {
		this.simka = simka;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getProductType() {
		// TODO Auto-generated method stub
		return type;
	}
		
	
}
