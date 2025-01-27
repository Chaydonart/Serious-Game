import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vente vente = new Vente();

        System.out.println("Bienvenue dans le système de calcul des ventes.");
        boolean continuer = true;

        while (continuer) {
            System.out.println("Ajout d'un produit :");

            System.out.print("Prix unitaire (€) : ");
            float prix = scanner.nextFloat();

            System.out.print("Quantité : ");
            int quantite = scanner.nextInt();

            System.out.println("Pays de livraison (1=France, 2=Espagne, 3=Allemagne, 4=Royaume-Uni, 5=Belgique) : ");
            int choixPays = scanner.nextInt();
            Pays pays;
            switch (choixPays) {
                case 1:
                    pays = Pays.France;
                    break;
                case 2:
                    pays = Pays.Espagne;
                    break;
                case 3:
                    pays = Pays.Allemagne;
                    break;
                case 4:
                    pays = Pays.RoyaumeUnis;
                    break;
                case 5:
                    pays = Pays.Belgique;
                    break;
                default:
                    System.out.println("Choix invalide. Par défaut, France sera utilisé.");
                    pays = Pays.France;
            }

            vente.ajouterProduit(new Produit(prix, pays, quantite));
            System.out.println("Produit ajouté avec succès !");

            System.out.print("Voulez-vous ajouter un autre produit ? (oui=1 / non=0) : ");
            int choix = scanner.nextInt();
            if (choix != 1) {
                continuer = false;
            }
        }

        // Calcul total
        float total = vente.calculTotal();
        System.out.printf("Le total de la vente après taxes et remises est : %.2f €\n", total);

        scanner.close();

    }
}