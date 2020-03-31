public interface Database {
    String getName();

    void createTableIfNotExists(String tableName);

    void createTableIfNotExists(String tableName, int segmentSizeInBytes);

    void write(String tableName, String objectKey, String objectValue);

    String read(String tableName, String objectKey);
}

