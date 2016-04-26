package observer;

/**
 * Created by mics on 4/5/16.
 */
public class Observer implements ObserverInterface{
    private double data;
    private Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(double data) {
        this.data = data;
        System.out.println(data);
    }
}
