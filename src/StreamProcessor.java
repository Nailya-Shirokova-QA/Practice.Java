import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessor {
    private String result;

    public StreamProcessor() {
        this.result = "";
    }

    public void processStream(Stream<String> stringStream) {
        this.result = stringStream.collect(Collectors.joining(" "));
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
