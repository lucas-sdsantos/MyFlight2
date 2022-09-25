package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.*;

public class App {

	public static void main(String[] args) {
		Aeronave a = new Aeronave("13", "PT", 13);
		System.out.println(a);
		Geo b = new Geo(3, 0);
		System.out.println(b);
		Aeroporto c = new Aeroporto("12", "PDT", b);
		System.out.println(c);
		CiaAerea d = new CiaAerea("22", "PL");
		System.out.println(d);

		
	}
}
