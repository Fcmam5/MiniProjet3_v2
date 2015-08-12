import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

/**x
 * Created by Fortas & Gueroudj
 */
public class GestionMediatheque {
    public static void main(String[] args) {

        Mediatheque mediatheque = new Mediatheque();
        Adherent adherent = new Adherent();
        //Produits produit=new Produits("","");
        String S1;
        String S2;
        String S4;
        String N; //Pour les noms
        Auteur[] S3 = new Auteur[3];
        Chanteur[] S5 = new Chanteur[3];
        Acteur[] S6 = new Acteur[3];

        System.out.println("Bienvenue chez la bibeliotheque G.F.biblio");
        System.out.println("Veuillez vous identifier \n 1.Administration \n 2.Adherant");
        Scanner in = new Scanner(System.in);
        int choix1 = in.nextInt();

        switch (choix1) {
            case 1:
                System.out.println("voullez vous \n 1.Ajouter produit \n 2.Retirer produit \n 3.Ajouter adherant\n 4.Retirer adherant");
                int choix2 = in.nextInt();
                System.out.println("Combien");
                int n = in.nextInt();
                switch (choix2) {
                    case 1:
                        System.out.println("Voulez vous Ajouter ?\n1.Un livre \n2.Un livre d'informatique \n3.Un CD \n3.Un DVD");
                        int choix3 = in.nextInt();

                        //Ajouter: LIVRE _ LIVREINFO _ CD _ DVD
                        switch (choix3) {
                            case 1:
                                //Add Livre
                                System.out.println("Donner le titre");
                                S1 = in.next();
                                System.out.println("Donner l'editeur");
                                S2 = in.next();

                                //Lecture des auteurs
                                do {
                                    System.out.println("Combien d'auteurs ? (Donner un nombre entre 1 et 3 svp!");
                                    n = in.nextInt();
                                }
                                while ((n < 1) || (n > 3));
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Donner l'auteur n." + i);

                                    // Creation d'un Auteur
                                    System.out.println("Le nom:");
                                    N = in.next();
                                    System.out.println("Nombre de publications: ");
                                    int nblp = in.nextInt();
                                    S3[i] = new Auteur(N, nblp);
                                }
                                mediatheque.listeProduitDisponible.add(new Livre(S1, S3, S2));
                                break;


                            case 2:
                                //livre info
                                System.out.println("Donner le titre");
                                S1 = in.next();
                                System.out.println("Donner l'editeur");
                                S2 = in.next();
                                System.out.println("Donner le nombres de CD_ROM associé");
                                int nc = in.nextInt();
                                //Lecture des auteurs
                                do {
                                    System.out.println("Combien d'auteurs ? (Donner un nombre entre 1 et 2 svp!");
                                    n = in.nextInt();
                                }
                                while ((n < 1) || (n > 2));
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Donner l'auteur n." + i);

                                    // Creation d'un Auteur
                                    System.out.println("Le nom:");
                                    N = in.next();
                                    System.out.println("Nombre de publications: ");
                                    int nblp = in.nextInt();
                                    S3[i] = new Auteur(N, nblp);
                                }
                                mediatheque.listeProduitDisponible.add(new LivreInfo(S1, S3, S2, nc));
                                ;
                                break;

                            case 3:
                                //cd
                                System.out.println("Donner le titre");
                                S1 = in.next();
                                System.out.println("Donner le nom du realisateur");
                                S2 = in.next();
                                System.out.println("Donner le nom du producteur");
                                S4 = in.next();
                                do {
                                    System.out.println("Combien de chanteurs ? (Donner un nombre entre 2 et 3 svp!");
                                    n = in.nextInt();
                                }
                                while ((n < 2) || (n > 3));
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Donner le chanteur n." + i);

                                    // Creation d'un chanteur
                                    System.out.println("Le nom:");
                                    N = in.next();
                                    S5[i] = new Chanteur(N);
                                }
                                mediatheque.listeProduitDisponible.add(new Cd(S1, S5, new Realisateur(S4), new Producteur(S4)));


                                break;
                            case 4:
                                //dvd
                                System.out.println("Donner le titre");
                                S1 = in.next();
                                System.out.println("Donner le nom du realisateur");
                                S2 = in.next();
                                System.out.println("Donner le nom du producteur");
                                S4 = in.next();
                                do {
                                    System.out.println("Combien d'acteurs ? (Donner un nombre entre 2 et 3 svp!");
                                    n = in.nextInt();
                                }
                                while ((n < 2) || (n > 3));
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Donner le acteur n." + i);

                                    // Creation d'un acteur
                                    System.out.println("Le nom:");
                                    N = in.next();
                                    S6[i] = new Acteur(N);
                                }
                                mediatheque.listeProduitDisponible.add(new Dvd(S1, S6, new Producteur(S4), new Realisateur(S4)));

                                ;
                                break;
                        }

            case 2:
                System.out.println("Donner le code du produit à retirer");
                mediatheque.listeProduitDisponible.remove(in.nextInt());
                break;
            case 3: //Ajouter adherent
                System.out.println("Donner le nom svp");
                S1 = in.next();
                System.out.println("Donner l'adresse :");
                System.out.println(" Nom de la rue:");
                S2 = in.next();
                System.out.println(" Numero de la rue:");
                int numR = in.nextInt();
                System.out.println(" Code postal:");
                int PostC = in.nextInt();

                mediatheque.listeAdherantABibelio.add(new Adherent(S1, new Adresse(numR, S2, PostC)));
                break;
            case 4:
                System.out.println("Donner le numero d'adherent à retirer");
                mediatheque.listeAdherantABibelio.remove(in.nextInt());
                break;

                        }
            case 2:
                System.out.println("Donner le code adherant");
                int code = in.nextInt();
                if (mediatheque.listeAdherantABibelio.get(code) != null) {
                    System.out.println("Voulez vous \n 1.Emprunter \n 2.Rendre");
                    int choix4 = in.nextInt();


                    switch (choix4) {
                        case 1:
                            System.out.println("Entrer le code du produit");
                            code = in.nextInt();
                            adherent.emprunteProduit(mediatheque.listeProduitDisponible.get(code));
                            mediatheque.listeProduitDisponible.remove(code);
                            break;
                        case 2:
                            System.out.println("Entrer le code du produit");
                            code = in.nextInt();
                            if (adherent.rendreProduit(code) != null)
                                mediatheque.AjouterProduit(adherent.rendreProduit(code));
                            break;
                    }
                }


        }

    }
}