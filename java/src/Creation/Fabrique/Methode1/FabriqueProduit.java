package Creation.Fabrique.Methode1;

public abstract class FabriqueProduit {
    public ProduitA getProduitA(){
        return createProduitA();
    }
    protected abstract ProduitA createProduitA();
}
