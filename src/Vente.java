import java.util.*;

public class Vente {
    private List<Produit> produits;

    public Vente() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public float calculRemise(float total) {
        if (total > 150 && total <= 200) {
            return 0.02f;
        } else if (total > 200 && total <= 300) {
            return 0.03f;
        } else if (total > 300 && total <= 500) {
            return 0.05f;
        } else if (total > 500 && total <= 1000) {
            return 0.07f;
        } else if (total > 1000) {
            return 0.1f;
        } else {
            return 0.0f;
        }
    }

    private float calculeTaxe(Pays pays) {
        switch (pays) {
            case France:
                return 0.20f;
            case Espagne:
                return 0.182f;
            case Allemagne:
                return 0.156f;
            case RoyaumeUnis:
                return 0.228f;
            case Belgique:
                return 0.17f;
            default:
                return 0.0f;
        }
    }

    public float calculTotal() {
        float total = 0;
        for (Produit produit : produits) {
            float prixHT = produit.getPrixTotal();
            float taxe = calculeTaxe(produit.getPays());
            total += prixHT * (1 + taxe);
        }

        // Application de la remise
        float remise = calculRemise(total);
        return total * (1 - remise);
    }

}
