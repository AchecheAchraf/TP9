package exemple;

import bandeau.Bandeau;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;

public class Clignoter extends Effet{
    public Clignoter(){}

    @Override
    public void faireEffet(Bandeau monBandeau) {
        Random random = new Random();
        for (int i = 5; i < 100; i += 5) {
            monBandeau.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            monBandeau.setMessage("Introduction");
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 30));
            monBandeau.sleep(100);
            monBandeau.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            monBandeau.setMessage("");
            monBandeau.sleep(100);
        }
     
    }
}
