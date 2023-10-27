package exemple;

import bandeau.Bandeau;

import java.util.List;
import java.util.ArrayList;


public class Scenario {
    List<Effet> effets=new ArrayList<>();
    Bandeau monBandeau; 

    public Scenario(Bandeau bandeau) {
        this.monBandeau = bandeau;
    }

    public void ajouterEffet(Effet e,int nb) {
        for (int i = 0; i < nb; i++) {
            effets.add(e);
        }
    }


    public void animer() {
        for (Effet e : effets) {
            e.faireEffet(monBandeau);
        }
        monBandeau.close();
    }
}
