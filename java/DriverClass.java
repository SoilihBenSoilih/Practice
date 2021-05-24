package java;

import java.Fabrique.FabriqueHumain;
import java.Fabrique.Humain;

public class DriverClass {
    public static void main(String[] args) {
        FabriqueHumain fabrique = FabriqueHumain.getInstance();
        try {
            Humain humain = fabrique.creerHumain("homme");
        } catch (Exception e) {
            e.getMessage();
        }  
    }
}