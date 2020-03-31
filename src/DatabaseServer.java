public class DatabaseServer {
    ExecutionEnvironment environment;

    public DatabaseServer(ExecutionEnvironment env) {
        this.environment=env;
    }

    public DatabaseCommandResult executeCommand(String commandText) {

        return null;
    }

    public static void main(String[] args) {
        ExecutionEnvironment env = new ExecutionEnvironmentClass();
        DatabaseServer dbServer = new DatabaseServer(env);

        String commandString = "";
        dbServer.executeCommand(commandString);
    }
}