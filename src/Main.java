import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "world", "from", "Java");
        String result = StreamStringUtils.getStringFromStream(stream);
        System.out.println(result);

        StreamProcessor processor = new StreamProcessor();
        Stream<String> stream2 = Stream.of("Java", "Stream", "API");
        processor.processStream(stream2);
        System.out.println(processor.getResult());
    }
}
