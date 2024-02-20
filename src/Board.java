public class Board {
    /* A class representation of a TicTacToe board.
    The board is a 9 element array. The constructor (provided)
    initializes these values to the strings "1", "2", ... "9".
    When a player makes a move on the board, that element in the
    array should be replaced by "X" or "O" respectively.
    https://en.wikipedia.org/wiki/Tic-tac-toe

    Complete the isEmptyPosition(pos), displayBoard(), winner(),
    and applyMove(move) methods.
    */
    public String[] board = new String[9];

    /**
    * The board is initialized to hold strings containing numbers
    * ["1" "2" "3" "4" "5" "6" "7" "8" "9"]
    */
    public Board() {
        for (int a = 0; a < 9; a++) {
            this.board[a] = String.valueOf(a + 1);
        }
    }

    /**
     * // TODO: Return if the desired position has not been filled yet.
     * @param pos the desired position 1-9
     * @return true if an X or O has already been placed at the position,
     *         or false a number is at the position.
     */
    public boolean isEmptyPosition(int pos) {

    }

    /**
     * TODO: Display the current board in the console.
     */
    public void displayBoard() {
        /* An example of what an in progress game may look like:
        |---|---|---|
        | 1 | X | O |
        |-----------|
        | 4 | 5 | X |
        |-----------|
        | 7 | 8 | O |
        |---|---|---|
         */
    }

    /**
     * TODO: Return the winner of the game or null.
     * @return "X" or "O" if a respective player has achieved 3 in a row,
     *         "draw" if the board is full and no player won,
     *         or null if there is no winner.
     */
    public String winner() {

    }

    /**
     * TODO: Apply a given move to the board.
     * @param move contains the player's symbol (move.player.symbol)
     *             and the location they'd like to place it (move.pos).
     */
    public void applyMove(Move move) {

    }
}
