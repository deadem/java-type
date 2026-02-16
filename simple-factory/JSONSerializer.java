public class JSONSerializer implements WithExtension {
    @Override
    public String getExtension() {
        return "json";
    }

    private class Impl implements Serializable {
        @Override
        public String serialize() {
            return "example-json";
        }

        @Override
        public void deserialize(String csvData) {
        }
    }

    @Override
    public Impl create() {
        return new Impl();
    }
}
