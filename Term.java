import java.util.List;

public class Term {
    final static int TERM_ROWS = 24;
    final static int TERM_COLS = 80;

    private static int maxLineWidth(List<String> lines) {
        int w = 0;
        for (String s : lines) w = Math.max(w, s.length());
        return w;
    }

    public static void render(List<String> art, int col, int row, double size, int color) {
        int h = art.size();
        int w = maxLineWidth(art);
        System.out.print(size);
        Cursor.color(color);

        int centerH = (int)(h * size / 2);
        int centerW = (int)(w * size / 2);

        for (int y = 0; y < h * size; y++) {
            for (int x = 0; x < w * size; x++) {
                int srcY = (int) Math.floor(y / size);
                int srcX = (int) Math.floor(x / size);
                if (srcY >= 0 && srcY < h && srcX >= 0 && srcX < art.get(srcY).length()) {
                    char ch = art.get(srcY).charAt(srcX);
                    if (ch != ' ') {
                        Cursor.move(row + y - centerH, col + x - centerW);
                        System.out.print(ch);
                    }
                }
            }
        }
    }
}
