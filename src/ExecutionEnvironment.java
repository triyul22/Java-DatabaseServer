import java.util.Optional;

interface ExecutionEnvironment {
    Optional<Database> getDatabase(String name);
}
