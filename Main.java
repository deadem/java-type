import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void sleepMs(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws IOException {
        List<List<String>> frames = new ArrayList<>();

        frames.add(List.of(
                "███",
                "█",
                "███",
                "█",
                "███"
        ));

        final int frameDelayMs = 5;
        final int holdLastMs = 1500;

        Cursor.hide();

        for (double i = 2; i < 52; i *= 1.2) {
            Cursor.clearScreen();
            Term.render(frames.get(0), Term.TERM_COLS / 2, Term.TERM_ROWS / 2, 8.0 / i, 86);
            sleepMs(frameDelayMs);
        }

        Cursor.show();

        Cursor.move(Term.TERM_ROWS, 1);
        Cursor.resetColor();
        System.out.println();
    }
}
