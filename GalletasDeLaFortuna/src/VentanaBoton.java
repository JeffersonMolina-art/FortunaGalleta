import Galleta.GalletasFortuna;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBoton extends JFrame{

    private JButton Boton1;
    private JPanel VENTANA;

    public VentanaBoton(){
        add(VENTANA);

        setSize(500,300);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Conoce tu suerte, abre una galleta de la fortuna");

        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GalletasFortuna cookie =new GalletasFortuna();
                String frase_muestra = (String) cookie.Frases_Galletas();
                JOptionPane.showMessageDialog(VENTANA, frase_muestra);

            }
        });
    }
}
