import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.stream.IntStream;

public class Ldn {
    public static void main(String[] args) {

        var timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
        IntStream.range(1, 10000).forEach(num -> System.out.println(LocalTime.now().format(timeFormat) + " " + num));

    }
}
