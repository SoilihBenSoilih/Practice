package Creation.Fabrique.Methode1;

public class FabriqueProduit2 extends FabriqueProduit{

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA2();
    }
}
