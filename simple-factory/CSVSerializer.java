public class CSVSerializer implements Serializable {
    public static String extension = "csv";

    @Override
    public String serialize() {
        return "example";
    }

    @Override
    public void deserialize(String csvData) {
    }
}
