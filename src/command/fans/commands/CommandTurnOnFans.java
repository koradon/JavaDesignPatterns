package command.fans.commands;

import command.Command;
import command.fans.Fans;

/**
 * Created by mics on 4/7/16.
 */
public class CommandTurnOnFans implements Command {
    Fans fans;

    public CommandTurnOnFans(Fans fans) {
        this.fans = fans;
    }

    @Override
    public void execute() {
        fans.turnOn();
    }

    @Override
    public void undo() {
        fans.turnOn();
    }
}
