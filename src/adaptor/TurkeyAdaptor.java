package adaptor;

/**
 * Created by mics on 4/8/16.
 */
public class TurkeyAdaptor implements Duck {
    Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quacks() {
        turkey.gugles();
    }

    @Override
    public void fly() {
        turkey.shortfly();
        turkey.shortfly();
    }
}
