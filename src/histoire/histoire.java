package histoire;
import personnages.humain;

public class histoire {
    public static void main (String[] args) {
        humain prof = new humain("Prof", "kombucha", 54);
        prof.acheter("boisson", 12);
        prof.boire("kombucha");
        prof.acheter("jeu", 2);
        prof.acheter("kimono", 50);
    }
}