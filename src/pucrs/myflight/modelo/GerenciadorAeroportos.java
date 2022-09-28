package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;
    
    GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    public void ordenaNome(){
        Collections.sort(this.aeroportos);
    }

    public void adicionar(Aeroporto aero) {
        aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos() { //TODO
        return null;
    }

    public Aeroporto buscarPorCodigo(String cod) {
        for (Aeroporto a : aeroportos) {
            if (a.getCodigo().equals(cod)) {
                return a;
            }
        }
        return null;
    }
}
