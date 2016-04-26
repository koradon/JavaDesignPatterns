package command;

/**
 * Created by mics on 4/7/16.
 */
public class Client {
    private Command[] commandsTurnOn;
    private Command[] commandsTurnOff;
    Command commandUndo;

    public Client() {
        commandsTurnOn = new Command[8];
        commandsTurnOff = new Command[8];

        Command noCommand = new NoCommand();
        for(int i = 0; i< commandsTurnOn.length; i++){
            commandsTurnOn[i] = noCommand;
            commandsTurnOff[i] = noCommand;
        }
        this.commandUndo = noCommand;
    }

    public void setCommand(int slot, Command turnOn, Command turnOff){
        commandsTurnOn[slot] = turnOn;
        commandsTurnOff[slot] = turnOff;
    }

    public void pressedTurnOnButton(int slot){
        commandsTurnOn[slot].execute();
        commandUndo = commandsTurnOn[slot];
    }

    public void pressedTurnOffButton(int slot){
        commandsTurnOff[slot].execute();
        commandUndo = commandsTurnOff[slot];
    }

    public void pressedUndo(){
        commandUndo.undo();
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("\n-----Client----\n");

        for(int i=0; i<commandsTurnOn.length; i++){
            string.append("[slot " + i + "] " + commandsTurnOn[i].getClass().getName() +
            "  " + commandsTurnOff[i].getClass().getName() + "\n");
        }

        return string.toString();
    }
}
