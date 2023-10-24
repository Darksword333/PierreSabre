package personnages;

public class humain{
    private String nom;
    private String boissonFav;
    private int argent;

    public humain(String nom, String boissonFav, int argent){
        this.nom = nom;
        this.boissonFav = boissonFav;
        this.argent = argent;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void parler(String texte){
        System.out.println("(" + this.nom + ") - " + texte);
    }

    public void direBonjour(){
        parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFav + ".");
    }

    public void boire(String boisson){
        parler("Mmmm, Un bon verre de " + boisson + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix){
        if (this.argent >= prix){
            parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix + " sous");
            this.argent -= prix;
        } else {
            parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux pas m'offrir un(e) " + bien + " à " + prix + " sous");
        }
    }

    public void gagnerArgent(int gain){
        parler("Je viens de gagner " + gain + " pièces d'or ! Génial !");
        this.argent += gain;
    }

    public void perdreArgent(int perte){
        parler("Je viens de perdre " + perte + " pièces d'or ! Snif !");
        this.argent -= perte;
    }
}
