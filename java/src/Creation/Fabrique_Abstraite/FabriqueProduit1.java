package Creation.Fabrique_Abstraite;

public class FabriqueProduit1 implements IFabriqueProduit{
    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }

    @Override
    public ProduitC getProduitC() {
        return new ProduitC1();
    }
}
