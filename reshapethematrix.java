
    import java.util.*;

public class reshapethematrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // If reshape is not possible, return original matrix
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return result;
    }

    // Test the function
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2},
            {3, 4}
        };
        int r = 1, c = 4;

        int[][] reshaped = matrixReshape(mat, r, c);

        System.out.println("Reshaped Matrix:");
        for (int[] row : reshaped) {
            System.out.println(Arrays.toString(row));
        }
    }
}

