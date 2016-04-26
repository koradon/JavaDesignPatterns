package decorator.Characters;

/**
 * Created by mics on 4/7/16.
 */
public class Enemy extends Character{
    public Enemy() {
        this.dsc = "Enemy";
        this.baseDmg = 50;
    }

    @Override
    public double damage() {
        return this.baseDmg;
    }
}
