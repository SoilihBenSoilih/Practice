package Creation.Fabrique.Methode2;

public class FabriqueProduit {
    public static final int Type_A1=1;
    public static final int Type_A2=2;

    public ProduitA getProduitA(int type_Produit){
        ProduitA produitA=null;

        if (type_Produit==Type_A1){
            produitA=new ProduitA1();
        }else if(type_Produit==Type_A2){
            produitA=new ProduitA2();
        }else {
            throw new IllegalArgumentException("Type de produit inconnu");
        }
        return produitA;
    }



}
