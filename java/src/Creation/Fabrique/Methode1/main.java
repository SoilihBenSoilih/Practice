package Creation.Fabrique.Methode1;

public class main {

    public static void main(String[] args){
        FabriqueProduit fabriqueProduit1=new FabriqueProduit1();
        FabriqueProduit fabriqueProduit2=new FabriqueProduit2();
        ProduitA produitA=null;


        produitA = fabriqueProduit1.getProduitA();
        produitA.methodA();


        produitA = fabriqueProduit2.getProduitA();
        produitA.methodA();

    }
}
