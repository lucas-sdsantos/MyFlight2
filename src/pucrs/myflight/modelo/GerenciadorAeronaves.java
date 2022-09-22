package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves() {
        aeronaves = new ArrayList<>();
    }
    
    public void adiciona(Aeronave aviao) {
        aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas() { //TODO
        return null;
    }

    public Aeronave buscarPorCodigo(String cod) {
        for (Aeronave a : aeronaves) {
            if (a.getCodigo().equals(cod)) {
                return a;
            }
        }
        return null;
    }
}
