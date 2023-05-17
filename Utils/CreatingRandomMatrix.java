package Utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class CreatingRandomMatrix {
    static final int infinity = 999999999; // бесконечность
    static final double infinityprobability = 0.3; // вероятность появления бесконечности

    static int[][] matrixgenerator(int size, int maxValue) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i != j) {
                    if (Math.random() < infinityprobability) {
                        matrix[i][j] = infinity;
                    } else {
                        matrix[i][j] = (int) (Math.random() * maxValue) + 1;
                    }
                } else {
                    matrix[i][j] = 0; // заполняет диагональ нулями
                }
            }
        }
        return matrix;
    } // метод, который создает рандомную матрицу смежности

    public static void main(String[] args) throws IOException {
        for (int i = 1; i < 150; i++) { // генерация файлов
            File c = new File("C:\\Users\\ццц\\OneDrive\\Документы\\GitHub\\Semestrovka-1\\data\\File" + i + ".txt");
            PrintStream stream = new PrintStream(c); // открывает файлы для заполнения
            int[][] matrix = matrixgenerator(i * 10, i * 10); // получаем рандоную матрицу с помощью метода выше
            stream.print(matrix.length + "\n"); // пишет размер матрицы
            for (int j = 0; j < matrix.length; j++) { // записывает саму матрицу в файл
                for (int k = 0; k < matrix[j].length; k++) {
                    stream.print(matrix[j][k] + " ");
                }
                stream.print('\n');
            }
        }
    }
}
