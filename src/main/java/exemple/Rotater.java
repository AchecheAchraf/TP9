package exemple;

import bandeau.Bandeau;
import java.util.Random;
import java.awt.Color;


public class Rotater extends Effet{ 
    public Rotater(){}

    @Override
    public void faireEffet(Bandeau monBandeau) {
        Random random = new Random();
        for (int i = 5; i < 45; i += 5) {
            monBandeau.setMessage("Ending");
            monBandeau.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            monBandeau.sleep(150);
            monBandeau.setRotation(Math.PI / 2.0f);
            monBandeau.sleep(150);
            monBandeau.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            monBandeau.setRotation(0.0f);
            monBandeau.sleep(150);
            monBandeau.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            monBandeau.setRotation(4.0f);
        }
        
    }
}
