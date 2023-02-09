package Galletas;

import java.util.ArrayList;
import java.util.Map;

public class Galletasfortuna implements Frases{

    public Galletasfortuna() {

    }


    public void frases() {
        ArrayList palabras = new ArrayList();
        palabras.add("Hoy sera un gran dia");
        palabras.add("Mañana ganaras la lotería");
        palabras.add("Messi campeon del mundo");
        //System.out.println("Valor 1 "+ palabras.get(1));

        int a = (int) (Math.random() * 3);

        System.out.println("Tu frase del dia es: "+ palabras.get(a));

    }

}
