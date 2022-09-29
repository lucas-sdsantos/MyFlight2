package pucrs.myflight.consoleApp;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
		System.out.println("Latitude geoA: " + geoA.getLatitude());
		System.out.println("Latitude geoA: " + geoA.getLongitude());
		System.out.println();
		
		// Calcular a distância entre dois pontos.
		System.out.println("Distancia entre geoA e geoB: " + geoA.distancia(geoB) + " Km");
		//System.out.println(Geo.distancia(geoA, geoB) + " Km");
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
		System.out.println();

		// Teste dos métodos da classe Rota
		Rota rotaA = new Rota(ciaA, aeroportoA, aeroportoB, aeronaveA);
		Rota rotaB = new Rota(ciaA, aeroportoB, aeroportoC, aeronaveA);
		System.out.println("rotaA: ");
		System.out.println("Empresa: " + ciaA.getNome());
		System.out.println("Partida: " + aeroportoA.getNome());
		System.out.println("Destino: " + aeroportoB.getNome());
		System.out.println("Cod. Aeronave: " + ciaA.getCodigo());
		System.out.println();

		LocalDateTime localDateTimeA = LocalDateTime.of(2022, 9, 27, 16, 57);
		
		// Teste dos métodos das classes VooDireto e VooEscalas.
		VooDireto vooA = new VooDireto(rotaA, localDateTimeA);
		VooEscalas vooB = new VooEscalas(localDateTimeA);

		vooB.adicionarRota(rotaA);
		vooB.adicionarRota(rotaB);
		
		System.out.println("vooA parte de " + vooA.getRota().getOrigem().getNome() + " e vai para " 
		+ vooA.getRota().getDestino().getNome() + " com duração de " + vooA.getDuracao().toMinutes());
		System.out.println();

		ArrayList<Rota> rotasB = vooB.getRotas();
		System.out.println("vooB parte de " + vooB.getRota().getOrigem().getNome() + " e vai para " + 
		rotasB.get(1).getDestino().getNome() + " passando por " + vooB.getRota().getDestino().getNome() + 
		"com duração de " + vooB.getDuracao().toMinutes());


	}
}
