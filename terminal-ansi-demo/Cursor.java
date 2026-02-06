public class Cursor {
    public static void clearScreen() {
        // Clear screen + move cursor home
        System.out.print("\u001B[2J\u001B[H");
    }

    public static void move(int row, int col) {
        System.out.print("\u001B[" + row + ";" + col + "H");
    }

    public static void show() {
        System.out.print("\u001B[?25h");
    }

    public static void hide() {
        System.out.print("\u001B[?25l");
    }

    public static void resetColor() {
        System.out.print("\u001B[0m");
    }

    public static void color(int color) {
        // 256-color foreground: ESC[38;5;<n>m
        System.out.print("\u001B[38;5;" + color + "m");
    }
}
