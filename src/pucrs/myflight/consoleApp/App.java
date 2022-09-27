package pucrs.myflight.consoleApp;
import java.time.Duration;
import java.time.LocalDateTime;
import pucrs.myflight.modelo.*;

public class App {

	public static void main(String[] args) {
		Aeronave a = new Aeronave("13", "PT");
		System.out.println(a);
		Geo b = new Geo(3, 0);
		System.out.println(b);
		Aeroporto c = new Aeroporto("12", "PDT", b);
		System.out.println(c);
		CiaAerea d = new CiaAerea("22", "PL");
		System.out.println(d);

		CiaAerea ciaA = new CiaAerea ("34534534355", "Gol");
		Geo geoA = new Geo (172.1987, -67.6805);
		Geo geoB = new Geo (74.0824, -102.5554);
		Aeroporto aeroportoA = new Aeroporto ("87994", "Aeroporto Salgado Filho", geoA);
		Aeroporto aeroportoB = new Aeroporto ("60047", "Aeroporto Caxias do Sul", geoA);
		Aeronave aeronaveA = new Aeronave ("9566543245", "eVTOL");
		Rota rotaA = new Rota (ciaA, aeroportoA, aeroportoB, aeronaveA);
		LocalDateTime localDateTimeA = LocalDateTime.of(2022, 9, 27, 16, 57);
		Duration durationA = Duration.ofMinutes(120);
		//Teste para verificar a funcionalidade dos dois construtores.
		Voo vooA = new Voo(rotaA, localDateTimeA, durationA);
		Voo vooB = new Voo(rotaA, durationA);

		//Calcular a distância entre dois aeroportos.
		System.out.println(Geo.getDistancia(geoA, geoB));
		
	}
}
