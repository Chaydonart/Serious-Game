public class Produit {
    private float prix;
    private Pays pays;

    public float getPrix() {
        return prix;
    }

    public float getTaxe(){
        return taxe(this.pays);
    }

    private float taxe(Pays pays){
        switch(pays){
            case France :
                return 0.20f;
            case Espagne :
                return 0.182f;
            case Allemagne:
                return 0.156f;
            case RoyaumeUnis:
                return 0.228f;
            case Belgique:
                return 0.17f;
            default:
                return 1;
        }
    }

}
