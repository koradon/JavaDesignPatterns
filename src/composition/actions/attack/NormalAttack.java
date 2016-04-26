package composition.actions.attack;

/**
 * Created by mics on 4/5/16.
 */
public class NormalAttack implements AttackInterface{
    @Override
    public void attack() {
        System.out.println("    normal attack");
    }
}
