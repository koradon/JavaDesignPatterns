package adaptor;

/**
 * Created by mics on 4/8/16.
 */
public class WildTurkey implements Turkey {
    public WildTurkey() {
    }

    @Override
    public void gugles() {
        System.out.println("gulgulgul");
    }

    @Override
    public void shortfly() {
        System.out.println("short fly");
    }
}
