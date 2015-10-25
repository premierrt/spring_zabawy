package raport_spring;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class KoszykService {

	//referencja do DAOkoszyk
	@Resource
	private Koszyk koszyk;
	public void dodajDoKoszyka(Product product){
		List l =koszyk.getProdukty();
		l.add(product);
		koszyk.setProdukty(l);
		koszyk.toString();
	}
	
}
