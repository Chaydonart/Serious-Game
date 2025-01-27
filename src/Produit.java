public class Produit {
    private float prix;
    private Pays pays;
    private int quantite;

    // Constructeur
    public Produit(float prix, Pays pays, int quantite) {
        this.prix = prix;
        this.pays = pays;
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public Pays getPays() {
        return pays;
    }

    public int getQuantite() {
        return quantite;
    }

    public float getPrixTotal() {
        return prix * quantite;
    }
}
