package Utils;

public class Alg {
    public static long floyd_warshall(int[][] matrix) {
        long iteration = 0;
        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    iteration++;
                    if (matrix[i][j] > matrix[i][k] + matrix[k][j] && k != i && k != j) {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }
        return iteration;
    }
}
