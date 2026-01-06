
import java.util.HashMap;
import java.util.Map;

/**
 * UC5 – Banner Using Map Collection
 *
 * This use case uses Java Collection Framework
 * (Map and HashMap) to print the OOPS banner.
 *
 * @author Vasantha
 * @version 1.0
 */
public class UC5{

    public static void main(String[] args) {

        // Map to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', getOPattern());
        patternMap.put('P', getPPattern());
        patternMap.put('S', getSPattern());

        String word = "OOPS";

        // Printing banner using Map lookup
        for (int row = 0; row < 9; row++) {
            for (char ch : word.toCharArray()) {
                System.out.print(patternMap.get(ch)[row] + " ");
            }
            System.out.println();
        }
    }

    private static String[] getOPattern() {
        return new String[]{
                "  ******  ",
                " **    ** ",
                "**      **",
                "**      **",
                "**      **",
                "**      **",
                "**      **",
                " **    ** ",
                "  ******  "
        };
    }

    private static String[] getPPattern() {
        return new String[]{
                "*********  ",
                "**     ** ",
                "**     ** ",
                "**     **",
                "********  ",
                "**         ",
                "**         ",
                "**         ",
                "**         "
        };
    }

    private static String[] getSPattern() {
        return new String[]{
                "   *****  ",
                " **       ",
                "**        ",
                "  **      ",
                "    ***   ",
                "       ** ",
                "        **",
                "       **",
                "  *****   "
        };
    }
}
