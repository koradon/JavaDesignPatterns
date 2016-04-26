package observer;

/**
 * Created by mics on 4/5/16.
 */
public interface SubjectInterface {
    void addObserver(ObserverInterface o);
    void removeObserver(ObserverInterface o);
    void notifyObservers();
}
