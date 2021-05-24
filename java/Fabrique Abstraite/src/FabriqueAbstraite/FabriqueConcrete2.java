package FabriqueAbstraite;

public class FabriqueConcrete2 implements FabriqueAbstraite{

	@Override
	public ProduitAbstraitA creerProduitA() {
		return new ProduitA2();
	}

	@Override
	public ProduitAbstraitB creerProduitB() {
		return new ProduitB2();
	}

}
