package composition.characters;

import composition.actions.attack.AttackInterface;
import composition.actions.talk.TalkInterface;

/**
 * Created by mics on 4/5/16.
 */
public abstract class Character {
    AttackInterface attackInterface;
    TalkInterface talkInterface;


    public void move(){
        System.out.println("moved");
    };

    public abstract void print();

    public void doAtack(){
        System.out.println("attacking");
        attackInterface.attack();
    };
    public void doTalk(){
        System.out.println("talking");
        talkInterface.talk();
    };
    public void setAttack(AttackInterface a){
        attackInterface = a;
    };
    public void setTalk(TalkInterface t){
        talkInterface = t;
    };
}
