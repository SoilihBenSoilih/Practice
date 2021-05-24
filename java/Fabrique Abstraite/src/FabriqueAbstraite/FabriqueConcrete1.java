package FabriqueAbstraite;

public class FabriqueConcrete1 implements FabriqueAbstraite{

	@Override
	public ProduitAbstraitA creerProduitA() {
		return new ProduitA1();
	}

	@Override
	public ProduitAbstraitB creerProduitB() {
		// TODO Auto-generated method stub
		return new ProduitB1();
	}

}
