import java.util.List;
import java.util.ArrayList;

class FactorySerializer {
    static private List<WithExtension> serializers = List.of(
        new CSVSerializer(),
        new JSONSerializer()
    );

    static public Serializable create(String filename) throws ClassNotFoundException {
        String ext = filename.contains(".")
            ? filename.substring(filename.lastIndexOf('.') + 1)
            : "";

        for (WithExtension current : serializers) {
            if (ext.equals(current.getExtension())) {
                return current.create();
            }
        }
        throw new ClassNotFoundException(filename);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            System.out.println("create: " + FactorySerializer.create("file.csv"));
        } catch (ClassNotFoundException e) {
            System.out.println("Fatal error: " + e);
        }
    }
}
