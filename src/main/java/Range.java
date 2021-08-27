public class Range {

    public String input;

    public Range(String rangeText) {
        this.input = rangeText;
    }

    public boolean isStartWithInclusive() {
        return input.startsWith("[");
    }
}
