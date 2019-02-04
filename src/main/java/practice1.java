import java.util.Objects;
import java.util.stream.Stream;

class practice1 {

    public static Integer getFirstEven(Stream<Integer> stream) {
        return stream.filter(integer -> integer % 2 == 0).findFirst().get();
    }

    public static String getFirstEvenString(Stream<Integer> stream) {
        return stream.filter(integer -> integer % 2 == 0).findFirst().map(Objects::toString).orElse("NONE");
    }

    public static String getFirstOddString(Stream<Integer> stream) {
        return stream.filter(integer -> integer % 2 != 0).findFirst().map(Objects::toString).orElse("NONE");
    }
}