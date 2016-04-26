package singleton;

/**
 * Created by mics on 4/5/16.
 */
public class SimpleSingleton {
    private static SimpleSingleton uInstance;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getuInstance(){
        if(uInstance == null){
            uInstance = new SimpleSingleton();
        }
        return uInstance;
    }

}
