package raport_spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.start();
		//ApplicationContext context=new
		//		ClassPathXmlApplicationContext("spring-context1.xml");
		//countLastDay= context.getBean(CountLastDay.class); 
		//countLastDay.compute();
		//napis.pisz();
	}
	
	
	private void start(){
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath*:spring-context1.xml");
		
		Napis napis=(Napis)context.getBean("napis");
		napis.pisz();
		
	//	Product simkaMala= (Product)context.getBean("malaSimka");
		Telefon nokia = (Telefon)context.getBean("nokia");
		System.out.println(nokia.toString());
		
		Product htc = (Telefon)context.getBean("htc");
		System.out.println(htc.toString());

		
	Koszyk koszyk = (Koszyk)context.getBean("koszyk");
	System.out.println(koszyk.toString());
		
		
		KoszykService ks=(KoszykService)context.getBean("koszykService");
		ks.dodajDoKoszyka(nokia);
		System.out.println(koszyk.toString());

	}

}
