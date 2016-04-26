package composition.actions.talk;

/**
 * Created by mics on 4/5/16.
 */
public class Shout implements TalkInterface {
    @Override
    public void talk() {
        System.out.println("    SHOUTING!");
    }
}
