package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;


public abstract class Voo {
	
	//public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	//private Duration duracao;
	//private Rota rota;
	//private Status status;
	
	public Voo(LocalDateTime datahora) {
		//this.rota = rota;
		this.datahora = datahora;
		//this.duracao = duracao;
		//this.status = Status.CONFIRMADO; // default é confirmado
	}

  /*
	public Voo(Rota rota, Duration duracao) {
		this.rota = rota;
		datahora = LocalDateTime.of(2016, 8,  12, 12, 00);
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}
  */
	
	public abstract Rota getRota();
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public abstract Duration getDuracao();

  /*
	public Status getStatus() {
		return status;
	}
	
  
	public void setStatus(Status novo) {
		this.status = novo;
	}
*/


/*
  public String toString() {
       return status + " " + datahora + "("+duracao+"): " + rota + " -> " + rotaFinal;
    }
   */
}
