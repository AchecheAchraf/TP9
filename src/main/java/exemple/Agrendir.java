package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;


public class Agrendir extends Effet{ 
    public Agrendir(){}

    @Override
    public  void  faireEffet(Bandeau monBandeau) {
        Random random = new Random();
        for (int i = 5; i < 90; i += 5) {
            monBandeau.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            monBandeau.setMessage("ZoomIn Animation");
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 30 + i));
            monBandeau.sleep(100);
        }
        
    }
}
