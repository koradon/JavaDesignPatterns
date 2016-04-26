package command.lights.commands;

import command.Command;
import command.lights.Lights;

/**
 * Created by mics on 4/7/16.
 */
public class CommandTurnOffLights implements Command {
    Lights lights;

    public CommandTurnOffLights(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOff();
    }

    @Override
    public void undo() {
        lights.turnOn();
    }
}
