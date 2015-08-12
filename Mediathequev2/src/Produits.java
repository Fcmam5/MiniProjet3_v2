/**
 * Created by Fortas & Gueroudj
 */
public class Produits {
    private String titre;
    private String code;

    public Produits(String titre, String code) {
        this.titre = titre;
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}