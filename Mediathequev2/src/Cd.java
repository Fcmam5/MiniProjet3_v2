/**
 * Created by Fortas & Gueroudj
 */
public class Cd extends Produits {
    private Chanteur[] listeChanteur;
    private Realisateur realisateur;
    private Producteur producteur;
    private static int comptCd = 1;

//alt insert sayiha mtn

    public Cd(String titre, Chanteur[] listeChanteur, Realisateur realisateur, Producteur producteur) {
        super(titre, "CD"+comptCd);
        this.listeChanteur = listeChanteur;
        this.realisateur = realisateur;
        this.producteur = producteur;
        comptCd++;
    }

    public Chanteur[] getListeChanteur() {
        return listeChanteur;
    }

    public void setListeChanteur(Chanteur[] listeChanteur) {
        this.listeChanteur = listeChanteur;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }

    public Producteur getProducteur() {
        return producteur;
    }

    public void setProducteur(Producteur producteur) {
        this.producteur = producteur;
    }

    public static int getComptCd() {
        return comptCd;
    }

}
