package Creation.Fabrique.Methode1;

public class FabriqueProduit1 extends FabriqueProduit{


    @Override
    protected ProduitA createProduitA() {
        return new ProduitA1();
    }
}
