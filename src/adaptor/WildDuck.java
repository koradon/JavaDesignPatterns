package adaptor;

/**
 * Created by mics on 4/8/16.
 */
public class WildDuck implements Duck {
    public WildDuck() {
    }

    @Override
    public void quacks() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("Long fly");
    }
}
