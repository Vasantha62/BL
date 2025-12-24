public class MoodAnalyser {

    private String message;

    // Default Constructor
    public MoodAnalyser() {
    }

    // Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Analyse mood using message field
    public String analyseMood() throws MoodAnalysis {

        if (message == null) {
            throw new MoodAnalysis(
                    MoodAnalysis.ExceptionType.NULL_MOOD,
                    "Mood is NULL");
        }

        if (message.length() == 0) {
            throw new MoodAnalysis(
                    MoodAnalysis.ExceptionType.EMPTY_MOOD,
                    "Mood is EMPTY");
        }

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }

        return "HAPPY";
    }
}
