package composition.characters;

import composition.actions.attack.NormalAttack;
import composition.actions.talk.Shout;

/**
 * Created by mics on 4/5/16.
 */
public class Player extends Character {
    public Player() {
        attackInterface = new NormalAttack();
        talkInterface = new Shout();
    }

    @Override
    public void print() {
        System.out.println("Iam a player");
    }
}
