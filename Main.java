import Utils.Alg;
import Utils.MatrixToMassiv;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    static final String PATH = "C:\\Users\\ццц\\OneDrive\\Документы\\GitHub\\Semestrovka-1\\data\\File";

    public static void main(String[] args) {
        try {
            PrintStream stream = new PrintStream(new File("C:\\Users\\ццц\\OneDrive\\Документы\\GitHub\\Semestrovka-1\\Output.txt"));
            for (int i = 1; i < 150; i++) {
                int[][] matrix = MatrixToMassiv.convert(new File(PATH + i + ".txt"));
                long start = System.currentTimeMillis();
                long iter = Alg.floyd_warshall(matrix);
                long time = System.currentTimeMillis() - start; // время затраченное на работу агоритма
                stream.print(matrix.length + " " + iter + " " + time + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}