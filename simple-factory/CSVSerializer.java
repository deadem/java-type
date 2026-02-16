public class CSVSerializer implements WithExtension {
    @Override
    public String getExtension() {
        return "csv";
    }

    private class Impl implements Serializable {
        @Override
        public String serialize() {
            return "example-csv";
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
