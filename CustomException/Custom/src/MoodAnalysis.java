public class MoodAnalysis extends Exception {

    public enum ExceptionType {
        NULL_MOOD,
        EMPTY_MOOD
    }

    public ExceptionType type;

    public MoodAnalysis(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
