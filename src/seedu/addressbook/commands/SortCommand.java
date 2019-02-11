package seedu.addressbook.commands;

/**
 * Sorts the list of people in the address book
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts the list of people in the address book. "
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_SUCCESS = "Address book has been sorted!";

    @Override
    public CommandResult execute() {
        addressBook.sortPersonList();
        return new CommandResult(MESSAGE_SUCCESS);
    }

}
