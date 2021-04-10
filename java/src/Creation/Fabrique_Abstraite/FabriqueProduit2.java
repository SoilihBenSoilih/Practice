package Creation.Fabrique_Abstraite;

public class FabriqueProduit2 implements IFabriqueProduit{
    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }

    @Override
    public ProduitC getProduitC() {
        return new ProduitC2();
    }
}
