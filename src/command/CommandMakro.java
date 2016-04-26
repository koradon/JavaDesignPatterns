package command;

/**
 * Created by mics on 4/8/16.
 */
public class CommandMakro implements Command {
    Command[] commands;

    public CommandMakro(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command c : commands){
            c.execute();
        }
    }

    @Override
    public void undo() {
        for(Command c : commands){
            c.undo();
        }
    }
}
