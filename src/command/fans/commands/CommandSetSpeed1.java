package command.fans.commands;

import command.Command;
import command.fans.Fans;

/**
 * Created by mics on 4/7/16.
 */
public class CommandSetSpeed1 implements Command {
    Fans fans;
    int lastSpeed;

    public CommandSetSpeed1(Fans fans) {
        this.fans = fans;
    }

    @Override
    public void execute() {
        lastSpeed = fans.getSpeed();
        fans.turnSpeed1();
    }

    @Override
    public void undo() {
        if(lastSpeed == Fans.SPEED3){
            fans.turnSpeed3();
        } else if (lastSpeed == Fans.SPEED2){
            fans.turnSpeed2();
        } else if (lastSpeed == Fans.SPEED1){
            fans.turnSpeed1();
        } else if (lastSpeed == Fans.SPEED0){
            fans.turnSpeed0();
        }
    }
}
