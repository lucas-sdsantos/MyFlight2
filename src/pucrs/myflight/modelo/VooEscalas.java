package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo{

  private Rota rota;
  private ArrayList<Rota> rotas;

  public VooEscalas (Rota rota, LocalDateTime datahora){
    super(datahora);
    this.rota = rota;
    rotas = new ArrayList<>();
    rotas.add(rota);
  }

  public void adicionarRota(Rota rota){
    rotas.add(rota);
  }

  public Duration getDuracao(){
    long duracaoEmMin = 0;
    Geo localizacaoOrigem;
    Geo localizacaoDestino;
    double distancia = 0;

    for (Rota i: rotas){
      localizacaoOrigem = rota.getOrigem().getLocal();
      localizacaoDestino = rota.getDestino().getLocal();
      distancia += Geo.distancia(localizacaoOrigem, localizacaoDestino);
    }
    
    duracaoEmMin += Math.round((distancia/60) + 30); //Isso só vai funcionar se a distância na fórmula for dada em Km.
    Duration duracaoDeVoo = Duration.ofMinutes((duracaoEmMin));
    return duracaoDeVoo;
  }

  public Rota getRota(){
    return rota;
  }

  public ArrayList<Rota> getRotas(){
    return rotas;
  }

  /* 
  @Override
  public String toString(){
    return super.toString() + " -> " + rotaFinal;
  }
  */
}