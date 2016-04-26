package command;

/**
 * Created by mics on 4/7/16.
 */
public interface Command {
    public void execute();
    public void undo();
}
