package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

    public void adicionar(CiaAerea cia) {
        
    }

    public ArrayList<CiaAerea> listarTodas() { //TODO
        return null;
    }

    public CiaAerea buscarCodigo(String cod) {
        for (CiaAerea c : empresas) {
            if (c.getCodigo().equals(cod)) {
                return c;
            }
        }
        return null;
    }
    
    public CiaAerea buscarNome(String cod) {
        for (CiaAerea c : empresas) {
            if (c.getNome().equals(cod)) {
                return c;
            }
        }
        return null;
    }
}
