package adaptor;

/**
 * Created by mics on 4/8/16.
 */
public class Main {
    public static void main(String[] args){
        WildDuck wildDuck = new WildDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdaptor(wildTurkey);

        duckTest(wildDuck);
        duckTest(turkeyAdapter);
    }

    static void duckTest(Duck duck){
        duck.fly();
        duck.quacks();
    }
}
