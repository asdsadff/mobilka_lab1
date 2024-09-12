import java.util.Random;
import java.util.Scanner;

public class MatrixTransformation {
    private int N;
    private int[][] matrix;

    public void enterDimentionality() {
        System.out.println("Введіть вимірність матриці: ");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        matrix = new int[N][N];
    }

    public void showCredentials() {
        System.out.println("Струтинський М.В");
    }

    public void fillMatrix() {
        System.out.println("Стандартна матриця");
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = rand.nextInt(20);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

    public void rotateMatrix() {
        System.out.println("Обернена матриця");
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[rows - 1 - i][cols - 1 - j] = matrix[i][j];
            }
        }

        matrix = rotatedMatrix;
    }
}
