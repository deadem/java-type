import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void sleepMs(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Cursor.hide();

        String line = "";
        int x = Term.TERM_COLS / 2;
        int y = Term.TERM_ROWS / 2;

        for (char c : input.toCharArray()) {
            List<String> letter = Letters.letter(c);

            if (letter.size() > 0) {
                for (double i = 2; i < 52; i *= 1.2) {
                    Cursor.clearScreen();
                    Cursor.move(y, x);
                    System.out.print(line);
                    Term.render(letter, x + line.length(), y, 8.0 / i, 86);
                    sleepMs(7);
                }
            }
            line += Character.toUpperCase(c);
            Cursor.move(y, x);
            System.out.print(line);
        }

        Cursor.show();
        Cursor.move(Term.TERM_ROWS, 1);
        Cursor.resetColor();
        System.out.println();
    }
}
