import Galleta.GalletasFortuna;

import javax.swing.*;
import java.util.Scanner;

public class Main extends GalletasFortuna {
    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                VentanaBoton Primer = new VentanaBoton();
                Primer.setVisible(true);
            }
        });


    }
}
