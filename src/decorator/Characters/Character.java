package decorator.Characters;

/**
 * Created by mics on 4/7/16.
 */
public abstract class Character {
    String dsc = "Character";
    double baseDmg;

    public String getDsc(){
        return dsc;
    }

    public abstract double damage();
}
