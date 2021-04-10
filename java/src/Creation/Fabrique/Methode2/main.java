package Creation.Fabrique.Methode2;

public class main {
    public static void main(String[] args){
        FabriqueProduit fabriqueProduit=new FabriqueProduit();
        ProduitA produitA=null;

        produitA=fabriqueProduit.getProduitA(FabriqueProduit.Type_A1);
        produitA.methodA();

        produitA=fabriqueProduit.getProduitA(FabriqueProduit.Type_A2);
        produitA.methodA();


        produitA=fabriqueProduit.getProduitA(3);
        produitA.methodA();


    }

}
