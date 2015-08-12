import java.util.ArrayList;

/**
 * Created by Fortas & Gueroudj

 */

public class Adherent extends Personne {
    private Adresse adresse;
    private static int codeAdh = 0;
    private ArrayList<Produits> produitEmprunte;

    public Adherent(String fullName, Adresse adresse) {
        super(fullName);
        this.adresse = adresse;
        codeAdh++;
    }


    public Adherent() {
       super();
    }


    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public static int getCodeAdh() {
        return codeAdh;
    }
    Mediatheque mediatheque = new Mediatheque();
    public void emprunteProduit(Produits produit){
        if(produitEmprunte.size()<5){
            //Recherche :
           if(mediatheque.listeProduitDisponible.contains(produit)) {
               System.out.println("Le livre est disponible");
               produitEmprunte.add(produit);
               mediatheque.RetirerProduit(produit);

           }
            else
               System.out.println("Le livre n'est pas disponible");
        }
        else System.out.println("vous avez depasser le nombre maximal de produit a emprunter");
    }
    public Produits rendreProduit(int codeP){

        if(produitEmprunte.contains(produitEmprunte.indexOf(codeP))) {
            Produits prod= produitEmprunte.get(codeP) ;
            produitEmprunte.remove(produitEmprunte.indexOf(codeP));
            return prod;
        }
         return null;
    }

    public void livreEmpuntes(){
        for (int i = 0; i < produitEmprunte.size(); i++) {
            System.out.println(produitEmprunte.get(i).getTitre());

        }
    }
    }
