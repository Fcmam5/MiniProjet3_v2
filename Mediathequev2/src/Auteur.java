import java.util.ArrayList;

/**
 * Created by fcmam5 on 06/05/15.
 */
public class Auteur extends Personne {
    private int nbrePublications;

    public Auteur(String fullName, int nbrePublications) {
        super(fullName);
        this.nbrePublications = nbrePublications;
    }

    public int getNbrePublications() {
        return nbrePublications;
    }

    public void setNbrePublications(int nbrePublications) {
        this.nbrePublications = nbrePublications;
    }
}
