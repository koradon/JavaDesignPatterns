package composition;

import composition.actions.attack.StrongAttack;
import composition.actions.talk.NormalTalk;
import composition.characters.Character;
import composition.characters.NPC;
import composition.characters.Player;

/**
 * Created by mics on 4/5/16.
 */
public class Main {
    public static void main(String[] args){
        Character player = new Player();
        Character npc = new NPC();

        player.print();
        player.doAtack();
        player.doTalk();

        npc.print();
        npc.doTalk();
        npc.doAtack();

        player.setAttack(new StrongAttack());
        player.setTalk(new NormalTalk());

        player.print();
        player.doAtack();
        player.doTalk();

        npc.print();
        npc.doTalk();
        npc.doAtack();
    }
}
