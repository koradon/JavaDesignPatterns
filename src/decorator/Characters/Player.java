package decorator.Characters;

/**
 * Created by mics on 4/7/16.
 */
public class Player extends Character{
    public Player() {
        this.dsc = "Player";
        this.baseDmg = 100;
    }

    public double damage(){
        return this.baseDmg;
    }
}
