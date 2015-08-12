/**
 * Created by fcmam5 on 06/05/15.
 */
public class Adresse {

    private int numeroRue;
    private String nomRue;
    private int codePostal;

    public Adresse(int numeroRue, String nomRue, int codePostal) {
        this.numeroRue = numeroRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
    }

    public int getNumeroRue() {
        return numeroRue;
    }
    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }
    public String getNomRue() {
        return nomRue;
    }
    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }
    public int getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numeroRue=" + numeroRue +
                ", nomRue='" + nomRue + '\'' +
                ", codePostal=" + codePostal +
                '}';
    }
}
