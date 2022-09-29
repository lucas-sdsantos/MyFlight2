package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo{

  private Rota rota;

  public VooDireto(Rota rota, LocalDateTime datahora){
    super(datahora);
    this.rota = rota;
  }

  public Duration getDuracao(){
    Geo localizacaoOrigem = rota.getOrigem().getLocal();
    Geo localizacaoDestino = rota.getDestino().getLocal();
    double distancia = Geo.distancia(localizacaoOrigem, localizacaoDestino);
    long duracaoEmMin = Math.round((distancia/60) + 30); //Isso só vai funcionar se a distância na fórmula for dada em Km.
    Duration duracaoDeVoo = Duration.ofMinutes((duracaoEmMin));
    return duracaoDeVoo;
  }

  public Rota getRota(){
    return rota;
  }
}