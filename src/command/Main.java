package command;

import command.fans.commands.*;
import command.fans.Fans;
import command.lights.Lights;
import command.lights.commands.CommandTurnOffLights;
import command.lights.commands.CommandTurnOnLights;
import command.stereo.Stereo;
import command.stereo.commands.CommandTurnOffRadio;
import command.stereo.commands.CommandTurnOnRadio;

/**
 * Created by mics on 4/7/16.
 */
public class Main {
    public static void main(String[] args){
        Client client = new Client();

        Fans fans = new Fans("Living Room");
        Lights lights = new Lights();
        Stereo stereo = new Stereo();

        CommandTurnOnFans turnOnFans = new CommandTurnOnFans(fans);
        CommandTurnOffFans turnOffFans = new CommandTurnOffFans(fans);
        CommandSetSpeed0 setSpeed0 = new CommandSetSpeed0(fans);
        CommandSetSpeed1 setSpeed1 = new CommandSetSpeed1(fans);
        CommandSetSpeed2 setSpeed2 = new CommandSetSpeed2(fans);
        CommandSetSpeed3 setSpeed3 = new CommandSetSpeed3(fans);

        CommandTurnOnLights turnOnLights = new CommandTurnOnLights(lights);
        CommandTurnOffLights turnOffLights = new CommandTurnOffLights(lights);

        CommandTurnOnRadio turnOnRadio = new CommandTurnOnRadio(stereo);
        CommandTurnOffRadio turnOffRadio = new CommandTurnOffRadio(stereo);

        Command[] makroTurnOn = {turnOnFans, turnOnLights, turnOnRadio};
        Command[] makroTurnOff = {turnOffFans, turnOffLights, turnOffRadio};
        CommandMakro makroTurnOnAll = new CommandMakro(makroTurnOn);
        CommandMakro makroTurnOffAll = new CommandMakro(makroTurnOff);

        client.setCommand(0, turnOnFans, turnOffFans);
        client.setCommand(1, setSpeed0, turnOffFans);
        client.setCommand(2, setSpeed1, turnOffFans);
        client.setCommand(3, setSpeed2, turnOffFans);
        client.setCommand(4, setSpeed3, turnOffFans);
        client.setCommand(5, turnOnLights, turnOffLights);
        client.setCommand(6, turnOnRadio, turnOffRadio);
        client.setCommand(7, makroTurnOnAll, makroTurnOffAll);


        System.out.println(client);
        client.pressedTurnOnButton(0);
        client.pressedTurnOffButton(0);
        client.pressedTurnOnButton(1);
        client.pressedTurnOffButton(1);
        client.pressedUndo();
        client.pressedTurnOnButton(2);
        client.pressedTurnOffButton(2);
        client.pressedUndo();
        client.pressedTurnOnButton(3);
        client.pressedTurnOffButton(3);
        client.pressedUndo();
        client.pressedTurnOnButton(4);
        client.pressedTurnOffButton(4);
        client.pressedUndo();
        client.pressedTurnOnButton(5);
        client.pressedTurnOffButton(5);
        client.pressedUndo();
        client.pressedTurnOnButton(6);
        client.pressedTurnOffButton(6);
        client.pressedUndo();

        System.out.println();
        System.out.println("Makro test");
        client.pressedTurnOnButton(7);
        client.pressedTurnOffButton(7);
        client.pressedUndo();
    }
}
