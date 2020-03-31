import java.util.Optional;

public interface DatabaseCommandResult {
    Optional<String> getResult();

    DatabaseCommandStatus getStatus();

    boolean isSuccess();

    String getErrorMessage();

    enum DatabaseCommandStatus {
        SUCCESS, FAILED
    }

    class DatabaseCommandResultInnerClass implements DatabaseCommandResult{

        @Override
        public Optional<String> getResult() {
            return Optional.empty();
        }

        @Override
        public DatabaseCommandStatus getStatus() {
            return null;
        }

        @Override
        public boolean isSuccess() {
            return false;
        }

        @Override
        public String getErrorMessage() {
            return null;
        }
    }
}