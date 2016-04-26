package observer;

/**
 * Created by mics on 4/5/16.
 */
public class Main {
    public static void main(String[] args){
        Subject sub = new Subject();
        sub.setData(10);
        Observer ob1 = new Observer(sub);
        Observer ob2 = new Observer(sub);

        sub.setData(20);
        sub.setData(15);
    }
}
