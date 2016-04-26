package decorator;

import decorator.Characters.Character;
import decorator.Characters.Enemy;
import decorator.Characters.Player;
import decorator.Decors.FireDmg;
import decorator.Decors.IceDmg;

/**
 * Created by mics on 4/7/16.
 */
public class Main {
    public static void main(String[] args){
        Character player = new Player();
        Character enemy = new Enemy();
        System.out.println(player.getDsc());
        System.out.println(enemy.getDsc());

        player = new FireDmg(player);
        System.out.println(player.getDsc());

        enemy = new IceDmg(enemy);
        System.out.println(enemy.getDsc());

        System.out.println("\nPlayer gets Ice Damage too!");
        player = new IceDmg(player);
        System.out.println(player.getDsc());
    }
}
