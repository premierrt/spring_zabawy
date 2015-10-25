package raport_spring;

public class Simka implements Product{

	String name;
	String type;
	
	@Override
	public String getProductName() {
	return name;	
	}

	@Override
	public String getProductType() {
		// TODO Auto-generated method stub
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
}
