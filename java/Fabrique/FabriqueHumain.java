package java.Fabrique;

public class FabriqueHumain {

    private static FabriqueHumain instance = new FabriqueHumain();

    private FabriqueHumain(){
        super();
    }

    public static FabriqueHumain getInstance(){
        return instance;
    }

    public Humain creerHumain (String humain) throws Exception {
        if(humain.equalsIgnoreCase("homme")){
            return new Homme();
        }
        else if (humain.equalsIgnoreCase("femme")){
            return new Femme();
        }
        else if (humain.equalsIgnoreCase("enfant")){
            return new Enfant();
        }
        else {
            throw new Exception("Impossible de créer un : " + humain);
        }
    } 
    
}
