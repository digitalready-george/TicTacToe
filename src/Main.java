public class Main {
    /*
    The program's entrypoint to play a game of TicTacToe.
    Using a combination of methods you write and provided methods
    you will be tasked with creating a functioning interactive TicTacToe game.

    Note: Do not start until the necessary methods in Player and Board are completed.
     */
    static GameState game = new GameState();

    public static void main(String[] args) {
        // Each iteration of this loop represents one game of TicTacToe
        while (true) {
            // Each iteration of this while loop represents one turn of TicTacToe.
            while (!game.isOver()) {
                /* TODO: Implement TicTacToe turn logic.
                 * Each iteration of this while loop represents one turn of TicTacToe.
                 *
                 * Every turn, the game should display the current board to the user,
                 * announce which player's turn it is,
                 * and prompt that user to take a turn.
                 *
                 * If the user asks for an invalid position
                 * (not 1-9 or the position is already filled)
                 * ask the user to try again.
                 *
                 * Once the player inputs a valid move,
                 * apply the move to the board,
                 * and cycle the game to the next player (with game.nextPlayer()).
                 *
                 * If a move wins the game, it will terminate this loop.
                 */
            }
            /* TODO: Display end game information and update scores
             * Show the final game state and tell the user if the
             * winner was "X", "O", or a draw. Give a point to the
             * winning player, (using game.addPointToWinningPlayer)
             * and display current scores.
             *
             * Functionality has already been implemented to ask the user
             * if they would like to play again.
             */

            /* TODO: Ask the user if they would like to play again
             * If the user says "Y", use game.newGame() to restart the board.
             * If the user says "N", break out of the game loop.
             */
        }
    }
}
