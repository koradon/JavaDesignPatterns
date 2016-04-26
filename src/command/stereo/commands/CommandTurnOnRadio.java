package command.stereo.commands;

import command.Command;
import command.stereo.Stereo;

/**
 * Created by mics on 4/7/16.
 */
public class CommandTurnOnRadio implements Command {
    Stereo stereo;

    public CommandTurnOnRadio(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.wakeUp();
        stereo.turnOnRadio();
    }

    @Override
    public void undo() {
        stereo.turnOffRadio();
    }
}
