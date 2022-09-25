package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas() {
        rotas = new ArrayList<>();
    }
    
    public ArrayList<Rota> listarTodos() { //TODO
        return null;
    }

    public ArrayList<Rota> buscasPorOrigem (Aeroporto orig) {
        ArrayList<Rota> rotaOrigem = new ArrayList<Rota>();
        for (Rota r : rotas) {
            if (r.getOrigem().equals(orig)) {
                rotaOrigem.add(r);
            }
        }
        return rotaOrigem;
    }
}
