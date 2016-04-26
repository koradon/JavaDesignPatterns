package buildingPatterns.singleton;

/**
 * Created by mics on 4/5/16.
 */
public class DoubleCheckedLockingSingleton {
    /*
    Słowo volatile sprawia że zmienna jest prawidłowo traktowana w środowisku wielowatkowym, kiedy przypisujemy
    do niej nowy obiekt.
     */
    private volatile static DoubleCheckedLockingSingleton uInstance;

    private DoubleCheckedLockingSingleton() {
    }

    /*
    Najpierw sprawdzamy czy instancja naszego obiektu juz istnieje a dopiero potem synchronizujemy jej utwozenie.
    Synchronizacja działa tylko przy pierwszym uruchomieniu metody.
    Najlepsze rozwiazanie gdy krytyczny jest czas działania metody getuInstance.

    Ta metoda działa dla JVM 1.5 i nowszych.
     */
    public static DoubleCheckedLockingSingleton getuInstance(){
        if(uInstance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                uInstance = new DoubleCheckedLockingSingleton();
            }
        }
        return uInstance;
    }
}
