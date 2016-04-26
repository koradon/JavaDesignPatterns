package singleton;

/**
 * Created by mics on 4/5/16.
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton uInstance;

    private SynchronizedSingleton() {
    }

    /*
    Ten singleton załatwia nam problem dostepu przy wielowatkowości ale jest bardzo kosztowny czasowo.
    Do tego synchronizacja czasów dostepu do metody jest tylko i wyłacznie potrzebna gdy pierwszy raz
     uzywamy metody.

     Jeżeli wywołanie tej metody nie wpływa krytycznie na pracę aplikacji nie rób nic. A może zmniejszyć
     szybkość działania nawet 100 krotnie jesli będziemy sie często do niej odwoływać.

     Jeżeli wpływa zastosuj:
      - AheadSingleton
      - DoubleCheckedLockingSingleton.
     */
    public static synchronized SynchronizedSingleton getuInstance(){
        if(uInstance == null){
            uInstance = new SynchronizedSingleton();
        }
        return uInstance;
    }
}
