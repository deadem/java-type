import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.ArrayList;

class FactorySerializer {
    static private List<Class<? extends Serializable>> serializers = List.of(
        CSVSerializer.class,
        JSONSerializer.class
    );

    static public Serializable create(String filename) throws ClassNotFoundException {
        String ext = filename.contains(".")
            ? filename.substring(filename.lastIndexOf('.') + 1)
            : "";

        for (Class<? extends Serializable> current : serializers) {
            try {
                if (ext.equals(current.getField("extension").get(null))) {
                    return current.getDeclaredConstructor().newInstance();
                }
            } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
                // Skip errors
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
