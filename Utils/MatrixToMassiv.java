package Utils;

import java.io.*;

public class MatrixToMassiv {
    public static int[][] convert(File file) throws IOException {
        Reader input = new FileReader(file);
        BufferedReader inp = new BufferedReader(input);
        int size = Integer.parseInt(inp.readLine()); // размер макрицы из строки перевели в инт
        int[][] matrix =  new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            String[] a = inp.readLine().split(" "); // считываем строку и делим ее по пробелу и добавляем в массив
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(a[j]); // приравнивает эллементу интовое значение из массива выше
            }
        }
        return matrix;
    } // метод, отвечающий за получение матрицы из файла
}
