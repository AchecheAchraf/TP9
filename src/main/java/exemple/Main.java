package exemple;
import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau monBandeau=new Bandeau();
        Scenario s=new Scenario(monBandeau);
        
        Agrendir a=new Agrendir();
        Deezomer d=new Deezomer();
        Clignoter c=new Clignoter();
        Rotater r=new Rotater();
        
        s.ajouterEffet(c,1);
        s.ajouterEffet(a,2);
        s.ajouterEffet(d,1);
        s.ajouterEffet(r,1);
        
        s.animer();
    }
}
