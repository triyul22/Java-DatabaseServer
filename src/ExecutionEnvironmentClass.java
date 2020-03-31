import java.util.Optional;

public class ExecutionEnvironmentClass implements ExecutionEnvironment {


    @Override
    public Optional<Database> getDatabase(String name) {
        return Optional.empty();
    }
}
