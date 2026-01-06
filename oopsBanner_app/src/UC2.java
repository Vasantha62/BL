
/**
 * UC2 – Hardcoded OOPS Banner
 *
 * This use case prints the OOPS banner
 * using hardcoded string arrays and loops.
 *
 * @author Vasantha
 * @version 1.0
 */
public class UC2 {

    public static void main(String[] args) {

        // Pattern for letter O
        String[] O = {
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

        // Pattern for letter P
        String[] P = {
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

        // Pattern for letter S
        String[] S = {
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

        // Loop to print banner row by row
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}
