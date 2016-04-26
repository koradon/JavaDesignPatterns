package singleton;

/**
 * Created by mics on 4/5/16.
 */
public class AheadSingleton {
    /*
    Tworzenie obiektu z wyprzedzeniem a nie opóxnieniem w statycznym przypisaniu do zmiennej.
    Nie ma potrzeby stosowania Synchronizacji.
    Obiekt zostaje utworzony zaraz po załadowaniu klasy przez maszyne wirtualną.
     */

    private static AheadSingleton uInstance = new AheadSingleton();

    private AheadSingleton() {
    }

    public static AheadSingleton getuInstance(){
        return uInstance;
    }
}
