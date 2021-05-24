package java.Fabrique;

public class Homme extends Humain{
    public Homme(){
        introduce();
    }

    @Override
    public void introduce() {
        System.out.println("Je suis un homme !!!");
    }
}
