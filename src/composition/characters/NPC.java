package composition.characters;

import composition.actions.attack.StrongAttack;
import composition.actions.talk.NormalTalk;

/**
 * Created by mics on 4/5/16.
 */
public class NPC extends Character{
    public NPC() {
        attackInterface = new StrongAttack();
        talkInterface = new NormalTalk();
    }

    @Override
    public void print() {
        System.out.println("Iam NPC");
    }
}
