package Galleta;

public class GalletasFortuna implements FrasesGalletas{

    public GalletasFortuna(){}

    @Override
    public Object Frases_Galletas() {
        String[] frases = {
                "Tendras un gran dia",
                "La persona indicada llegara pronto",
                "Te llegara un mensaje que cambiara tu dia",
                "Un viejo conocido tendra un recuento contigo",
                "Sigue tus instintos te llevara por un buen camino",
                "Tendras mala suerte",
                "La vida te dara una grata recompensa",
                "Ten cuidado con las personas",
                "Cuidadete de las mascotas domesticas",
                "Preparate vendra un problema"
        };

        int conteo = (int) (Math.random() * 10);
        return frases[conteo];

    }
}
