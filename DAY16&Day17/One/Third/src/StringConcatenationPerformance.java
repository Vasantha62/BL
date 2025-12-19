public class StringConcatenationPerformance {

    private static final int ITERATIONS = 1_000_000;

    // ---------- String ----------
    public static void stringConcat() {
        String str = "";
        long start = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            str = str + "a";
        }

        long end = System.nanoTime();
        System.out.println("String Time        : " + (end - start) / 1_000_000 + " ms");
    }

    // ---------- StringBuilder ----------
    public static void stringBuilderConcat() {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }

        long end = System.nanoTime();
        System.out.println("StringBuilder Time : " + (end - start) / 1_000_000 + " ms");
    }

    // ---------- StringBuffer ----------
    public static void stringBufferConcat() {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }

        long end = System.nanoTime();
        System.out.println("StringBuffer Time  : " + (end - start) / 1_000_000 + " ms");
    }

    public static void main(String[] args) {

        System.out.println("Concatenating " + ITERATIONS + " strings\n");

        stringBuilderConcat(); // fast
        stringBufferConcat();  // thread-safe
        stringConcat();        // very slow
    }
}
