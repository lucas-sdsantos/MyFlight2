package pucrs.myflight.consoleApp;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;

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

		// Teste dos métodos da classe CiaAerea
		CiaAerea ciaA = new CiaAerea("34534534355", "Gol");
		System.out.println("Cod.: " + ciaA.getCodigo() + "; Cia:"
		+ ciaA.getNome() + "\n");

		// Teste dos métodos da classe Geo
		Geo geoA = new Geo(172.1987, -67.6805);
		Geo geoB = new Geo(74.0824, -102.5554);
		Geo geoC = new Geo(-83.5016, -22.5664);
		System.out.println(geoA.getLatitude());
		System.out.println(geoA.getLongitude());
			// Calcular a distância entre dois pontos.
		System.out.println(geoA.distancia(geoB) + " Km");
		System.out.println(Geo.distancia(geoA, geoB) + " Km");
		System.out.println();

		// Teste dos métodos da classe Aeroporto
		Aeroporto aeroportoA = new Aeroporto("87994", "Aeroporto Salgado Filho", geoA);
		Aeroporto aeroportoB = new Aeroporto("60047", "Aeroporto Caxias do Sul", geoB);
		Aeroporto aeroportoC = new Aeroporto("48897", "Aeroporto de Guarulhos", geoC);
		System.out.println("Cod.: " + aeroportoA.getCodigo() + "; Aeroporto: "
		 + aeroportoA.getNome());
		System.out.println(aeroportoA.getLocal().getLatitude() + "; " + 
		aeroportoA.getLocal().getLongitude());

		// Teste dos métodos da classe Aeronave
		Aeronave aeronaveA = new Aeronave("9566543245", "eVTOL");
		System.out.printf("Cod.: %s; Descrição: %s%n", aeronaveA.getCodigo(), 
		aeronaveA.getDescricao());

		// Teste dos métodos da classe Rota
		Rota rotaA = new Rota(ciaA, aeroportoA, aeroportoB, aeronaveA);
		Rota rotaB = new Rota(ciaA, aeroportoB, aeroportoC, aeronaveA);
		System.out.println("Empresa: " + ciaA.getNome());
		System.out.println("Partida: " + aeroportoA.getNome());
		System.out.println("Destino: " + aeroportoB.getNome());
		System.out.println("Cod. Aeronave: " + ciaA.getCodigo());

		LocalDateTime localDateTimeA = LocalDateTime.of(2022, 9, 27, 16, 57);
		//System.out.println(localDateTimeA);

		// Teste para verificar a funcionalidade dos dois construtores.
		Voo vooA = new VooDireto(rotaA, localDateTimeA);
		Voo vooB = new VooEscalas(localDateTimeA);
		System.out.println(vooA.getDuracao().toMinutes());
		System.out.println(vooB);

	}
}
