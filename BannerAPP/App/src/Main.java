

/**
 * OOPS Banner Application
 *
 * Prints the full form and banner of OOPS
 * using multiple use cases.
 *
 * @author Vasantha
 * @version 1.0
 */
public class Main
{

    public static void Uc1()
    {
        System.out.println("\"OOPS\" Object Oriented Programming System\n");
    }

    public static void Uc2() {

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

        String[] S =
                {
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

        for (int i = 0; i < O.length; i++) {
            System.out.println(
                    O[i] + "   " +
                            O[i] + "   " +
                            P[i] + "   " +
                            S[i]
            );
        }
    }

    private static void Uc3()
    {

        String[][] patterns =
                {
                        getOPattern(),
                        getOPattern(),
                        getPPattern(),
                        getSPattern()
                };

        printBanner(patterns);
    }

    private static void printBanner(String[][] patterns)
    {
        int rows = patterns[0].length;

        for (int i = 0; i < rows; i++)
        {
            String line = "";
            for (int j = 0; j < patterns.length; j++)
            {
                line = line + patterns[j][i] + "   ";
            }
            System.out.println(line);
        }
    }

    private static String[] getOPattern()
    {
        return new String[]
                {
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

    private static String[] getPPattern()
    {
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

    private static String[] getSPattern()
    {
        return new String[]
                {

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

    public static void main(String[] args)
    {
        Uc1();
        Uc2();
        Uc3();
    }
}