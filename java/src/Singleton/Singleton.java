package Singleton;

public class Singleton {
    private String variable;
    private static  Singleton singleton=new Singleton();


    private Singleton() { }

    public static Singleton getInstance(){
        return singleton;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}
