package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;
    
    GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aero) { //TODO
        
    }

    public ArrayList<Aeroporto> listarTodos() { //TODO
        return null;
    }

    public Aeroporto buscarPorCodigo(String cod) { //TODO
        for (Aeroporto a : aeroportos) {
            if (a.getCodigo().equals(cod)) {
                return a;
            }
        }
        return null;
    }
}
