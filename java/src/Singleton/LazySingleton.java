package Singleton;

public class LazySingleton {
    private String variable;
    private static  LazySingleton lazysingleton=null;


    private LazySingleton() { }

    public static LazySingleton getInstance(){
        if (lazysingleton==null)
            lazysingleton=new LazySingleton();
        return lazysingleton;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}
