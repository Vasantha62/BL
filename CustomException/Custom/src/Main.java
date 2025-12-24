public class Main {

    public static void main(String[] args) {

        try {
            MoodAnalyser analyser = new MoodAnalyser("I am in Happy Mood");
            System.out.println(analyser.analyseMood());

        } catch (MoodAnalysis e) {
            System.out.println("Invalid Mood Entered");
            System.out.println("Error Type : " + e.type);
            System.out.println("Message    : " + e.getMessage());
        }
    }
}
