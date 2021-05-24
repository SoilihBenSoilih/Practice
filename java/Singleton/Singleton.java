package java.Singleton;

public final class Singleton {

    // L'utilisation du mot clé volatile empêche les effets de bord 
    // dû aux copies locales de l'instance qui peuvent être modifiées
    // dans le thread principal. Le thread est aussi appelé contexte
    // dans d'autres langages commen Javascript notamment.
    private static volatile Singleton instance = null;

    private Singleton () {
        //le mot clé super ne sert pas à grand chose étant donné qu'il
        //appelle le constructeur de la classe parente qui n'existe pas.
        super();
    }

    public final static Singleton getInstance (){
        if(Singleton.instance == null){
            // Le mot-clé synchronized sur ce bloc empêche toute instanciation
            // multiple même par différents "threads".
            //un thread est un fil d'exécution de code.
            synchronized(Singleton.class){
                if (Singleton.instance == null) {
                Singleton.instance = new Singleton();
                }
            }
        }
        return Singleton.instance;
    }

}