/**
 * Created by Fortas & Gueroudj
 */
public class Livre extends Produits {
    private Auteur[] lesAuteur = new Auteur[3];
    private String editeur;
    public static int comptLivre=1;

    public Livre(String titre, Auteur[] lesAuteur, String editeur) {
        super(titre, "Livre"+comptLivre);
        this.lesAuteur = lesAuteur;
        this.editeur = editeur;
        comptLivre++;
    }

    public Auteur[] getLesAuteur() {
        return lesAuteur;
    }

    public void setLesAuteur(Auteur[] lesAuteur) {
        this.lesAuteur = lesAuteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public static int getComptLivre() {
        return comptLivre;
    }


}
