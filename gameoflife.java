public class gameoflife {
    

    public static void main(String[] args) {
        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        System.out.println("Original Board:");
        printBoard(board);

        gameOfLife(board);

        System.out.println("\nNext State:");
        printBoard(board);
    }

    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[] dirs = {-1, 0, 1};

        // Step 1: Apply transition rules
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                for (int x : dirs) {
                    for (int y : dirs) {
                        if (x == 0 && y == 0) continue;
                        int r = i + x, c = j + y;
                        if (r >= 0 && r < m && c >= 0 && c < n && Math.abs(board[r][c]) == 1) {
                            liveNeighbors++;
                        }
                    }
                }

                // Rule 1 or 3: live cell dies
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = -1;
                }

                // Rule 4: dead cell becomes live
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 2;
                }
            }
        }

        // Step 2: Finalize the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] > 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    // Helper method to print the board
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

