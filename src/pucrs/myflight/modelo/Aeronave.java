package pucrs.myflight.modelo;

public class Aeronave implements Contavel {
	private static int contAeronaves = 0;
	private String codigo;
	private String descricao;

	public Aeronave(String codigo, String descricao) {
		contAeronaves++;
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int contar(){
		return contAeronaves;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
