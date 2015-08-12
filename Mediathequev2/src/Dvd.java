/**
 * Created by Fortas & Gueroudj
 */
public class Dvd extends Produits {
    private Acteur[] lesActeursDeDvd;
    private Producteur producteur;
    private Realisateur realisateur;
    private static int compDVD=1;


    public Dvd(String titre, Acteur[] lesActeursDeDvd, Producteur producteur, Realisateur realisateur) {
        super(titre, "Dvd"+compDVD);
        this.lesActeursDeDvd = lesActeursDeDvd;
        this.producteur = producteur;
        this.realisateur = realisateur;
        compDVD++;
    }

    public Acteur[] getLesActeursDeDvd() {
        return lesActeursDeDvd;
    }

    public void setLesActeursDeDvd(Acteur[] lesActeursDeDvd) {
        this.lesActeursDeDvd = lesActeursDeDvd;
    }

    public Producteur getEditeur() {
        return producteur;
    }

    public void setEditeur(Producteur producteur) {
        this.producteur = producteur;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }
}
