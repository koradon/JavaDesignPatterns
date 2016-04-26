package command.fans.commands;

import command.Command;
import command.fans.Fans;

/**
 * Created by mics on 4/7/16.
 */
public class CommandTurnOffFans implements Command {
    Fans fans;

    public CommandTurnOffFans(Fans fans) {
        this.fans = fans;
    }

    @Override
    public void execute() {
        fans.turnOff();
    }

    @Override
    public void undo() {
        fans.turnOn();
    }
}
