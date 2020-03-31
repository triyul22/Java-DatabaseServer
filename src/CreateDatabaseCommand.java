public class CreateDatabaseCommand implements DatabaseCommand {
    DatabaseCommand command;

    CreateDatabaseCommand() {
        command = new CreateDatabaseCommand();
    }

    @Override
    public Object execute() {
        return null;
    }
}
