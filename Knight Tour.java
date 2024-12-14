public class KnightJumps {

    public static int knightJumps(String str) {
        // Parse the input string to extract x and y
        str = str.substring(1, str.length() - 1); // Remove parentheses
        String[] position = str.split(" ");
        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);

        // Define all possible knight moves
        int[][] moves = {
            {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
            {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        // Count valid moves
        int validMoves = 0;
        for (int i = 0; i < moves.length; i++) {
            int newX = x + moves[i][0];
            int newY = y + moves[i][1];
            
            // Check if the move is within the bounds of the chessboard
            if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                validMoves++;
            }
        }

        return validMoves;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(knightJumps("(4 5)")); // Output: 8
    }
}
