import java.util.ArrayList;

/**
 * Created by Fortas & Gueroudj
 */
public class Mediatheque {
    public ArrayList<Produits> listeProduitDisponible;
    public ArrayList<Adherent> listeAdherantABibelio;


    void AjouterProduit(Produits produit){
        listeProduitDisponible.add(produit);
    }

    void RetirerProduit(Produits produit){
        listeProduitDisponible.remove(produit);
    }

    void Ajouteradherant(Adherent adherent){listeAdherantABibelio.add(adherent);}
    void retireradherant(Adherent adherent){listeAdherantABibelio.remove(adherent);}


}
