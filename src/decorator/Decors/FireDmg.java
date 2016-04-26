package decorator.Decors;

import decorator.Characters.Character;

/**
 * Created by mics on 4/7/16.
 */
public class FireDmg extends bonusDecor {
    Character c;

    public FireDmg(Character c) {
        this.c = c;
    }

    @Override
    public String getDsc() {
        return c.getDsc() + "\n with Fire Bonus +10% to base damage, " +
                "damage: " + this.damage();
    }

    @Override
    public double damage() {
        return c.damage() + 0.1*c.damage();
    }
}
