package pucrs.myflight.consoleApp;

import java.time.Duration;
import java.time.LocalDateTime;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;
import pucrs.myflight.modelo.VooDireto;
import pucrs.myflight.modelo.VooEscalas;

public class App {

	public static void main(String[] args) {

		CiaAerea ciaA = new CiaAerea("34534534355", "Gol");
		System.out.println(ciaA);

		Geo geoA = new Geo(172.1987, -67.6805);
		Geo geoB = new Geo(74.0824, -102.5554);
		System.out.println(geoB);

		Aeroporto aeroportoA = new Aeroporto("87994", "Aeroporto Salgado Filho", geoA);
		Aeroporto aeroportoB = new Aeroporto("60047", "Aeroporto Caxias do Sul", geoA);
		System.out.println(aeroportoA);

		Aeronave aeronaveA = new Aeronave("9566543245", "eVTOL");
		System.out.println(aeronaveA);

		Rota rotaA = new Rota(ciaA, aeroportoA, aeroportoB, aeronaveA);
		System.out.println(rotaA);

		LocalDateTime localDateTimeA = LocalDateTime.of(2022, 9, 27, 16, 57);
		System.out.println(localDateTimeA);
		
		Duration durationA = Duration.ofMinutes(120);
		System.out.println(durationA);
		// Teste para verificar a funcionalidade dos dois construtores.
		Voo vooA = new VooDireto(rotaA, localDateTimeA);
		Voo vooB = new VooEscalas(rotaA, localDateTimeA);
		System.out.println(vooA);
		System.out.println(vooB);

		// Calcular a distância entre dois aeroportos.
		

		// System.out.println(Geo.distancia(geoA, geoB));

	}
}
