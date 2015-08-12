/**
 * Created by Fortas & Gueroudj
 */
public class LivreInfo extends  Livre {
    private int nbreCd_Rom;
    private static int compLI=1;
    String code;

    public LivreInfo(String titre,Auteur[] lesAuteur, String editeur, int nbreCd_Rom) {
            super(titre, lesAuteur, editeur);
        this.nbreCd_Rom = nbreCd_Rom;
        code="LivreInfo"+compLI;
        compLI++;
    }

    public int getNbreCd_Rom() {
        return nbreCd_Rom;
    }

    public void setNbreCd_Rom(int nbreCd_Rom) {
        this.nbreCd_Rom = nbreCd_Rom;
    }


}
