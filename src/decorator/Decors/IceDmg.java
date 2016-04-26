package decorator.Decors;

import decorator.Characters.Character;

/**
 * Created by mics on 4/7/16.
 */
public class IceDmg extends bonusDecor {
    Character c;

    public IceDmg(Character c) {
        this.c = c;
    }

    @Override
    public String getDsc() {
        return c.getDsc() + "\n with Ice Bonus +15% to base damage, " +
                "damage: " + this.damage();
    }

    @Override
    public double damage() {
        return c.damage() + 0.15*c.damage();
    }
}
