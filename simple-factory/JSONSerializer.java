public class JSONSerializer implements Serializable {
    public static String extension = "json";

    @Override
    public String serialize() {
        return "example";
    }

    @Override
    public void deserialize(String csvData) {
    }
}
