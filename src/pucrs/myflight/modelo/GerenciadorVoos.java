package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;
    
    GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public void adicionar(Voo umVoo){
        voos.add(umVoo);
    }

    public ArrayList<Voo> listarTodos() {
        return voos;
    }

    public ArrayList<Voo> buscarData(LocalDateTime date) {
        ArrayList<Voo> atDate = new ArrayList<>();
        for (Voo i: voos){
            if (i.getDatahora().isEqual(date)){
                atDate.add(i);
            }
        }
        return atDate;
    }
}
