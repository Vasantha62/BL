public class Main {

    public static void main(String[] args) {

        String phrase = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = phrase.toLowerCase().split("\\s+");

        MyHashMap<String, Integer> map = new MyHashMap<>();

        // Add words
        for (String word : words) {
            map.put(word);
        }

        // Remove "avoidable"
        map.remove("avoidable");

        // Display remaining words
        map.display();
    }
}
