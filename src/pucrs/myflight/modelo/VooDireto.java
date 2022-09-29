import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto implements Voo{

  private Rota rota;
  public VooDireto(Rota rota, LocalDateTime datahora){
    super(rota, datahora);
  }
}