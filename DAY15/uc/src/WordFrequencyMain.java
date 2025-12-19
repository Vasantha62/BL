public class WordFrequencyMain {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        // Convert sentence to lowercase and split into words
        String[] words = sentence.toLowerCase().split("\\s+");

        // Create LinkedList-based HashMap
        MyLinkedHashMap<String, Integer> map = new MyLinkedHashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Print word frequencies
        System.out.println("Word frequencies:");
        map.printMap();
    }
}
