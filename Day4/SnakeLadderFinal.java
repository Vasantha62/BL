import java.util.Random;

public class SnakeLadderFinal {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WIN = 100;

    public static void main(String[] args) {

        int player1 = 0;
        int player2 = 0;

        int diceCount1 = 0;
        int diceCount2 = 0;

        int turn = 1; 

        Random random = new Random();

        while (player1 < WIN && player2 < WIN) {

            int dice = random.nextInt(6) + 1;
            int option = random.nextInt(3); 

            if (turn == 1) {

                diceCount1++;
                System.out.println("\nPlayer 1 rolled: " + dice);

                switch (option) {

                    case NO_PLAY:
                        System.out.println("Player 1: No Play");
                        break;

                    case LADDER:
                        System.out.println("Player 1: Ladder!");
                        if (player1 + dice <= 100) {
                            player1 += dice;
                        }
                        System.out.println("Player 1 position: " + player1);

                        continue;

                    case SNAKE:
                        System.out.println("Player 1: Snake!");
                        player1 -= dice;
                        if (player1 < 0) player1 = 0;
                        break;
                }
                System.out.println("Player 1 position: " + player1);
                turn = 2;
            }

            else {  

                diceCount2++;
                System.out.println("\nPlayer 2 rolled: " + dice);

                switch (option) {

                    case NO_PLAY:
                        System.out.println("Player 2: No Play");
                        break;

                    case LADDER:
                        System.out.println("Player 2: Ladder!");
                        if (player2 + dice <= 100) {
                            player2 += dice;
                        }
                        System.out.println("Player 2 position: " + player2);

                
                        continue;

                    case SNAKE:
                        System.out.println("Player 2: Snake!");
                        player2 -= dice;
                        if (player2 < 0) player2 = 0;
                        break;
                }
                System.out.println("Player 2 position: " + player2);
                turn = 1;
            }
        }

        System.out.println("===========================");
        if (player1 == 100) {
            System.out.println("Player 1 WON THE GAME!");
        } else {
            System.out.println(" Player 2 WON THE GAME!");
        }
        System.out.println("===========================");

        System.out.println("Total Dice Rolls:");
        System.out.println("Player 1: " + diceCount1);
        System.out.println("Player 2: " + diceCount2);

    }
}
