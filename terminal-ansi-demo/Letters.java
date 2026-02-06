import java.util.List;

class Letters {
    static List<String> letter(char c) {
        c = Character.toUpperCase(c);

        return switch (c) {
            case 'A' -> List.of(
                " █ ",
                "█ █",
                "███",
                "█ █",
                "█ █"
            );
            case 'B' -> List.of(
                "██ ",
                "█ █",
                "██ ",
                "█ █",
                "██ "
            );
            case 'C' -> List.of(
                " ██",
                "█  ",
                "█  ",
                "█  ",
                " ██"
            );
            case 'D' -> List.of(
                "██ ",
                "█ █",
                "█ █",
                "█ █",
                "██ "
            );
            case 'E' -> List.of(
                "███",
                "█  ",
                "██ ",
                "█  ",
                "███"
            );
            case 'F' -> List.of(
                "███",
                "█  ",
                "██ ",
                "█  ",
                "█  "
            );
            case 'G' -> List.of(
                " ██",
                "█  ",
                "█ █",
                "█ █",
                " ██"
            );
            case 'H' -> List.of(
                "█ █",
                "█ █",
                "███",
                "█ █",
                "█ █"
            );
            case 'I' -> List.of(
                "███",
                " █ ",
                " █ ",
                " █ ",
                "███"
            );
            case 'J' -> List.of(
                " ██",
                "  █",
                "  █",
                "█ █",
                " █ "
            );
            case 'K' -> List.of(
                "█ █",
                "█ █",
                "██ ",
                "█ █",
                "█ █"
            );
            case 'L' -> List.of(
                "█  ",
                "█  ",
                "█  ",
                "█  ",
                "███"
            );
            case 'M' -> List.of(
                "█ █",
                "███",
                "███",
                "█ █",
                "█ █"
            );
            case 'N' -> List.of(
                "█ █",
                "███",
                "███",
                "███",
                "█ █"
            );
            case 'O' -> List.of(
                " █ ",
                "█ █",
                "█ █",
                "█ █",
                " █ "
            );
            case 'P' -> List.of(
                "██ ",
                "█ █",
                "██ ",
                "█  ",
                "█  "
            );
            case 'Q' -> List.of(
                " █ ",
                "█ █",
                "█ █",
                "█ █",
                " ██"
            );
            case 'R' -> List.of(
                "██ ",
                "█ █",
                "██ ",
                "█ █",
                "█ █"
            );
            case 'S' -> List.of(
                " ██",
                "█  ",
                " █ ",
                "  █",
                "██ "
            );
            case 'T' -> List.of(
                "███",
                " █ ",
                " █ ",
                " █ ",
                " █ "
            );
            case 'U' -> List.of(
                "█ █",
                "█ █",
                "█ █",
                "█ █",
                " ██"
            );
            case 'V' -> List.of(
                "█ █",
                "█ █",
                "█ █",
                "███",
                " █ "
            );
            case 'W' -> List.of(
                "█ █",
                "█ █",
                "███",
                "███",
                "█ █"
            );
            case 'X' -> List.of(
                "█ █",
                "█ █",
                " █ ",
                "█ █",
                "█ █"
            );
            case 'Y' -> List.of(
                "█ █",
                "█ █",
                " █ ",
                " █ ",
                " █ "
            );
            case 'Z' -> List.of(
                "███",
                "  █",
                " █ ",
                "█  ",
                "███"
            );
            default -> List.of("");
        };
    }
}
