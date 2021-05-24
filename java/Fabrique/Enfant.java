package java.Fabrique;

public class Enfant extends Humain{
    public Enfant(){
        introduce();
    }

    @Override
    public void introduce() {
        System.out.println("Je suis un enfant !!!");
    }
}
