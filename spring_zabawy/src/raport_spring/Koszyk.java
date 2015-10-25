package raport_spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Koszyk {

	private List produkty= new ArrayList();
	private Double cena;
	@Override
	public String toString() {
		return "Koszyk [produkty=" + produkty + ", cena=" + cena + "]";
	}
	public List getProdukty() {
		return produkty;
	}
	public void setProdukty(List produkty) {
		this.produkty = produkty;
	}
	public Double getCena() {
		return cena;
	}
	public void setCena(Double cena) {
		this.cena = cena;
	}
	
	
}
