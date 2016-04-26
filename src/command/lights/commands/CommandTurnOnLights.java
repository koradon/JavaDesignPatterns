package command.lights.commands;

import command.Command;
import command.lights.Lights;

/**
 * Created by mics on 4/7/16.
 */
public class CommandTurnOnLights implements Command {
    Lights lights;

    public CommandTurnOnLights(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOn();
    }

    @Override
    public void undo() {
        lights.turnOff();
    }
}
