package tuesday.command;

import tuesday.task.Task;
import tuesday.util.Storage;
import tuesday.util.Ui;

/**
 * Represents a command to find a task in the list of tasks
 */
public class FindCommand extends Command {
    private final String commandPostfix;
    private String responseMessage;

    /**
     * Constructor for FindCommand
     *
     * @param command Description of the command
     * @param commandPostfix The postfix of the command
     */
    public FindCommand(String command, String commandPostfix) {
        super(command);
        this.commandPostfix = commandPostfix;
    }

    public void execute(Task task, Ui ui, Storage storage) {
        this.responseMessage = ui.showFindMessage(this.commandPostfix);
    }

    public String getString() {
        return this.responseMessage;
    }

    public boolean isExit() {
        return false;
    }
}
