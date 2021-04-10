package Creation.Fabrique_Abstraite;

public class main {
    public static void main(String [] args){
        IFabriqueProduit fabriqueProduit1=new FabriqueProduit1();
        IFabriqueProduit fabriqueProduit2=new FabriqueProduit2();

        ProduitA produitA=null;
        ProduitB produitB=null;
        ProduitC produitC=null;

        produitA=fabriqueProduit1.getProduitA();
        produitA.methodA();
        produitB=fabriqueProduit1.getProduitB();
        produitB.methodB();
        produitC=fabriqueProduit1.getProduitC();
        produitC.methodC();

        produitA=fabriqueProduit2.getProduitA();
        produitA.methodA();
        produitB=fabriqueProduit2.getProduitB();
        produitB.methodB();
        produitC=fabriqueProduit2.getProduitC();
        produitC.methodC();



    }
}
