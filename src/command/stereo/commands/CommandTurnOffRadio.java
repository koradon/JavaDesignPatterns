package command.stereo.commands;

import command.Command;
import command.stereo.Stereo;

/**
 * Created by mics on 4/7/16.
 */
public class CommandTurnOffRadio implements Command {
    Stereo stereo;

    public CommandTurnOffRadio(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute(){
        stereo.turnOffRadio();
    }

    @Override
    public void undo() {
        stereo.wakeUp();
        stereo.turnOnRadio();
    }
}
