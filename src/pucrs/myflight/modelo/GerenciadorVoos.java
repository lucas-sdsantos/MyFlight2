package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;
    
    GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public ArrayList<Voo> listarTodos() { //TODO
        return null;
    }

    public ArrayList<Voo> buscarData(LocalDateTime date) { //TODO
        ArrayList<Voo> atDate = new ArrayList<>();
        for (Voo i: voos){
            if (i.getDatahora().isEqual(date)){
                atDate.add(i);
            }
        }
        return atDate;
    }
}
