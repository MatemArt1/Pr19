import java.util.stream.IntStream;
public class Like19 {
    public class Kata {

        public static int[] incrementer(int[] numbers) {
            return IntStream.range(0, numbers.length).map(i -> (numbers[i] + i + 1) % 10).toArray();
        }
    }
}
