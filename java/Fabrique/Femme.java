package java.Fabrique;

public class Femme extends Humain{
    public Femme(){
        introduce();
    }

    @Override
    public void introduce() {
        System.out.println("Je suis une femme !!!");
    }
}
